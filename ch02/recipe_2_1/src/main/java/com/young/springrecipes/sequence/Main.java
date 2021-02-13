package com.young.springrecipes.sequence;

import com.young.springrecipes.sequence.config.SequenceGeneratorConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(SequenceGeneratorConfiguration.class);

        SequenceGenerator generator = context.getBean(SequenceGenerator.class);

        System.out.println(generator.getSeqeunce());
        System.out.println(generator.getSeqeunce());
    }
}
