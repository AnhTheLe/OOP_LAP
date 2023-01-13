//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022
//Example 3: HelloNameDialog.java
import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Please enter your name");
        JOptionPane.showMessageDialog(null, "hi " + result + "!");
        System.exit(0);
    }
}