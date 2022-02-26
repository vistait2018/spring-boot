package com.vista.example1.sring5.Configuration;

import com.vista.example1.sring5.model.FakeDataSource;

import com.vista.example1.sring5.model.FakerJmsDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {
    @Autowired
    Environment env ;

    @Value("${guru.username}")
    String userName ;
    @Value("${guru.password}")
    String password;
    @Value("${guru.url}")
    String url;


    @Value("${guru.jms.username}")
    String userJmsName ;
    @Value("${guru.jms.password}")
    String passwordJms;
    @Value("${guru.jms.url}")
    String urlJms;


    @Bean
    public FakeDataSource fakeDataSource(){

        return new FakeDataSource(env.getProperty("USER"),"dorc",url );
    }

    @Bean
    public FakerJmsDataSource fakerJmsDataSource(){

        return new FakerJmsDataSource(env.getProperty("USER"),"dorc",url );
    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer properties = new PropertySourcesPlaceholderConfigurer();
        return properties;
    }
}
