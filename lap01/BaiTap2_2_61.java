
//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022

// Viết chương trình giải phương trình ax + b=0 với a, b do người dùng nhập từ bàn phím
import java.text.DecimalFormat;
import java.util.*;

public class BaiTap2_2_61 {
    // ----------------------------------------------------------------------------------------------------------
    public static void GiaiPhuongTrinhBac1() {
        int aNumber, bNumber;
        double nghiem;
        DecimalFormat decimalFormat = new DecimalFormat("#.##"); // làm tròn đến 2 chữ số thập phân
        
        //Nhập số a và b
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        aNumber = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        bNumber = scanner.nextInt();
        
        //Giair phương trình
        System.out.println("Phương trình bạn vừa nhập vào là: " + aNumber + "x + " + bNumber + " = 0.");
        if (aNumber == 0) {
            if (bNumber == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -bNumber / aNumber; // ép kiểu để cho ra kết quả chính xác
            System.out.println("Phương trình có nghiệm x = " + decimalFormat.format(nghiem) + ".");
        }
    }

    // ----------------------------------------------------------------------------------------------------------
    public static void main(String args[]) {
        GiaiPhuongTrinhBac1();
    }
}
