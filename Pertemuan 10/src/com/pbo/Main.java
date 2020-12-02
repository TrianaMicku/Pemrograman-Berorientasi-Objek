package com.pbo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
	int a;
	int b;
	int hasil = 0;
        System.out.println("Masukan Bilangan 1: ");
        a = input.nextInt();
        System.out.println("Masukan Bilangan 2: ");
        b = input.nextInt();

	try{
        hasil = a/b;
    }catch (ArithmeticException e){
        System.out.println("Terjadi error : " + e);
    }

        System.out.println("Hasil = 0 " + hasil);
        System.out.println("Terima Kasih");
    }
}
