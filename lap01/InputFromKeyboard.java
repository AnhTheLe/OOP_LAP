//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022
//Exercise 6.2:	Viết chương trình nhập / xuất từ bàn phím
import java.util.Scanner;
public class InputFromKeyboard{
	public static void main(String args[]){
		Scanner keyboard = new Scanner(System. in);
		System. out.println("What's your name?");
		String strName = keyboard.nextLine();
		System. out.println("How old are you? (m)");

		int iAge = keyboard.nextInt();

		System. out.println("How tall are you (m)?");
		double dHeight = keyboard.nextDouble();

		//similar to other data types
		//nextByte(), nextShort(), nextLong()
		//nextFloat(), nextBoolean()

		System. out.println("Mrs/Ms. " + strName + ", " + iAge + " years old. "+ "Your height is " + dHeight + ".");
	}
}
