package com.pbo;

import java.util.*;
import java.lang.String;

public class Rekursif_Bercabang {
    public static void main (String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.print("Masukan Nilai n : ");
        int nilai = userInput.nextInt();

        //Fibonnacci adalah angka selanjutnya perjumlahan yang ada 2 angka dibelakangnya
        int nilai_fibonacci = fibonacci(nilai, "Atas");
        System.out.println("Nilai Fibonacci Ke-"+ nilai +" Adalah " + nilai_fibonacci);
    }

    private static int fibonacci(int n, String daun){
        System.out.println("Daun " + daun);
        System.out.println("Fibonacci Ke - " + n);
        if (n == 1 || n == 0){
            return n;
        }
        else {
            return fibonacci(n - 1, "kiri") + fibonacci(n - 2, "Kanan");
        }
    }

}
