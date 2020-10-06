package com.pbo;

import java.util.Scanner;

public class Latihan_Aritmatika_Scanner {
    public static void main(String[] args){

        //Membuat program menghitung luas persegi panjang
        //Luas = p x l

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;

        System.out.println("---Program Menghitung Luas & Volume Persegi Panjang---");

        System.out.print("Panjang : ");
        panjang = userInput.nextInt();
        System.out.print("Lebar : ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas : " + luas);
        System.out.println("------------------");
        System.out.print("Tinggi : ");
        tinggi = userInput.nextInt();

        volume = luas * tinggi;
        System.out.println("Volume : " + volume);
    }
}
