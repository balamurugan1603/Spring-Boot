package com.ecommerce.recommendationsystem.cdi;

import jakarta.inject.Named;

@Named
public class CollaborativeFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
