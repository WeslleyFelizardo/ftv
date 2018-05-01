/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import java.beans.PropertyVetoException;
import javax.persistence.EntityManagerFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 *
 * @author wfeli
 */
@Configuration
@EnableJpaRepositories(basePackages = "com.example.futevolei.repositories")
@EnableTransactionManagement
@PropertySource(value = "classpath:/application.properties")
public class AppConfiguration {
    
    @Bean
    public PlatformTransactionManager transactionManager(EntityManagerFactory factory) {
        JpaTransactionManager manager = new JpaTransactionManager();
        
        manager.setEntityManagerFactory(factory);
        manager.setJpaDialect(new HibernateJpaDialect());
        
        return manager;
    }
    
    @Bean
    public HibernateJpaVendorAdapter jpaVendorAdapter() {
        HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
        
        adapter.setShowSql(true);
        adapter.setGenerateDdl(true);
        
        return adapter;
    }
    
    @Bean
    public EntityManagerFactory entityManagerFactory() throws PropertyVetoException {
        LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
        
        factory.setJpaVendorAdapter(jpaVendorAdapter());
        factory.setPackagesToScan("com.example.futevolei.entities");
        factory.setDataSource(dataSource());
        factory.afterPropertiesSet();
        
        return factory.getObject();
    }
    
    @Bean(name = "dataSource")
    public ComboPooledDataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource dataSource = new ComboPooledDataSource("teste");
        
        dataSource.setJdbcUrl("jdbc:mysql://localhost:3306/ftv");
        dataSource.setUser("root");
        dataSource.setPassword("123456");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setMinPoolSize(Integer.parseInt("5"));
        dataSource.setMaxPoolSize(Integer.parseInt("20"));
        dataSource.setMaxIdleTime(Integer.parseInt("600"));
        
        return dataSource;
    }
    
    
}
