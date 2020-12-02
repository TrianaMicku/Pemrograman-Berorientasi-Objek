package com.pbo;

public class CthClassNotFoundException{
    public static void main(String[] args) {
        System.out.print("Hallo ");
        try{
            Class.forName("ThisClassDoesNotExist");
        }catch (Exception e){
            System.out.println("Terjadi Error : " + e);
        }finally {
            System.out.println("Terima Kasih");
        }
    }
}
