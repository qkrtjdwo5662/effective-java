package com.park.chapter01.item01;

public class Settings {
    private boolean useAutoSteering;
    private boolean useABS;
    private Difficulty difficulty;
    private Settings(){}
    // private 생성자로 외부에서 해당 클래스를 생성할 수 없다.

    private static final Settings SETTINGS = new Settings();

    public static Settings newInstance(){
        return SETTINGS;
    }
    // 미리 만들어 놓은 인스턴스를 리턴하는 정적팩토리 메서드를 생성


    public static void main(String[] args) {
        System.out.println(new Settings());
        System.out.println(new Settings());
        System.out.println(new Settings());
        // 생성자를 통해 인스턴스 생성을 통제할 수는 없다.

    }
}
