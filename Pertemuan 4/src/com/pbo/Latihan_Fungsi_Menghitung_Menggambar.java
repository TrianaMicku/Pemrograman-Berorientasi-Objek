package com.pbo;

import java.util.*;

public class Latihan_Fungsi_Menghitung_Menggambar {
    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);

        System.out.print("Masukkan Panjang : ");
        int inputPjg = userInput.nextInt();

        System.out.print("Masukkan Lebar : ");
        int inputLbr = userInput.nextInt();

        gambar(inputPjg,inputLbr);

        System.out.println("Luas = " + luas(inputPjg,inputLbr));
        System.out.println("Keliling = " + keliling(inputPjg,inputLbr));
        tampilkanKelilingDanLuas(inputPjg,inputLbr);
    }

    private static void tampilkanKelilingDanLuas(int panjang,int lebar){
        System.out.println("Luas = " + luas(panjang,lebar));
        System.out.println("Keliling = " + keliling(panjang,lebar));
    }

    private static int keliling(int panjang, int lebar){
        int hasil = (panjang + lebar) * 2;
        return hasil;
    }

    private static int luas(int panjang, int lebar){
        int hasil = panjang*lebar;
        return hasil;
    }

    private static void gambar(int panjang, int lebar){
        for(int i = 0; i < lebar; i++){
            for(int j = 0; j < panjang; j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
