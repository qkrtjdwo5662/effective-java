package com.park.chapter01.item04;

public class UtilityClass {

    private UtilityClass(){
        throw new AssertionError();
//        System.out.println("Constructor");
    }
    public static String hello(){
        return "Hello";
    }
    public static void main(String[] args) {
        String hello = UtilityClass.hello();

//        UtilityClass utilityClass = new UtilityClass();
    }
}
