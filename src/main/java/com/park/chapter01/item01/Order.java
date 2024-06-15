package com.park.chapter01.item01;

import java.util.Arrays;

public class Order {
    private boolean prime;
    private boolean urgent;
    private Product product;

    public Order(){}


    public Order(Product product, boolean prime){
        this.product = product;
        this.prime = prime;
    }

//    public Order(Product product, boolean urgent){
//        this.product = product;
//        this.urgent = urgent;
//    }
    // 오류 발생
    // 하나의 시그니처로는 생성자를 하나만 만들 수 있다.

    public Order(Product product, boolean urgent, boolean prime){
        this.product = product;
        this.urgent = urgent;
        this.prime = prime;
    }

    public Order(boolean urgent, Product product){
        this.product = product;
        this.urgent = urgent;
    }
    // 입력 매개변수들의 순서를 다르게 한 생성자를 추가하는 방식
    // 우회할수는 있지만 좋은 방법은 아님

    public static Order primeOrder(Product product){
        Order order = new Order();
        order.prime = true;
        order.product = product;
        return order;
    }

    public static Order urgentOrder(Product product){
        Order order = new Order();
        order.urgent = true;
        order.product = product;
        return order;
    }
    // 정적 팩터리 메서드 생성

    private OrderStatus orderStatus;

    public static void main(String[] args) {
        System.out.println(Arrays.toString(OrderStatus.values()));

        Order order = new Order();
        if(order.orderStatus == OrderStatus.DELIVERED){
            System.out.println("delivered");
        }
    }

}
