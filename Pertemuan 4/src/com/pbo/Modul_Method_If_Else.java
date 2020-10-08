package com.pbo;

public class Modul_Method_If_Else {
    static void checkAge(int age){
        if(age < 18) {
            System.out.println("Access denied - you are not enough!");
        }else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args){
        checkAge(20);
    }
}
