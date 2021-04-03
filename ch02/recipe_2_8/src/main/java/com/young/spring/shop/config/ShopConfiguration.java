package com.young.spring.shop.config;

import com.young.spring.shop.Cashier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ShopConfiguration {

    // 자바 구성 클래스의 @Bean 정의부에서 initMethod, destroyMethod 속성을 설정하면
    // 스프링은 이들을 각각 초기화, 폐기 콜백 메서드로 인지합니다.
    @Bean(initMethod = "openFile", destroyMethod = "closeFile")
    public Cashier cashier() {
        String path = System.getProperty("java.io.tmpdir") + "/cashier";
        Cashier c1 = new Cashier();
        c1.setFileName("checkout");
        c1.setPath(path);
        return c1;
    }
}
