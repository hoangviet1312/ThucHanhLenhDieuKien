import java.util.Random;
import java.util.Scanner;

public class XoSoKienThiet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chao mung den voi Xo So Kien Thiet");
        System.out.println("Ban co $5000 trong tai khoan");
        System.out.println("Moi luot choi se mat $1000");

        System.out.println("Nhan 1 de bat dau choi, so khac de thoat");
        int luaChon = scanner.nextInt();

        String hetLuot = "---------------------------------------";

        if(luaChon == 1) {
            int taiKhoan = 5000;
            int soLuot = 0;
            while (taiKhoan > 0)
            {
                Random random = new Random();
                int ketQua = random.nextInt(99);

                System.out.println("So tien con lai : $" + taiKhoan);
                System.out.println("Moi nhap vao du doan : ");
                int duDoan = scanner.nextInt();
                if (duDoan < 0 || duDoan > 99)
                {
                    System.out.println("Du doan khong hop le !");
                } else {
                    soLuot++;
                    taiKhoan = taiKhoan - 1000;

                    String duDoanHopLe = hopLeHoa(duDoan);
                    String ketQuaHopLe = hopLeHoa(ketQua);

                    String ketQuaHopLe_2 = daoNguocSo(ketQua);

                    System.out.println("Luot : " + soLuot);
                    System.out.println("Du doan cua ban la : " + duDoanHopLe);
                    System.out.println("Ket qua Xo So la : " + ketQuaHopLe);

                    if (duDoanHopLe.equals(ketQuaHopLe)) {
                        taiKhoan += 10000;
                        System.out.println("Ban da trung giai $10000 !!!");
                        System.out.println(hetLuot);
                    } else if (duDoanHopLe.equals(ketQuaHopLe_2)) {
                        taiKhoan += 3000;
                        System.out.println("Ban da trung giai $3000 !!!");
                        System.out.println(hetLuot);
                    } else if (giaiBa(duDoan, ketQua)) {
                        taiKhoan += 1000;
                        System.out.println("Ban da trung giai $1000 !!!");
                        System.out.println(hetLuot);
                    } else {
                        System.out.println("Chuc ban may man lan sau");
                        System.out.println(hetLuot);
                    }
                }
            }
            System.out.println("Ban da het tien !!!");
            System.out.println("Ban choi duoc : " + soLuot + " luot");
            System.out.println("Chao tam biet");

        }
        else
        {
            System.out.println("Chao tam biet");
        }

    }

    private static String daoNguocSo(int number)
    {
        String soDN;
        if(number < 10)
        {
            soDN = Integer.toString(number * 10);
        }
        else
        {
            int ones = number % 10;
            int tens = (number - ones) / 10;

            String hangDonVi = Integer.toString(tens);
            String hangChuc = Integer.toString(ones);

            soDN = hangChuc + hangDonVi;
        }
        return soDN;
    }

    private static String hopLeHoa(int number)
    {
        String result = Integer.toString(number);
        if (number < 10)
        {
            result = "0" + result;
        }
        return result;
    }

    private static Boolean giaiBa(int duDoan, int ketQua)
    {
        int duDoan_HDV = duDoan % 10;
        int duDoan_HC = duDoan / 10;

        int ketQua_HDV = ketQua % 10;
        int ketQua_HC = ketQua / 10;

        if(duDoan_HDV == ketQua_HDV || duDoan_HC == ketQua_HDV || duDoan_HDV == ketQua_HC || duDoan_HC == ketQua_HC)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
