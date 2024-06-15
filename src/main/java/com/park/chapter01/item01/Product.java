package com.park.chapter01.item01;

public class Product {
    public static void main(String[] args) {
//        Settings settings = new Settings();
        // private이기 때문에 생성자를 만들어줄 수 없다.

        Settings settings1 = Settings.newInstance();
        Settings settings2 = Settings.newInstance();
        // 두개의 인스턴스는 같은 인스턴스

        Boolean.valueOf(false);
    }
}
