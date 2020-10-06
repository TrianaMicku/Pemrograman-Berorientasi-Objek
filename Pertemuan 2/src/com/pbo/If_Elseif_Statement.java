package com.pbo;

public class If_Elseif_Statement {
    public static void main (String[] args){

        int a = 5;
        System.out.println("Ini Awal Program");

        //if else if statement
        if (a == 5){
            System.out.println("Ini Adalah Aksi 1");
        } else if (a == 20) {
            System.out.println("Ini Adalah Aksi 2");
        } else {
            System.out.println("Ini Adalah Aksi Default");
        }

        //Akhir dari if else if statement
        System.out.println("Ini Akhir Program");
    }
}
