package com.DevTerVagas;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import jakarta.activation.DataSource;

//configuraçaõ do banco de dados

@Configuration
public class DataConfiguration {

    @Bean
    public DataSource dataSource (){
           DriverManagerDataSource dataSource = new DriverManagerDataSource();
           dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
           dataSource.setUrl("jdbc:mysql://localhost:3306/nome_do_banco");
           dataSource.setUsername("root");
           dataSource.setPassword("pti@2018");
           return (DataSource) dataSource;
    }

}
