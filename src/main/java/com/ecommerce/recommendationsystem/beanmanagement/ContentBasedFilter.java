package com.ecommerce.recommendationsystem.beanmanagement;

import org.springframework.stereotype.Component;

@Component
public class ContentBasedFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feat", "Ice Age", "Shark Tale"};
    }
}
