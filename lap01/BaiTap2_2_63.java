//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022

// Viết chương trình giải phương trình bậc hai ax^2 + bx + c = 0 
import java.util.Scanner;

/**
 * Giải phương trình bậc 2
 * 
 * @author viettuts.vn
 */
public class BaiTap2_2_63 {
    private static Scanner scanner = new Scanner(System.in);

    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Nhập các hệ số
        System.out.print("Nhap he so bac 2, a = ");
        float a = BaiTap2_2_63.scanner.nextFloat();
        System.out.print("Nhap he so bac 1, b = ");
        float b = BaiTap2_2_63.scanner.nextFloat();
        System.out.print("Nhap he so tu do, c = ");
        float c = scanner.nextFloat();
        BaiTap2_2_63.giaiPTBac2(a, b, c);
    }

    /**
     * Giải phương trình bậc 2: ax2 + bx + c = 0
     * 
     * a: hệ số bậc 2
     * b: hệ số bậc 1
     * c: số hạng tự do
     */
    public static void giaiPTBac2(float a, float b, float c) {
        // kiểm tra các hệ số
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phuong trinh vo nghiem!");
            } else {
                System.out.println("Phuong trinh co mot nghiem: "
                        + "x = " + (-c / b));
            }
            return;
        }
        // tính delta
        float delta = b * b - 4 * a * c;
        float x1;
        float x2;
        // tính nghiệm
        if (delta > 0) {
            x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
            x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
            System.out.println("Phuong trinh co hai nghiem la: "
                    + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phuong trinh co mot nghiem kep: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phuong trinh vo nghiem!");
        }
    }
}