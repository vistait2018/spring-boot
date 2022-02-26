package com.vista.example1.sring5.Configuration;

import com.vista.example1.sring5.model.FakeDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {
    @Autowired
    Environment env ;

    @Value("${guru.username}")
    String userName ;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;


    @Bean
    public FakeDataSource fakeDataSource(){

        return new FakeDataSource(env.getProperty("USER"),"dorc",url );
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
        return properties;
    }
}
