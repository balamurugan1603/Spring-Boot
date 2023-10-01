package com.ecommerce.recommendationsystem.loosecoupling;

public class RecommenderImplementation {

    public FilterInterface filter;

    public RecommenderImplementation(FilterInterface filter) {
        this.filter = filter;
    }
    public String[] recommendMovies(String movie) {
        System.out.println("Name of the filter in use: " + filter + "\n");
        String[] results = this.filter.getRecommendations(movie);
        return results;
    }
}
