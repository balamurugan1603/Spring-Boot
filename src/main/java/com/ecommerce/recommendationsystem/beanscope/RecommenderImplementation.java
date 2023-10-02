package com.ecommerce.recommendationsystem.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RecommenderImplementation {

    @Autowired
    @Qualifier("CF")
    FilterInterface filter;

    public RecommenderImplementation(FilterInterface filter) {
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
