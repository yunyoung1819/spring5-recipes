package com.young.spring.shop;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.util.Properties;

public class Main {
    public static void main(String[] args) throws Exception {
        // Resource resource = new ClassPathResource("discounts.properties");
        // Resource resource = new FileSystemResource("/c:/shop/banner.txt");
        Resource resource = new UrlResource("http://www.apress.com");
        Properties props = PropertiesLoaderUtils.loadProperties(resource);

        System.out.println("And don't forget our discounts!");
        System.out.println(props);
    }
}
