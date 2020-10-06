package com.pbo;

public class Modul_Java_For_Loop {
    public static void main(String[] args){
        for(int a = 0; a < 5; a++){
            System.out.print(a + " ");
        }

        System.out.println("\n------------");
        for(int b = 0; b <= 5; b = b + 2){
            System.out.print(b + " ");
        }

        System.out.println("\n------------");
        String[] Mobil = {"BMW", "Ford", "Mazda", "Tayo"};
        for(String c : Mobil){
            System.out.print(c + " ");
        }
    }
}
