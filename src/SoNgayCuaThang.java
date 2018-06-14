import java.util.Scanner;

public class SoNgayCuaThang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao mot thang trong nam : ");
        int thang = scanner.nextInt();

        String soNgayTrongThang = "";
        switch (thang)
        {
            case 1:
                soNgayTrongThang = "31";
                break;
            case 2:
                soNgayTrongThang = "28 hoac 29";
                break;
            case 3:
                soNgayTrongThang = "31";
                break;
            case 4:
                soNgayTrongThang = "30";
                break;
            case 5:
                soNgayTrongThang = "31";
                break;
            case 6:
                soNgayTrongThang = "30";
                break;
            case 7:
                soNgayTrongThang = "31";
                break;
            case 8:
                soNgayTrongThang = "31";
                break;
            case 9:
                soNgayTrongThang = "30";
                break;
            case 10:
                soNgayTrongThang = "31";
                break;
            case 11:
                soNgayTrongThang = "30";
                break;
            case 12:
                soNgayTrongThang = "31";
                break;
            default:
                System.out.println("So thang khong hop le");
                break;
        }
        if (!soNgayTrongThang.equals("")) {
            System.out.println("Thang " + thang + " co " + soNgayTrongThang + " ngay !");
        }
    }
}
