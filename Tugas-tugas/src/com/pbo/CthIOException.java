package com.pbo;
import java.io.IOException;

public class CthIOException{
    public static void main(String[] args){
        try{
            throw new IOException("IOException Error");
            //throw new digunakan untuk secara eksplisit melempar sebuah exception.
            //throw melempar IOException dengan syntax throw
        }catch(IOException e){
            System.out.println("Terjadi Error " + e);
        }
    }
}

