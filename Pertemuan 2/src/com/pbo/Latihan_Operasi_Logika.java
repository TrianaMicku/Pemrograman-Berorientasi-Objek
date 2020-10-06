package com.pbo;

import java.util.Scanner;

public class Latihan_Operasi_Logika {
    public static void main(String[] args){

        //Membuat sebuah objek untuk menangkap input dari user
        Scanner inputUser = new Scanner(System.in);

        //Sebuah program sederhana untuk menebak sebuah angka
        int nilaiBenar = 6;
        int nilaiTebakan;
        boolean statusTebakan;

        System.out.print("Masukan Nilai Tebakan Anda : ");
        nilaiTebakan = inputUser.nextInt();

        //System.out.println("Nilai Tebakan Anda Adalah " + nilaiTebakan);

        // operasi logika
        statusTebakan = (nilaiTebakan == nilaiBenar);
        System.out.println("Tebakan Anda : " + statusTebakan);

        // operasi aljabar boolean (AND / OR)
        System.out.print("Masukan Nilai Diantara 4 & 9 : ");
        nilaiTebakan = inputUser.nextInt();

        statusTebakan = (nilaiTebakan > 4) && (nilaiTebakan < 9);

        /*  TABLE AND
            a | b | c
            0   0   0
            0   1   0
            1   0   0
            1   1   1
         */

        System.out.println("Tebakan Anda: " + statusTebakan);
    }
}
