//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
// Lap 03: 24/11/2022
package hust.soict.globalict.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r = new Random(123);
		long start = System.currentTimeMillis();
		String s = "";
		for(int i = 0; i < 65536; i++)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start); //This prints roughly 4500.
		
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < 65536 ; i++) {
			sb.append(r.nextInt(2));
		s = sb.toString();
		System.out.println(System.currentTimeMillis() - start);	// This prints 5.
		}
}

}
