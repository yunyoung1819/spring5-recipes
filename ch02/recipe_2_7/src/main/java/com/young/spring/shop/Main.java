package com.young.spring.shop;

import com.young.spring.shop.config.ShopConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws Exception {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ShopConfiguration.class);

        String alert = context.getMessage("alert.checkout", null, Locale.US);
        String alert_inventory = context.getMessage("alert.inventory.checkout",
                new Object[] {"[DVD_RW 3.1]", new Date()}, Locale.US);

        System.out.println("The I18N message for alert.checkout is : " + alert);
        System.out.println("the I18N message for alert.inventory.checkout is : " + alert_inventory);
    }
}
