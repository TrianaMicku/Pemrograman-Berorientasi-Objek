package com.pbo;

public class Contoh_Throw {
    public static void main(String[] args){
        try {
            int umur = 17;
            if (umur < 18) {
                System.out.println("Access Denied");
            } else {
                System.out.println("Access Granted");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
