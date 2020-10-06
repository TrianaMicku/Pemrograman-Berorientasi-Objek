package com.pbo;

import java.util.Scanner;

public class Login_System_DO {
    public static void main(String[] args) {
        String  user, pw;
        int x = 0; //Mulai dari 0.

        Scanner inputUser = new Scanner(System.in);
        //Login system
        System.out.println("Silahkan Masuk");
        System.out.println("--------------");

        do {
            x++;
            //Username
            System.out.print("Username : ");
            user = inputUser.next();

            //Password
            System.out.print("Password : ");
            pw = inputUser.next();

            if (user.equals("Yok") && pw.equals("cus12")){
                System.out.println("Selamat Datang, " + user + "!");
                return ;
            }else{
                System.out.print("\nUsername & Password Yang Anda Masukkan Salah!");
                System.out.print("\n---------------------------------------------\n\n");
            }

        }while (x < 3); //Akan mengulang 3x karena x nya mulai dari 0.
            System.out.println("Silahkan Kembali Beberapa Saat Lagi");
    }
}
