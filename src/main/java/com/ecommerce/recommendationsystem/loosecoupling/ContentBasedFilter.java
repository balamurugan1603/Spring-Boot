package com.ecommerce.recommendationsystem.loosecoupling;

public class ContentBasedFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feat", "Ice Age", "Shark Tale"};
    }
}
