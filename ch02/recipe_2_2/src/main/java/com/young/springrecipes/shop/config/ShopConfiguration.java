package com.young.springrecipes.shop.config;

import com.young.springrecipes.shop.Battery;
import com.young.springrecipes.shop.Disc;
import com.young.springrecipes.shop.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    @Bean
    public Product aaa() {
        Battery p1 = new Battery("전기차 배터리", 250000);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("CD_RW", 15000);
        p2.setCapacity(7000);
        return p2;
    }
}

