//Họ và tên: Kiều Anh Bằng
//Mssv: 202418848
//Date: 11-03-2026
import java.util.Scanner;

public class VeCayThong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chiều cao của cây thông ");
        int x = sc.nextInt();
        if (x <= 0) {
            System.out.println("chiều cao phải lớn hơn 0");
        }
        if (x == 1) {
            System.out.println("*");
        }
        if (x == 2) {
            System.out.println("*\n*");
        }
        if (x > 2) {
            int n = x - 2;
            for (int i = 1; i <= n; i++) {
                for (int a = 0; a < n - i; a++) {
                    System.out.print(" ");
                }
                for (int g = 0; g < (2 * i - 1); g++) {
                    System.out.print("*");
                }
                System.out.println(" ");
            }
            for (int i = 1; i <=2; i++) {
                for (int a = 0; a < n-1 ; a++) {
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}
