package com.park.chapter01.item03.field;

import java.io.Serializable;

public class Elvis implements IElvis, Serializable {

    /**
     * 싱글턴
     */
    public static final Elvis INSTANCE = new Elvis();
    // 인스턴스를 static으로 미리 만들어놓음

    private static boolean created;
    private Elvis(){
        if(created){
            throw new UnsupportedOperationException("can't be created by constructor");
        }

        created = true;
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby");
    }

    public void sing(){
        System.out.println("I'll have a blue");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveTheBuilding();

        // 장점 1. 자바doc을 통해 간결하게 확인이 가능하다.
        //
    }

    private Object readResolve(){
        return INSTANCE;
    } // 역직렬화를 readResolve 메소드로 막을 수는 있음

}
