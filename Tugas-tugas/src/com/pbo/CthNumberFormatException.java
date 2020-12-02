package com.pbo;

public class CthNumberFormatException {
    public static void main(String[] args) {
        String a = "Hallo!";

        try {
            int b = Integer.parseInt(a);
        }catch (NumberFormatException e){
            System.out.println("Terjadi Error : " + e);
        }
            System.out.println("Terima Kasih....");
    }
}
