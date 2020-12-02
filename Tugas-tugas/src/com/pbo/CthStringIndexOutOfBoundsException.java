package com.pbo;

public class CthStringIndexOutOfBoundsException {
    public static void main(String[] args){
        try{
            String a = "Hallo! Selamat Datang..".substring(-10,15);
            // substring sebagai mengambil index/kata tertentu dari suatu string
            System.out.println(a);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Terjadi Error : " + e);

        }
    }
}