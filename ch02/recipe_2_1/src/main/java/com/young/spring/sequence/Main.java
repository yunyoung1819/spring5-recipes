package com.young.spring.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 실습 레시피 2-1. 자바로 POJO 구성하기
 * 과제: 스프링 Ioc 컨테이너에서 애너테이션을 붙여 POJO를 관리하세요.
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.young.springrecipes.sequence");

//        SequenceGenerator generator = context.getBean(SequenceGenerator.class);
//
//        System.out.println(generator.getSeqeunce());
//        System.out.println(generator.getSeqeunce());
        SequenceDao sequenceDao = context.getBean(SequenceDao.class);

        System.out.println(sequenceDao.getNextValue("IT"));
        System.out.println(sequenceDao.getNextValue("IT"));
    }
}
