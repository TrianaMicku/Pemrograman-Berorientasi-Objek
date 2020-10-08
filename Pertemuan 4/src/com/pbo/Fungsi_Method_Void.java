package com.pbo;

public class Fungsi_Method_Void {
    public static void main (String[] args){
        //Void artinya adalah hampa
        System.out.println(simpel());

        fungsiVoid("Everything");
        selamatPagi("Johnny");
        selamatPagi("Jaejae");

    }

    private static void selamatPagi(String nama){
        System.out.println("Selamat Pagi, " + nama + "!");
    }

    //Ini adalah fungsi/method tanpa kembalian
    private static void fungsiVoid(String input){
        System.out.println(input);
    }

    /* Ini adalah fungsi/method dengan kembalian sehingga
    menggunakan return untuk mengembalikan nilainya (10.0f) */

    private static float simpel(){
        return 15.0f;
    }

}
