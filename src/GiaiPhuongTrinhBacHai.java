import java.util.Scanner;

public class GiaiPhuongTrinhBacHai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Day la chuong trinh giai phuong trinh bac 2 cos dang a*x*x + b*x + c = 0");
        System.out.println("Moi nhap cac tham so dau vao: ");
        System.out.println("Nhap a: ");
        double a = sc.nextDouble();
        System.out.println("Nhap b: ");
        double b = sc.nextDouble();
        System.out.println("Nhap c: ");
        double c = sc.nextDouble();

        double[] x = new double[2];

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("Phuong trinh co vo so nghiem!");

                } else {
                    System.out.println("Phuong trinh vo nghiem!");
                }
            } else {
                x[0] = -c / b;
                System.out.println("Phuong trinh co nghiem x = " + x[0]);
            }
        } else {
            double delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Delta =" + delta);
                System.out.println("Phuong trinh vo nghiem!");
            } else if (delta == 0) {
                x[0] = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kép là x = " + x[0]);
            } else {
                x[0] = (-b + Math.sqrt(delta)) / (2 * a);
                x[1] = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem la x1 = " + x[0] + ", x2 = " + x[1]);
            }
        }
    }
}
