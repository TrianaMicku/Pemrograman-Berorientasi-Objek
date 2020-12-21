package com.pboreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Observable;
import java.sql.ResultSet;

public class PesanController {
    public TextField textPesan;
    public Label labelPesan;
    public ListView<String> listViewPesan;
    private Koneksi koneksi = new Koneksi();

    public void buttonPesanOnClick(ActionEvent actionEvent) {
        String text = textPesan.getText();
        labelPesan.setText(text);

        //INPUT DATA KE TABEL PESAN PADA DATABASE pbo-reguler
        String query = "Insert into pesan(isipesan) values ('" + text + "')";
        int hasil = koneksi.manipulasiData(query); // hasilnya 1
        if (hasil == 1){
            System.out.println("Data berhasil diinput kedalam tabel");
            tampilData();
        }
    }

    public void tampilData(){
        try{
            String query = "SELECT * FROM pesan";
            ResultSet hasil = koneksi.getData(query);
            ObservableList<String> items = FXCollections.observableArrayList();
            listViewPesan.setItems(items);

            while (hasil.next()){
                items.add(hasil.getString(2));
            }
        }catch (Exception e){
            System.out.println("Error : " + e.getMessage());
        }

    }
}
