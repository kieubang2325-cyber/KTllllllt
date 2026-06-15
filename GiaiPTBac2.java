//Họ và tên: Kiều Anh Bằng
//Mssv: 202418848
//Date: 11-03-2026
import java.util.Scanner;

public class GiaiPTBac2 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Mời nhập hệ số a b c của x^2, x, x^0 ");
        sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double x1,x2;
        if (a==0){
            System.out.println("hệ số x^2 phải khác 0");
        }
        else{
            double delta= Math.pow(b,2 )-4*a*c;
            System.out.println(+delta);
            if (delta ==0){
                double nghiem= (-b/(2*a));
                System.out.println("PT có nghiệm kép x1=x2="+nghiem);
            }
            if (delta>0) {
                x1 = -(b + Math.sqrt(delta)) / (2 * a);
                x2 = -(b - Math.sqrt(delta)) / (2 * a);
                System.out.println("pt có 2 nghiệm phân biệt x1=" + x1 + " x2=" + x2);
            }
            if (delta<0){
                double phuc =Math.sqrt(-delta)/(2*a);
                System.out.println("phương trình có nghiệm phức là x1="+ (-b/(2*a)) +"+" +phuc+"i");
                System.out.println("phương trình có nghiệm phức là x2="+ (-b/(2*a)) +"-" +phuc+"i");
            }
        }


    }
}
