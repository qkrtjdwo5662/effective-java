package com.park.chapter01.item03.staticfactory;


import java.util.function.Supplier;

public class Concert {

    public void start(Supplier<Singer> singerSupplier){
        Singer singer = singerSupplier.get();
        singer.sing();
    } // 인자 없는 메서드를 호출해서 무언가를 리턴해줌

    public static void main(String[] args) {
        Concert concert = new Concert();
        concert.start(Elvis::getInstance);
    }
}
