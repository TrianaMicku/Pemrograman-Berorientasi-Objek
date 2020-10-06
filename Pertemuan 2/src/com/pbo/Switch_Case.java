package com.pbo;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Panggil Nama ");
        input = inputUser.next();

        //Ekspresinya berupa satuan (int,long,byte,short), String, enum
        switch(input){
            case "jaemin":
                System.out.println("Hadir, Saya jaemin!");
                break;
            case "jisung":
                System.out.println("Hadir, Saya jisung!");
                break;
            case "jhonny":
                System.out.println("Hadir, Saya jhonny!");
                break;
            default:
                System.out.println(input + " Tidak Hadir!");
        }

        System.out.println("Program Selesai");
    }
}
