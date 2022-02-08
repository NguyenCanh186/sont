import java.util.Scanner;

public class ucln {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner input = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = input.nextInt();
        System.out.println("nhap so b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0){
            System.out.println("moi ban nhap lai");
        }
        while (a != b) {
            if (a>b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("uoc chung lon nhat cua 2 so la: " +a);
    }
}
