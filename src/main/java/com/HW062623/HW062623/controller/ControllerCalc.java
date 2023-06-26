package com.HW062623.HW062623.controller;

import com.HW062623.HW062623.service.ServiceCalc;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerCalc {
    private final ServiceCalc serviceCalc;

    public ControllerCalc(ServiceCalc serviceCal) {
        this.serviceCalc = serviceCal;
    }


    @GetMapping(path = "/calculator")
    public String getHello() {
        return serviceCalc.hello();
    }

    @GetMapping(path = "/calculator/plus")
    public String getAddition(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {


        serviceCalc.getAddition(num1, num2);
        String result = num1 + " + " + num2 + " = " + serviceCalc.getAddition(num1, num2);
        System.out.println(result);
        return result;
    }


    @GetMapping(path = "/calculator/minus")
    public String getSubtraction(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        serviceCalc.getSubtraction(num1, num2);
        String result = num1 + " - " + num2 + " = " + serviceCalc.getSubtraction(num1, num2);
        System.out.println(result);
        return result;
    }


    @GetMapping(path = "/calculator/multiply")
    public String getMultiplication(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        serviceCalc.getMultiplication(num1, num2);
        String result = num1 + " * " + num2 + " = " + serviceCalc.getMultiplication(num1, num2);
        System.out.println(result);
        return result;
    }

    @GetMapping(path = "/calculator/divide")
    public String getDivision(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {

        serviceCalc.getDivision(num1, num2);
        if (num2 == 0) {
            return "Деление 0 запрещено";
        }
        String result = num1 + " / " + num2 + " = " + serviceCalc.getDivision(num1, num2);
        System.out.println(result);
        return result;
    }
}
