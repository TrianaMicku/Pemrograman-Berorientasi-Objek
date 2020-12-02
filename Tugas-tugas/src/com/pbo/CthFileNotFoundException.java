package com.pbo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class CthFileNotFoundException{
    public static void main(String[] args) {
        try{
            Scanner test = new Scanner
                    (new File("FileNotFoundException Error"));
        }catch (FileNotFoundException e) {
            System.out.println("Terjadi Error : " + e);
        }
    }
}
