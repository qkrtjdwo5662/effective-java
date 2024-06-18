package com.park.chapter01.item03.staticfactory;

// 제네릭 싱글턴 패턴
public class MetaElvis<T> {
    private static final MetaElvis<Object> INSTANCE = new MetaElvis<>();

    private MetaElvis(){}

    @SuppressWarnings("unchecked")
    public static <T> MetaElvis<T> getInstance(){
        return (MetaElvis<T>) INSTANCE;
    }

    public void say(T t){
        System.out.println(t);
    }

    public void leaveTheBuilding(){
        System.out.println("Whoa baby");
    }

    public static void main(String[] args) {
        MetaElvis<String> elvis1 = MetaElvis.getInstance();
        MetaElvis<Integer> elvis2 = MetaElvis.getInstance();

        System.out.println(elvis1.equals(elvis2));
//        System.out.println(elvis1 == elvis2);
        // 같은 인스턴스지만 타입이 달라서 == 비교 불가
    }
}
