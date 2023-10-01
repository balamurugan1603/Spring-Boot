package com.ecommerce.recommendationsystem.beanmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class RecommendationSystemApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(RecommendationSystemApplication.class, args);
        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(Arrays.toString(recommender.recommendMovies("Finding Dory")));
    }
}
