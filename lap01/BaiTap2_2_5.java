
//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022
//Example 2.2.5:	trình tính tổng, hiệu , tích, thương của 2 số đôi một do người dùng nhập vào.
import java.text.DecimalFormat;
import java.util.Scanner;

public class BaiTap2_2_5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		//Nhập số 
		System.out.println("Nhập vào số thứ nhất: ");
		int firstNumber = scanner.nextInt();
		System.out.println("Nhập vào số thứ hai: ");
		int secondNumber = scanner.nextInt();

		// 1. Tính tổng, hiệu, tích, thương, phép chia lấy dư của 2 số đó.
		// Tính Tổng hai số
		int tong = firstNumber + secondNumber;
		System.out.println(firstNumber + " + " + secondNumber + " = " + tong);
		// Tính hiệu hai số
		int hieu = firstNumber - secondNumber;
		System.out.println(firstNumber + " - " + secondNumber + " = " + hieu);
		// Tính tích hai số
		int tich = firstNumber * secondNumber;
		System.out.println(firstNumber + " * " + secondNumber + " = " + tich);
		// Tính thương hai số
		float thuong = (float) firstNumber / secondNumber;
		System.out.println(firstNumber + " / " + secondNumber + " = " +
				decimalFormat.format(thuong)); // làm tròn thương đến 2 chữ số thập phân
		// Tính phân dư khi chia hai số
		int phanDu = firstNumber % secondNumber;
		System.out.println(firstNumber + " % " + secondNumber + " = " + phanDu);
	}
}
