package com.pbo;

public class Modul_Parameters_and_Arguments {
    static void myMethod(String fname){
        System.out.println(fname + " Refsnes ");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
