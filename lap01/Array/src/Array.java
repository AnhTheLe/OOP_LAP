/*Họ và tên: LÊ Thế Anh
 *MSSV: 20200018
 *Mã Lớp: 721428
 *Exercise 6.5:	Viết chương trình Java để sắp xếp một mảng số và tính tổng và giá trị trung bình của các phần tử mảng.
 *The array can be entered by the user or a constant
 */
import java.util.Scanner;
public class Array {
	public static void main(String[] args) {
		//Nhập mảng:
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of words in the array: ");
		int n = sc.nextInt();
		
		double[] arr = new double[n];
		System.out.println("Input elements of array");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		// Biến Tổng
		double Sum = 0;
		
		// Xắp xếp mảng tăng dần
	    for (int i = 0; i < n; i++) {
	        for (int j = i + 1; j < n; j++) {
	            if (arr[i] > arr[j]) {
	                // If arr[i] > arr[j], swap the value of arr[i] and arr[j]
	                double temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }
	    }
	    System.out.println("Array after sorting is: ");
	    // Mảng sau khi sắp xếp
		for (int i = 0; i < n; i++) {
			Sum = Sum + arr[i];
			System.out.print(arr[i] + " ");
		}
		//Biến trung bình cộng
		double Avg = Sum/n;
		System.out.println("\nSum of array elements: " + Sum);
		System.out.println("Average of array elements: " + Avg);
	}
}