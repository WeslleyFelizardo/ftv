/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.futevolei.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Weslley Felizardo
 */
public class FormattingUtil {

    public static String dateFormatted(Object value) throws ParseException {
        
        String valueDate = String.valueOf(value).replace("T", " ").replaceAll("'", "");
        StringBuilder builder = new StringBuilder();

        String year, month, day, hourMinute = "";
        
        year = valueDate.substring(0, 4);
        month = valueDate.substring(5, 7);
        day = valueDate.substring(8, 10);
        hourMinute = valueDate.length() > 10 ? " " + valueDate.substring(11,16) : "";
        
        builder.append(day).append("/").append(month).append("/").append(year).append(hourMinute);
        
        return builder.toString();
    }
    
    public static String retirarCaracteresEspeciaisCPF(String toFormate){
        if(toFormate!=null && !toFormate.isEmpty()) {
            return toFormate.replace(".", "").replace("/", "").replace("-","").toString().trim();
        }else{
            return null;
        }
    }
}
