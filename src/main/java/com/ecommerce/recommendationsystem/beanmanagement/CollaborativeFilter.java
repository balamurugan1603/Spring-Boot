package com.ecommerce.recommendationsystem.beanmanagement;

import org.springframework.stereotype.Component;

public class CollaborativeFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
