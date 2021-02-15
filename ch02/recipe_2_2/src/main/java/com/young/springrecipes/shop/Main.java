package com.young.springrecipes.shop;

import com.young.springrecipes.shop.config.ShopConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 실습 레시피 2-2. 생성자 호출해서 POJO 생성하기
 */
public class Main {

    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ShopConfiguration.class);

        Product aaa = context.getBean("aaa", Product.class);
        Product cdrw = context.getBean("cdrw", Product.class);

        System.out.println(aaa);
        System.out.println(cdrw);
    }
}
