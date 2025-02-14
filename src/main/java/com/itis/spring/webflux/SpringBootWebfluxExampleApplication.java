package com.itis.spring.webflux;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.r2dbc.connection.init.ConnectionFactoryInitializer;
import org.springframework.web.reactive.config.EnableWebFlux;

import io.r2dbc.spi.ConnectionFactory;

@EnableWebFlux
//@EnableR2dbcRepositories
@SpringBootApplication
public class SpringBootWebfluxExampleApplication {

  @Bean
  ConnectionFactoryInitializer initializer(ConnectionFactory connectionFactory) {

    ConnectionFactoryInitializer initializer = new ConnectionFactoryInitializer();
    initializer.setConnectionFactory(connectionFactory);
    return initializer;
  }

  public static void main(String[] args) {
    SpringApplication.run(SpringBootWebfluxExampleApplication.class, args);
  }

}
