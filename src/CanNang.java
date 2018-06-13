import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {
        double weight;
        double height;
        double BMI;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap can nang (kg)  : ");
        weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao (m) : ");
        height = scanner.nextDouble();

        BMI = weight / (height * height);

        if (BMI < 18.5)
        {
            System.out.println("Underweight BMI : " + BMI);
        }
        else if (18.5 <= BMI && BMI < 25.0)
        {
            System.out.println("Normal BMI : "+ BMI);
        }
        else if (25.0 <= BMI && BMI < 30.0)
        {
            System.out.println("Overweight BMI : " + BMI);
        }
        else if(BMI >= 30.0)
        {
            System.out.println("Obese BMI : " + BMI);
        }
    }
}
