package com.HW062623.HW062623.service;

import com.HW062623.HW062623.exception.NotNullException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class ServiceCalcTest {
    private final ServiceCalc serviceCalc = new ServiceCalc();
    @Test
    public void test(){


    }
    @Test
    public void shouldReturnSevenSum3and2(){
        int result = serviceCalc.getAddition(4,3);

        Assertions.assertEquals(7,result);
    }
    @Test
    public void shouldThrowExceptionDivision0(){
        Assertions.assertThrows(NotNullException.class, () -> serviceCalc.getDivision(5,0));
    }
}
