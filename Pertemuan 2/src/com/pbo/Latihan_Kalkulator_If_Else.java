package com.pbo;

import java.util.Scanner;

public class Latihan_Kalkulator_If_Else {
    public static void main (String[] args){
        //Menggunakan if else

        Scanner inputUser;
        float a, b, hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("Nilai A : ");
        a = inputUser.nextFloat();

        System.out.print("Operator : ");
        operator = inputUser.next().charAt(0);

        System.out.print("Nilai B : ");
        b = inputUser.nextFloat();

        System.out.println("Input User : " + a + " " + operator + " " + b);

        //Operator tersedia * / + -
        if (operator == '+'){ //Penjumlahan
            hasil = a + b;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '-'){ //pengurangan
            hasil = a - b;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '*'){ //perkalian
            hasil = a * b;
            System.out.println("Hasil : " + hasil);
        } else if (operator == '/'){  //pembagian

            if (b == 0){
                System.out.println("Pembagi 0 menghasilkan tak hingga");
            } else{
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
            }

        } else {
            System.out.println("Operator Tidak Ditemukan");
        }

    }
}
