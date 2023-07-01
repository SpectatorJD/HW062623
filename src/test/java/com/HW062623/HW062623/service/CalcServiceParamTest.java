package com.HW062623.HW062623.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalcServiceParamTest {
    private final ServiceCalc serviceCalc = new ServiceCalc();

    @ParameterizedTest
    @MethodSource("provideArgumentsSumTest")
    public void shouldReturnSum(int num1, int num2, int expected){
        int result = serviceCalc.getAddition(num1,num2);
        Assertions.assertEquals(expected, result);
    }
    private static Stream<Arguments> provideArgumentsSumTest(){
        return Stream.of(
                Arguments.of(2,2,4),
                Arguments.of(5,5,10),
                Arguments.of(10,8,18)
        );
    }
    @ParameterizedTest
    @CsvSource({"10,2,5","25,5,5"})
    public void shouldReturnDivision(int num1, int num2, int expected){
        int result = serviceCalc.getDivision(num1,num2);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"10,2,20","25,5,125"})
    public void shouldReturnMulti(int num1, int num2, int expected){
        int result = serviceCalc.getMultiplication(num1,num2);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"10,2,8","25,5,20"})
    public void shouldReturnSubtraction(int num1, int num2, int expected){
        int result = serviceCalc.getSubtraction(num1,num2);
        Assertions.assertEquals(expected, result);
    }
    @ParameterizedTest
    @CsvSource({"10,2,12","25,5,30"})
    public void shouldReturnAddition(int num1, int num2, int expected){
        int result = serviceCalc.getAddition(num1,num2);
        Assertions.assertEquals(expected, result);
    }


}
