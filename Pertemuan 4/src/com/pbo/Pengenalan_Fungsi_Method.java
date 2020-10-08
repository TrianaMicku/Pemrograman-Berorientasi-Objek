package com.pbo;

public class Pengenalan_Fungsi_Method {
    public static void main (String[] args){

        //y = (x + 2) * x
        int y,x;
        x = 15;
        y = hitung(x);

        System.out.println("x = " + x + ", y = " + y);

        x = 30;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);

        x = 55;
        y = hitung(x);
        System.out.println("x = " + x + ", y = " + y);
    }

    public static int hitung(int input){
        int hasil;

        //hasil = (input + 2) * input;
        hasil = input * input;
        return hasil;
    }
}
