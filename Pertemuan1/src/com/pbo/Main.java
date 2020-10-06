package com.pbo;

public class Main {
    public static void main(String[] args) {
        /**
         * Program Menghitung Luas Segitiga dengan :
         * Alas dan Tinggi diinput melalui kode program
         * tampilan output :
         * Program Luas Segitiga
         * alas = 10
         * tinggi = 20
         * luas = 100
         */

        int alas = 10;
        int tinggi = 20;
        double luas;

        System.out.println("Program Luas Segitiga");
        luas = 0.5 * alas * tinggi;

        // menggunakan int jadi > (alas * tinggi) / 2;

        System.out.println("Alas = " + alas);
        System.out.println("Tinggi = " + tinggi);
        System.out.println("Luas = " + luas);

    }
}
