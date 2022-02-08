import java.util.Scanner;

public class hienthicacloaihinh {
    public static void main(String[] args) {
        int choice = -1;
        int k = 0;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("menu: ");
            System.out.println("1. hinh chu nhat");
            System.out.println("2. hinh tam giac vuong co day o duoi");
            System.out.println("3. hinh tam giac vuong co day o tren");
            System.out.println("4. hinh tam giac can");
            System.out.println("0. exit");
            System.out.println("nhap lua chon cua ban: ");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("hinh chu nhat:");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("hinh tam giac vuong co day o duoi");
                    for (int i = 1; i < 6; i++) {
                        for (int j = 1; j <= i; j++){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 3:
                    System.out.println("hinh tam giac vuong co day o tren");
                    for (int i = 5; i >=1 ; i--) {
                        for (int j = 1; j <= i; j++){
                            System.out.printf("*");
                        }
                        System.out.printf("\n");
                    }
                    break;
                case 0:
                    System.exit(0);
                case 4:
                    for (int i = 1; i <= 5; ++i, k = 0) {
                        for (int j = 1; j <= 5 - i; ++j) {
                            System.out.print("  ");
                        }
                        while ( k != 2 * i - 1) {
                            System.out.print("* ");
                            ++k;
                        }
                        System.out.println();
                    }
                default:
                    System.out.println("khong co lua chon!");
            }
        }
    }
}
