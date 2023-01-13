
package DaysOfMonth;
import java.util.*;

import com.sun.source.tree.WhileLoopTree;
public class InputYear {
	String year;
	int year_cmt;
	int result;
	public void InputYear() {
		//Nhập năm
		Scanner scYear = new Scanner(System.in);
		System.out.println("Please input your year: ");
		this.year = scYear.next();
		year_cmt = Integer.parseInt(year);
		result = count(year_cmt);
		// Kiểm tra xem năm nhập vào có đủ 4 chữ số hay không
		while (result != 4) {
			//Yêu cầu nhập lại
			System.out.println("The year you entered is not valid, please re-enter!\n-----------------------------------------------\n ");
			System.out.println("Please input your year: ");
			this.year = scYear.next();
			year_cmt = Integer.parseInt(year);
			result = count(year_cmt);
			// if(result == 4) continue Label("Hi There!");
		};
	}
	//Hàm tính số chữ số của số nguyên n
	public int count (int n) {
		if (n < 10) return 1;
		else return 1 + count(n/10);
	}
}	
