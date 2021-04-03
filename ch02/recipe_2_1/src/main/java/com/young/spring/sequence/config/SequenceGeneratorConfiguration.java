package com.young.spring.sequence.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
        includeFilters = {
                @ComponentScan.Filter(type = FilterType.REGEX, pattern={"com.young.springrecipes.sequence.*Dao", "com.young.springrecipes.sequence.*Service"})
        },
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.ANNOTATION,
                        classes = {org.springframework.stereotype.Controller.class}
                )
        }
)
public class SequenceGeneratorConfiguration {

//    @Bean
//    public SequenceGenerator sequenceGenerator() {
//        SequenceGenerator seqgen = new SequenceGenerator();
//        seqgen.setPrefix("30");
//        seqgen.setSuffix("AAA");
//        seqgen.setInitial(100000);
//        return seqgen;
//    }
}
