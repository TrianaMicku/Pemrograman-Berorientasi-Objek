package com.pbo;

import java.util.*;

public class Latihan_Looping_Deret_Fibonacci {
    public static void main (String[] args){

        //Menghitung nilai deret fibonacci ke-n
        int fn, fn_1, fn_2, n;

        Scanner inputUser = new Scanner(System.in);
        System.out.print("Mengambil Nilai Fibonacci Ke - : ");
        n = inputUser.nextInt();

        fn_2 = 0;
        fn_1 = 1;
        fn = 1;

        for(int i = 1; i <= n; i++){
            System.out.println("Nilai Ke - "+ i + " Adalah " + fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
        }

        /*
        fn_2 = 0; // 1 , 2
        fn = 1; // 2 , 3
        fn_1 = 1; // 2, 3
        System.out.println("Menggunakan For Loop");
        for (int i=1; i <= n ;i++){
            System.out.println("nilai ke - "+i+" adalah "+fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;

        }

        System.out.println("\n");
        System.out.println("Menggunakan While Loop");
        int a = 1;
        fn_2 = 0; // 1 , 2
        fn = 1; // 2 , 3
        fn_1 = 1; // 2, 3

        while (a <= n){
            System.out.println("Nilai ke - "+a+" adalah "+fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            a++;
        }

        System.out.println("\n");
        System.out.println("Menggunakan While do loop");
        fn_2 = 0; // 1 , 2
        fn = 1; // 2 , 3
        fn_1 = 1; // 2, 3
        int b =1;
        do {
            System.out.println("Nilai ke - "+a+ " adalah "+fn);
            fn = fn_1 + fn_2;
            fn_2 = fn_1;
            fn_1 = fn;
            b++;
        }while (b <= n);
         */

    }
}
