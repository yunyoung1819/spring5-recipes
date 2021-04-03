package com.young.spring.bank;

/**
 * 레시피 16-1. JUnit과 TestNG로 단위 텧스트 작성하기
 */
public interface InterestCalculator {
    void setRate(double rate);
    double calculate(double amount, double year);
}
