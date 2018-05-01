package com.example.futevolei.security.services;

import com.example.futevolei.entities.Athlete;
import com.example.futevolei.security.JwtUserFactory;
import com.example.futevolei.services.AthleteService;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class JwtUserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AthleteService athleteService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Athlete> athleta = athleteService.getByEmail(username);

		if (athleta.isPresent()) {
			return JwtUserFactory.create(athleta.get());
		}

		throw new UsernameNotFoundException("Email não encontrado.");
	}

}
