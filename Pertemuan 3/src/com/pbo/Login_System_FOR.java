package com.pbo;

import java.util.Scanner;

public class Login_System_FOR {
    public static void main(String[] args) {
        String user, pw;

        Scanner inputUser = new Scanner(System.in);
        //Login system
        System.out.println("Silahkan Masuk");
        System.out.println("--------------");

        for(int i = 1; i <= 3; i++) {

            //Username
            System.out.print("Username : ");
            user = inputUser.next();

            //Password
            System.out.print("Password : ");
            pw = inputUser.next();

            if (user.equals("Triana") && pw.equals("12345")){
                System.out.println("Selamat Datang, " + user + "!");
                return ;

            }else{
                System.out.print("\nUsername & Password Yang Anda Masukkan Salah!");
                System.out.print("\n---------------------------------------------\n\n");
            }
        }
        System.out.println("Silahkan Kembali Beberapa Saat Lagi");
    }
}
