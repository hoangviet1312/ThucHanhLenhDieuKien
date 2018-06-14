import java.util.Scanner;

public class GiaiPhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Day la chuong trinh giai phuong trinh bac nhat");
        System.out.println("Cho phuong trinh ' a*x + b = c '. \nMoi nhap vao tham so a, b ");

        System.out.println("a : ");
        double a = scanner.nextDouble();
        System.out.println("b : ");
        double b = scanner.nextDouble();
        System.out.println("c : ");
        double c = scanner.nextDouble();

        if (a == 0)
        {
            if (b == c)
            {
                System.out.println("Phuong trinh dung voi moi x");
            }
            else
            {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
        if (a != 0)
        {
            double x = (c - b)/ a;
            System.out.println("Nghiem cua phuong trinh la : " + x);
        }

    }
}
