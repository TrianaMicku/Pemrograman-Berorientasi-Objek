package com.pbo;

public class Contoh_NestedException2 {
    public static void main(String[] args) {
        try {//Parent try-block
            try { // Chill try-block1
                System.out.println("Di dalam child block 1");
                int z = 30/0;
                System.out.println(z);
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
                System.out.println("Ditangani pada main try-block1");
            }

            try {
                System.out.println("Di dalam child block 2");
                int z = 40/0;
                System.out.println(z);
            } catch (ArithmeticException e){
                System.out.println("Arithmetic Exception");
                System.out.println("Ditangani pada main try-block2");
            }

        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
            System.out.println("Ditangani pada main try-block");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBounds Exception");
            System.out.println("Ditangani pada main try-block");
        } catch (Exception e) {// Exception jika catch yang ditulis sebelumnya tidak dapat menangani
            System.out.println("Exception ");
            System.out.println("Ditangani pada main try-block");
        }
    }
}
