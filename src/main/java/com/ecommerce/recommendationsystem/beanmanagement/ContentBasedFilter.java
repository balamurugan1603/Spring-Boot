package com.ecommerce.recommendationsystem.beanmanagement;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements FilterInterface {
    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feat", "Ice Age", "Shark Tale"};
    }
}
