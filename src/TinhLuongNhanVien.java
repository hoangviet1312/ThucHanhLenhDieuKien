import java.util.Scanner;

public class TinhLuongNhanVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Hay nhap So nam lam viec : ");
        int namlamviec = sc.nextInt();
        System.out.println("Hay nhap He so luong: ");
        int hsl = sc.nextInt();

        if (hsl < 0 || hsl > 5) {
            System.out.println("Ban da nhap sai he so luong!");
        } else {
            int luong = hsl * 4000000 + namlamviec * 500000;
            System.out.println("Luong hang thang cua ban la: " + luong);
        }
    }
}
