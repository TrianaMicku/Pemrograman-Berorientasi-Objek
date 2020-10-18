package com.pbo;

public class Modul_Constructor_Paramenters {
    //car
    int modelYear;
    String modelName;

    public Modul_Constructor_Paramenters(int year, String name){
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args){
        Modul_Constructor_Paramenters myCar = new Modul_Constructor_Paramenters (1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}
