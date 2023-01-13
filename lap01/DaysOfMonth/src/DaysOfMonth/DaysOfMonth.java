/*Họ và tên: LÊ Thế Anh
 *MSSV: 20200018
 *Mã Lớp: 721428
 *27/10/2022
 * Exercise 6.4	Write a program to display the number of days of a month, which is entered by users (both month and year).
 *  If it is an invalid month/year, ask the user to enter again.
 */

/*
 * -	Người dùng có thể nhập một tháng bằng tên đầy đủ, chữ viết tắt, bằng 3 chữ cái hoặc số
 * -	Người dùng phải nhập một năm bằng số không âm và nhập tất cả các chữ số
 * -	Một năm là năm chung có 365 ngày hoặc năm nhuận có 366 ngày
 */
package DaysOfMonth;
import  java.util.Scanner;

//Class chính tính số ngày trong tháng mà người dùng nhập vào; đồng thời yêu cầu nhập lại nếu không hợp lệ
public class DaysOfMonth {
	
	public static void checkMonth_Day_Year() {
		//Tạo đối tượng
		InputMonth inputMonth = new InputMonth();
		InputYear inputYear = new InputYear();
		int check = 0;
		// Check xem tháng năm người dùng nhập vào có hợp lệ không, đồng thời tính số ngày trong tháng đó
		while(check == 0) {
			//Nhập tháng năm
			inputMonth.InputMonth();
			inputYear.InputYear();
			switch(inputMonth.month) {
				case "January":  case "12": case "10":	case "8":   case "7":  case "5":  case "3":  case "1":	case "Dec": case "Oct":	case "Aug": case "Jul": case "Mar":	case "March":	case "May": case "July": case "August": case "October": case "December": case "Jan": 
					System.out.println("This month has 31 days!"); check = 1; break;
				case "April":	case "11": 	case "9":  case "6": 	case "4": 	case "Nov": 	case "Sep": 	case "June":	case "September": 	case "November":	case "Apr": 	case "Jun": 
					System.out.println("TThis month has 30 days!"); check = 1;break;
				case "February":	case "Feb":  case "2": 
					if(inputYear.year_cmt%400==0 || (inputYear.year_cmt%4==0 && inputYear.year_cmt%100!=0))
					{
						System.out.println("This month has 29 days!");
						check = 1;
					}
					else {
						System.out.println("This month has 28 days!");
						check = 1;	
					}
					break;
				default: System.out.println("You entered the wrong month: Please re-enter!!\n-----------------------------------------------------------------------"); 
							check = 0;
							break;
			}
		}

//		System.out.println("Thanks!");
	}
	
	public static void main(String[] args) {
		checkMonth_Day_Year();
	}
}
