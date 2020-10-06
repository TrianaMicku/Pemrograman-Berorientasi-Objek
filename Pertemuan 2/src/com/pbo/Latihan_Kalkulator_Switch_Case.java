package com.pbo;

import java.util.Scanner;

public class Latihan_Kalkulator_Switch_Case {
    public static void main (String[] args){
        //Menggunakan Switch Case

        Scanner inputUser;
        float a, b, hasil;
        String operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai A : ");
        a = inputUser.nextFloat();

        System.out.print("Operator : ");
        operator = inputUser.next();

        System.out.print("Nilai B : ");
        b = inputUser.nextFloat();

        switch(operator){
            case "+": //penjumlahan
                hasil = a + b;
                System.out.println("Hasil : " + hasil);
                break;
            case "-": //pengurangan
                hasil = a - b;
                System.out.println("Hasil : " + hasil);
                break;
            case "*": //perkalian
                hasil = a * b;
                System.out.println("Hasil : " + hasil);
                break;
            case "/": //pembagian
                hasil = a / b;
                System.out.println("Hasil : " + hasil);
                break;

            default:
                System.out.println("Operator" + operator + "Tidak Ditemukan");
        }

    }
}
