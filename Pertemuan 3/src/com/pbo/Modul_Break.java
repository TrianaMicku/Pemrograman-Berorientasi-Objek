package com.pbo;

public class Modul_Break {
    public static void main(String[] args){
        System.out.print("--- For Loop ---\n");
        for(int i = 0; i < 10; i++){
            if(i == 3){
                break;
            }
            System.out.print(i + " ");
        }

        System.out.print(" \n--- While Loop ---\n");
        int x = 0;
        while(x < 10){
            System.out.print(x + " ");
            x++;
            if(x == 5){
                break;
            }
        }
    }
}
