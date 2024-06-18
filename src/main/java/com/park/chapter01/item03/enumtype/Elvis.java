package com.park.chapter01.item03.enumtype;

// 열거 타입 싱글턴 방식
public enum Elvis {
    INSTANCE;

    public void leaveBuilding() {
        System.out.println("기다려 지금 나감~~");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.INSTANCE;
        elvis.leaveBuilding();
    }
}
