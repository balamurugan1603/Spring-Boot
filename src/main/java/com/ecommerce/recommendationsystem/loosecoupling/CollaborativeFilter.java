package com.ecommerce.recommendationsystem.loosecoupling;

import java.util.logging.Filter;

public class CollaborativeFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feet", "Ice Age", "Shark Tale"};
    }
}
