package com.ecommerce.recommendationsystem.cdi;

import jakarta.inject.Named;
import org.springframework.context.annotation.Primary;

@Named
@Primary
public class ContentBasedFilter implements FilterInterface {

    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feat", "Ice Age", "Shark Tale"};
    }
}
