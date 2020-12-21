package sample;

public class Operator {
    public int kalkulator(int n1, int n2, char kabataku){
        switch (kabataku){ //kali,bagi,tambah,kurang
            case '+':
                return n1 + n2;
            case '-':
                return n1 - n2;
            case '*':
                return n1 * n2;
            case '/':
                return n1 / n2;
        }
        return 0;
    }
}
