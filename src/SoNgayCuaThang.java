import java.util.Scanner;

public class SoNgayCuaThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao mot thang trong nam : ");
        int thang = scanner.nextInt();

        switch (thang)
        {
            case 1:
            System.out.println("Thang " + 1 + " co 31 ngay");
            break;
            case 2:
            System.out.println("Thang " + 2 + " co 28 ngay");
            break;
            case 3:
            System.out.println("Thang " + 3 + " co 31 ngay");
            break;
            case 4:
            System.out.println("Thang " + 4 + " co 30 ngay");
            break;
            case 5:
            System.out.println("Thang " + 5 + " co 31 ngay");
            break;
            case 6:
            System.out.println("Thang " + 6 + " co 30 ngay");
            break;
            case 7:
            System.out.println("Thang " + 7 + " co 31 ngay");
            break;
            case 8:
            System.out.println("Thang " + 8 + " co 31 ngay");
            break;
            case 9:
            System.out.println("Thang " + 9 + " co 30 ngay");
            break;
            case 10:
            System.out.println("Thang " + 10 + " co 31 ngay");
            break;
            case 11:
            System.out.println("Thang " + 11 + " co 30 ngay");
            break;
            case 12:
            System.out.println("Thang " + 12 + " co 31 ngay");
            break;
        }

    }
}