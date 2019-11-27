package com.company.apppersistence;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages = "com.company.apppersistence")
@ComponentScan(basePackages = "com.company.apppersistence")
@EntityScan(basePackages = "com.company.apppersistence.model")
public class Config {

}
