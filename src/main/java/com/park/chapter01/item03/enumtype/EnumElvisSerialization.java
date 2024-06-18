package com.park.chapter01.item03.enumtype;

import java.io.*;

public class EnumElvisSerialization {

    public static void main(String[] args) {
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("elvis.obj"))){
            out.writeObject(Elvis.INSTANCE);
        }catch(IOException e){
            e.printStackTrace();
        }

        try (ObjectInput in = new ObjectInputStream(new FileInputStream("elvis.obj"))){
            Elvis elvis = (Elvis) in.readObject();
            System.out.println(elvis == Elvis.INSTANCE);
            // 역직렬화 시 새로운 인스턴스 생김
        }catch(IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
