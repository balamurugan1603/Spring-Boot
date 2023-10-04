package com.ecommerce.recommendationsystem.properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    FilterInterface filter;

    @Value("${recommender.implementation.favoriteMovie:Default Movie}")
    public String favouriteMovie;

    public RecommenderImplementation(FilterInterface filter) {
        this.filter = filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }
}
