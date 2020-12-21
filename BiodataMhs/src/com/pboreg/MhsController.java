package com.pboreg;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.ResourceBundle;

public class MhsController implements Initializable {
    private MhsKoneksi koneksi = new MhsKoneksi();
    @FXML
    private TextField textNIM;
    @FXML
    private TextField textNama;
    @FXML
    private TextField textUmur;
    @FXML
    private ChoiceBox<String> selectProdi;
    ObservableList list = FXCollections.observableArrayList();
    @FXML
    private Button button;

    public void submitOnClick(ActionEvent actionEvent) {
        String NIM = textNIM.getText();
        textNIM.setText("");
        String nama = textNama.getText();
        textNama.setText("");
        String umur = textUmur.getText();
        textUmur.setText("");
        String prodi = (String) selectProdi.getValue();

        //menginput data mahasiswa ke tabel mahasiswa database pbo-reguler
        String query = "INSERT INTO mahasiswa(nim,nama,umur,prodi) VALUES(" + NIM + ", '" + nama + "', " + umur + ", '" + prodi + "')";
        int hasil = koneksi.manipulasiData(query);
        if (hasil == 1) {
            System.out.println("Data " + nama + " berhasil diinput ke dalam tabel");
        }
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listProdi(); //untuk memanggil semua isi list prodi yang sudah ada
    }

    @FXML
    public void listProdi(){
        list.removeAll(list); // removeAll menghapus semua isi list jika ada salah satu list yang terpilih
        String a = "Akuntansi";
        String b = "Arsitektur";
        String c = "Desain Produk";
        String d = "Desain Komunikasi Visual ";
        String e = "Ilmu Komunikasi";
        String f = "Informatika";
        String g = "Manajemen";
        String h = "Psikologi";
        String i = "Sistem Informasi";
        String j = "Teknik Sipil";
        list.addAll(a,b,c,d,e,f,g,h,i,j);
        selectProdi.getItems().addAll(list);
    }
}