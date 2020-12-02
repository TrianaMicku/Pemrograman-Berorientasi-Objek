package com.pbo;

public class Contoh_NestedException1 {
    public static void main(String[] args) {
        try {//main try-block
            try { // try-block2

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
