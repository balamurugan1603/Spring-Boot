package com.ecommerce.recommendationsystem.properties;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class RecommendationSystemApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(RecommendationSystemApplication.class, args);
        ContentBasedFilter filter = applicationContext.getBean(ContentBasedFilter.class);

        System.out.println(filter.getMovie());
        System.out.println(filter.getMovie());

        RecommenderImplementation recommender = applicationContext.getBean(RecommenderImplementation.class);
        System.out.println(recommender.getFavouriteMovie());
    }
}
