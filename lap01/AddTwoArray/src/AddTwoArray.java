/*Họ và tên: LÊ Thế Anh
 *MSSV: 20200018
 *Mã Lớp: 721428
 *Exercise 6.6:	Viết chương trình Java để cộng hai ma trận có cùng kích thước.
 *The array can be entered by the user or a constant
 */
import java.util.Scanner;
public class AddTwoArray {
 public static void main(String args[])
   {
	 // m,n lần lượt là số hàng và số cột
      int m, n, c, d;
      Scanner in = new Scanner(System.in);
      // Nhập số hàng và số cột
      System.out.println("Input number of rows of matrix");
      m = in.nextInt();
      System.out.println("Input number of columns of matrix");
      n  = in.nextInt();
      
      // Khởi tạo mảng
      int array1[][] = new int[m][n];
      int array2[][] = new int[m][n];
      int sum[][] = new int[m][n];
      // Nhập phần mảng thứ 1
      System.out.println("Input elements of first matrix");
 
      for (  c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array1[c][d] = in.nextInt();
   // Nhập phần mảng thứ 2
      System.out.println("Input the elements of second matrix");
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
            array2[c][d] = in.nextInt();
 
      for ( c = 0 ; c < m ; c++ )
         for ( d = 0 ; d < n ; d++ )
             sum[c][d] = array1[c][d] + array2[c][d]; 
      // Tính tổng của hai mảng
      System.out.println("Sum of the matrices:-");
 
      for ( c = 0 ; c < m ; c++ )
      {
         for ( d = 0 ; d < n ; d++ )
            System.out.print(sum[c][d]+"\t");
 
         System.out.println();
      }
   }
}
