package sample;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    private TextField num1;
    @FXML
    private TextField num2;
    @FXML
    private TextField hasil;

    private int n1;
    private int n2;
    private int hsl;
    private Operator OP= new Operator();

   /* @FXML
    public void anyButtonClick(ActionEvent actionEvent){
        Button button = (Button) actionEvent.getSource();
        String string = button.getText();
        char operator = string.charAt(0);
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        hsl = model.kalkulator(n1,n2, operator);
        hasil.setText(String.valueOf(hsl));
    }*/


   @FXML // jika tidak memakai @FXML maka method tidak akan terpanggil di scene builder
    void tambahClick() {
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        hsl = OP.kalkulator(n1,n2,'+');
        hasil.setText(String.valueOf(hsl));
    }
    @FXML
    void kurangClick() {
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        hsl = OP.kalkulator(n1,n2,'-');
        hasil.setText(String.valueOf(hsl));
    }
    @FXML
    void kaliClick() {
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        hsl = OP.kalkulator(n1,n2,'*');
        hasil.setText(String.valueOf(hsl));
    }
    @FXML
    void bagiClick() {
        n1 = Integer.parseInt(num1.getText());
        n2 = Integer.parseInt(num2.getText());
        hsl = OP.kalkulator(n1,n2,'/');
        hasil.setText(String.valueOf(hsl));
    }
    @FXML
    void Clear(ActionEvent actionEvent) {
        num1.setText(null);
        num2.setText(null);
        hasil.setText(null);
    }
}
