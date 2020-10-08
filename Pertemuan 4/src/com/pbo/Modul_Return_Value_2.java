package com.pbo;

public class Modul_Return_Value_2 {
    static int myMethod(int x, int y){
    return x + y;
}

    public static void main(String[] args) {
        System.out.println(myMethod(5,3));

        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
