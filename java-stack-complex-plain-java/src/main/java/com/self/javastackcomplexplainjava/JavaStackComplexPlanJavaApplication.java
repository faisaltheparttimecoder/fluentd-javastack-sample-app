package com.self.javastackcomplexplainjava;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;



public class JavaStackComplexPlanJavaApplication
{

    public static void main(String[] args) {
        printLog("Im in the main function call");
        foo1();
    }

    private static void foo1() {
        printLog("Im in foo1");
        foo2();
    }

    private static void foo2() {
        printLog("Im in foo2");
        foo3();
    }

    private static void foo3() {
        printLog("Im in foo3");
        foo4();
    }

    private static void foo4() {
        printLog("Im in foo4");
        foo5();
    }

    private static void foo5() {
        printLog("Im in foo5");
        foo6();
    }

    private static void foo6() {
        printLog("Im in foo6");
        foo7();
    }

    private static void foo7() {
        printLog("Im in foo7");
        foo8();
    }

    private static void foo8() {
        printLog("Im in foo8 and here is a java stack \n");
        try {
            Integer.parseInt("10.1");
        } catch (NumberFormatException e) {
            throw new RuntimeException("This is a real complex java stack error from a plain old vanilla java code!!!", e);
        }
    }

    private static void printLog(String m) {
        System.out.println(dateFormat() + " INFO: " + m);
    }

    private static String dateFormat() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        String formattedDate = now.format(formatter);
        return formattedDate;
    }

}
