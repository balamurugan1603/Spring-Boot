package com.ecommerce.recommendationsystem.cdi;

import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named
public class RecommenderImplementation {

    @Inject
    FilterInterface filter;

    public FilterInterface getFilter() {
        return filter;
    }

    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = filter.getRecommendations(movie);
        return results;
    }
}
