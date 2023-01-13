
import java.util.Scanner;

//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022
// Exercite 6.3
// Viết chương trình hiển thị một tam giác có chiều cao n sao (*), n do người dùng nhập vào
public class triangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int hight, k = 0;
    System.out.printf("\n\nNhập vào chiều cao của kim tự tháp: ");
    hight = sc.nextInt();
    //Vòng for đầu tiên có nhiệm vụ in xuống dòng các dầu "*"
    for (int i = 1; i <= hight; ++i, k = 0) {
    	//Vòng for thứ 2 in ra các khoảng trắng
      for (int space = 1; space <= hight - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
 
    System.out.println("\n----------------------------------");
  }
}
