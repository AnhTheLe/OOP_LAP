package DaysOfMonth;
import java.util.*;
public class InputDay {
	int day;
	public void InputDay() {
		Scanner scDay = new Scanner(System.in);
		System.out.println("Please input your day: ");
		this.day = scDay.nextInt();
	}
}

