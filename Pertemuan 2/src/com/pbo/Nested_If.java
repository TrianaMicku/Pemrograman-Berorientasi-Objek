package com.pbo;

public class Nested_If {
    public static void main(String[] args){

        int a = 2;
        int b = 10;
        System.out.println("Ini Awal Program");

        if (a == 2){

            if (b == 10){
                System.out.println("Ini Adalah Dimana a = 5 & b = 10");
            } else {
                System.out.println("Ini Adalah Dimana a = 5 & b bukan 10");
            }

        } else {
            System.out.println("Ini Adalah Dimana a Salah");
        }

        System.out.println("Ini Akhir Program");
    }
}
