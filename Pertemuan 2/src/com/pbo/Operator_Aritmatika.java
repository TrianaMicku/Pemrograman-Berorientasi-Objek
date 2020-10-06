package com.pbo;

public class Operator_Aritmatika {
    public static void main(String[] args) {

        //Operasi Aritmatika

        int var1 = 15;
        int var2 = 2;

        int hasil;

        //Penjumlahan
        System.out.println("Penjumlahan :");
        hasil = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + hasil);
        System.out.printf("%d + %d = %d \n",var1,var2,hasil);

        //Pengurangan
        System.out.println("Pengurangan :");
        hasil = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + hasil);
        System.out.printf("%d - %d = %d \n",var1,var2,hasil);

        //Perkalian
        System.out.println("Perkalian :");
        hasil = var1 * var2;
        System.out.println(var1 + " x " + var2 + " = " + hasil);
        System.out.printf("%d x %d = %d \n",var1,var2,hasil);

        //Pembagian
        System.out.println("Pembagian :");
        hasil = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + hasil);

        float a = 7;
        float b = 6;
        float hasilfloat = a/b;
        System.out.printf("%f / %f = %f \n",a,b,hasilfloat);

        //Modulus
        System.out.println("Modulus :");
        hasil = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + hasil);
        System.out.printf("%d %% %d = %d \n",var1,var2,hasil);
    }

}
