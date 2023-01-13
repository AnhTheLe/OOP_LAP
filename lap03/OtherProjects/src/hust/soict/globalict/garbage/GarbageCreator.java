//Họ Và Tên: Lê Thế Anh
//MSSV: 20200018
//Mã lớp TH: 721428
// Lap 03: 24/11/2022
package hust.soict.globalict.garbage;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {
	public static void main(String[] args) {
//		File Files = new File(null);
		String filename = "test.exe";	// test.exe is the name or path to an executable file
		byte[] inputBytes = { 0 };
		long startTime,endTime ; 

		try {
			inputBytes = Files.readAllBytes(Paths.get(filename));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		startTime = System.currentTimeMillis();
		
//		String outputString = "";
//		for(byte b: inputBytes) {
//			outputString += (char)b;
//		}
		
		StringBuilder outputStringBuilder = new StringBuilder();
		for(byte b : inputBytes) {
			outputStringBuilder.append((char)b);
		}
		
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}