package com.pbo;

import java.util.Scanner;

public class Modul_ImportClass {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter Username : ");

        String userName = myObj.nextLine();
        System.out.print("Username is " + userName);
    }
}
