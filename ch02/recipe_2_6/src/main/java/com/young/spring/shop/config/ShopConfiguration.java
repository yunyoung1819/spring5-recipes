package com.young.spring.shop.config;

import com.young.spring.shop.BannerLoader;
import com.young.spring.shop.Disc;
import com.young.spring.shop.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.Resource;

@Configuration
@PropertySource("classpath:discounts.properties")
@ComponentScan("com.young.spring.shop")
public class ShopConfiguration {

    @Value("classpath:banner.txt")
    private Resource banner;

    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigure() {
        return new PropertySourcesPlaceholderConfigurer();
    }

    @Bean
    public BannerLoader bannerLoader() {
        BannerLoader bl = new BannerLoader();
        bl.setBanner(banner);
        return bl;
    }
}
