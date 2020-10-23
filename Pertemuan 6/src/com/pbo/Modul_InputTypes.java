package com.pbo;

import java.util.Scanner;

public class Modul_InputTypes {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Masukkan Nama, Umur, dan Gaji :");
        String nama = myObj.nextLine();
        int umur = myObj.nextInt();
        double gaji = myObj.nextDouble();

        System.out.println("Nama : " + nama);
        System.out.println("Umur : " + umur);
        System.out.println("Gaji : " + gaji);
    }

}
