package com.pbo;

public class CthRuntimeException{
    public static void main(String[] args) {
        try {
            throw new RuntimeException("RuntimeException Error");
        } catch (RuntimeException e) {
            System.out.println("Terjadi Error : " + e);
        }
    }
}
