//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022
//exercise 6.1:	Viết, biên dịch và chạy chương trình ChooseOption:
import javax.swing.JOptionPane;
public class ChooseOption {
	public static void main(String[] args) {
		int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket? ");
		JOptionPane.showConfirmDialog(null, "You've chosen:" + (option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}

