package com.ecommerce.recommendationsystem.tightcoupling;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

@SpringBootApplication
public class RecommendationSystemApplication {
    public static void main(String[] args) {
        RecommenderImplementation recommender = new RecommenderImplementation();
        System.out.println(Arrays.toString(recommender.recommendMovies("Finding Dory")));
    }
}
