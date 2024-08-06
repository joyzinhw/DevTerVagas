package com.DevTerVagas;


import jakarta.activation.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;




@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource (){
           DriverManagerDataSource dataSource = new DriverManagerDataSource();
    }

}
