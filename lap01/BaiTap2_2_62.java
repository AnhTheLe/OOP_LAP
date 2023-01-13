
//Họ và tên: LÊ Thế Anh
//MSSV: 20200018
//Mã Lớp: 721428
//* 27/10/2022

// Viết chương trình giải hệ phương trình bậc nhất hai ẩn, x và y : a1.x + b1.y = c1; a2.x + b2.y = c2
import java.util.*;

public class BaiTap2_2_62 {
    static double a1, b1, c1;
    static double a2, b2, c2;

    // Nhập các hệ số a1,b1,c1,a2,b2,c2 từ bàn phím
    public static void Input() {
        Scanner s = new Scanner(System.in);
        System.out.println("------------SSG-----------");
        System.out.println("Vao he so: a1, b1, c1 2= ");
        a1 = s.nextDouble();
        b1 = s.nextDouble();
        c1 = s.nextDouble();
        System.out.println("--Het PT1. Moi ban Nhap PT2--");
        System.out.println("a2, b2, c2 = ");
        a2 = s.nextDouble();
        b2 = s.nextDouble();
        c2 = s.nextDouble();
        System.out.println("-------Hoan thanh Nhap-------");
        System.out.println("");
    }

    // Giai bằng phương pháp thế
    public static void PhuongPhapThe() {
        double b11 = b1 * a2;
        double c11 = c1 * a2;
        double b22 = b2 * a1;
        double c22 = c2 * a1;

        double y = (c22 - c11) / (b11 - b22);
        System.out.println("y = " + y);
        double x = (-c11 - b11 * y) / (a1 * a2);
        System.out.println("x = " + x);
    }

    /**
     * pt:(ax+b+c=0) => a1 b1 -c1
     * Return: D[0] = D a1b2 - a2b1
     * D[1]= Dx c1.b2 - b1.c2
     * D[2]= Dy a1.c2 - c1. a2
     */
    // Giai bằng định thức
    public static Double[] DinhThuc() {
        Double D[] = new Double[3];
        D[0] = (a1 * b2) - (a2 * b1);
        D[1] = ((-(c1)) * b2) - (b1 * (-(c2)));
        D[2] = (a1 * (-(c2))) - (a2 * (-(c1)));
        return D;
    }

    // Kiểm tra vô nghiệm
    public static boolean CheckVoNghiem() {
        boolean check = true;
        if (((a1 / a2) == (b1 / b2)) && ((c1 / c2) == (b1 / b2)))
            check = false;
        if ((a1 == 0 && a2 == 0) || (a2 == 0 && b2 == 0))
            check = false;
        double c = DinhThuc()[0];
        if (c == 0)
            check = false;
        return check;
    }

    public static void main(String[] args) {
        Input();
        if (!CheckVoNghiem()) {
            System.out.println("TB: PT VÔ NGHIÊM");
        } else {
            System.out.println("-----NGHIEM THEO PHUONG PHAP THẾ-------");
            PhuongPhapThe();
            Double D[] = DinhThuc();
            System.out.println("----NGHIEM THEO ĐỊNH THỨC-----");
            System.out.println("Phuong trinh co nghiem la:");
            System.out.println("y= " + D[2] / D[0]);
            System.out.println("x= " + D[1] / D[0]);

        }
    }

}