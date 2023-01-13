package DaysOfMonth;
import java.util.*;
public class InputMonth {
		String month;
		//Nhập tháng từ bàn phím
		public void InputMonth() {
			Scanner scMonth = new Scanner(System.in);
			System.out.println("Please input your month: ");
			this.month = scMonth.next();
		}
}
