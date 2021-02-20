package com.young.spring.shop;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.young.spring.shop")
public class ShopConfiguration {

    @Bean
    public Product electricBattery() {
        Battery p1 = new Battery();
        p1.setName("전기차 배터리");
        p1.setPrice(250000);
        p1.setRechargeable(true);
        return p1;
    }

    @Bean
    public Product cdrw() {
        Disc p2 = new Disc("m1 디스크", 15000);
        p2.setCapacity(800);
        return p2;
    }

    @Bean
    public Product dvdrm() {
        Disc p2 = new Disc("dvd 디스크", 3000);
        p2.setCapacity(100);
        return p2;
    }
}
