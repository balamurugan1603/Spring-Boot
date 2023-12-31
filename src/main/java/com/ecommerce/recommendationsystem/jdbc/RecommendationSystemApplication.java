package com.ecommerce.recommendationsystem.jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RecommendationSystemApplication implements CommandLineRunner {

    @Autowired
    PlayerDAO playerDAO;

    Logger logger = LoggerFactory.getLogger(this.getClass());
    public static void main(String[] args) {
        SpringApplication.run(RecommendationSystemApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
       logger.info("All Players data: {}", playerDAO.getAllPlayers());
    }
}
