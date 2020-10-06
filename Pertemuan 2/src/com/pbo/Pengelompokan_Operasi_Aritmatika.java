package com.pbo;

import java.util.Scanner;

public class Pengelompokan_Operasi_Aritmatika {
    public static void main(String[] args){

        //Perkalian atau pembagian akan dilakukan terlebih dahulu
        //Jika dilakukan perkalian dan pembagian, maka akan dilakukan operasi mulai dari kiri ke kanan

        int hasil = 5 * 10 / 2;
        System.out.println(hasil);

        hasil = 5 + 2 - 10;
        System.out.println(hasil);

        //Menggunakan pengelompokan operasi dengan ()
        hasil = 60 / (2 + 10);
        System.out.println(hasil);

        // perhitungan persamaan kuadrat
        Scanner userInput = new Scanner(System.in);
        System.out.println("Menghitung Persamaan Kuadrat");
        int m,x,c,y;

        System.out.print("Nilai x = ");
        x = userInput.nextInt();

        System.out.print("Gradient m = ");
        m = userInput.nextInt();

        System.out.print("Bias c = ");
        c = userInput.nextInt();

        y = (m * x * x) + c;
        System.out.println("Nilai y = " + y);

    }
}
