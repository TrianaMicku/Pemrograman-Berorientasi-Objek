package com.pbo;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main (String[] args){
        int input, x;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("Masukkan Nilai : ");
        input = inputUser.nextInt();

        // variable x = ekspresi ? statement_true : statement_false
        x = (input == 10) ? (input*input) : (input/2);

        /*  jika ingin memakai if maka seperti ini :
              if (input==10){
                  x = input*input;
              }else{
                  x = input/2;
              }
        */
        System.out.println("Hasilnya " + x);
    }
}
