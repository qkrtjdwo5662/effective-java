package com.park.chapter01.item03.staticfactory;

// 정적 팩터리 메서드 방식의 싱글턴
public class Elvis implements Singer{
    private static final Elvis INSTANCE = new Elvis();
    // private
    private Elvis() {
    }

    public static Elvis getInstance() {
        return INSTANCE;
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.leaveTheBuilding();
    }

    @Override
    public void sing() {
        System.out.println("my way~~~");
    }

    // 단점 : 필드 방식의 싱글턴과 같이 역직렬화, 리플렉션은 같음
    // 장점 1. 클라이언트 코드를 바꾸지 않고 싱글턴 해체 가능
    // 장점 2. 정적 팩터리를 제네릭 싱글턴 팩터리로 만들 수 있음.
    // 장점 3. 정적 팩터리의 메서드를 공급자로 사용할 수 있음
}
