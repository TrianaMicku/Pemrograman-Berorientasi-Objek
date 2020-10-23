package com.pbo;

import java.util.Scanner; // Scanner Class

public class Modul_Java_InputUser {

        public static void main(String[] args){
            Scanner myObj = new Scanner(System.in); // membuat Scanner objek
            System.out.print("Enter Username : ");

            String userName = myObj.nextLine(); // syntax membaca hasil input dari user
            System.out.print("Username is " + userName); // output yang dimasukkan
        }
    }

