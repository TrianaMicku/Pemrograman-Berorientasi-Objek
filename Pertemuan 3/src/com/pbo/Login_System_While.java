package com.pbo;

import java.util.Scanner;

public class Login_System_While {
    public static void main(String[] args) {
        String  user, pw;
        int i = 1; //Mulai dari 1.

        Scanner inputUser = new Scanner(System.in);
        //Login system
        System.out.println("Silahkan Masuk");
        System.out.println("--------------");

        while (i < 4) { //Akan mengulang 3x.

            //Username
            System.out.print("Username : ");
            user = inputUser.next();

            //Password
            System.out.print("Password : ");
            pw = inputUser.next();

            if (user.equals("Triana") && pw.equals("nanajae")){
                System.out.println("Selamat Datang, " + user + "!");
                return ;
            }else{
                System.out.print("\nUsername & Password Yang Anda Masukkan Salah!");
                System.out.print("\n---------------------------------------------\n\n");
            }
            i++;

        }
        System.out.println("Silahkan Kembali Beberapa Saat Lagi");

    }
}
