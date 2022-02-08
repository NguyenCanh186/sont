import java.util.Scanner;

public class laisuat {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double ls = 1.0;
        Scanner input  = new Scanner(System.in);
        System.out.println("nhap so tien");
        money = input.nextDouble();
        System.out.println("nhap so thang gui");
        month = input.nextInt();
        System.out.println("nhap so lai suat");
        ls = input.nextDouble();
        double tong = 0;
        for (int i = 0; i < month; i++) {
            tong += money * (ls/100)/12 * month;
         }
        System.out.println("so tien sau khi gui la: " + tong);
    }
}
