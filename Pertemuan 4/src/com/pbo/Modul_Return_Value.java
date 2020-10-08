package com.pbo;

public class Modul_Return_Value {
    static int myMethod(int x){
        return 5 + x;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(3));
    }
}
