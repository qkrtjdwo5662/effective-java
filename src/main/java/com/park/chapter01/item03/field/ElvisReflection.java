package com.park.chapter01.item03.field;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ElvisReflection {
    public static void main(String[] args) {
        try{
            Constructor<Elvis> defaultConstructor = Elvis.class.getDeclaredConstructor(); // 선언되어있는 기본 생성자
            defaultConstructor.setAccessible(true); // 접근 권한 열어주고
            Elvis elvis1 = defaultConstructor.newInstance();
            Elvis elvis2 = defaultConstructor.newInstance();
            System.out.println(elvis1 == elvis2);
            System.out.println(elvis1 == Elvis.INSTANCE);

        }catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
