package com.pbo;

public class Modul_Acessing_Att {
    int x = 5;
    int y;

    public static void main(String[] args){
        Modul_Acessing_Att myObj = new Modul_Acessing_Att();
        System.out.println(myObj.x);

        //Modify Attributes
        Modul_Acessing_Att myObj1 = new Modul_Acessing_Att();
        myObj1.y = 40;
        System.out.println(myObj1.y);
    }
}
