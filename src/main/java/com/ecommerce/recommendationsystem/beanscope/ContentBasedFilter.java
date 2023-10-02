package com.ecommerce.recommendationsystem.beanscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class ContentBasedFilter implements FilterInterface {

    @Autowired
    Movie movie;

    // @Lookup
    public Movie getMovie() {
        return movie;
    }

    public String[] getRecommendations(String movie) {
        return new String[] {"Happy Feat", "Ice Age", "Shark Tale"};
    }
}
