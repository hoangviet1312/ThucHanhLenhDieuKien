import java.util.Scanner;

public class CanNang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap can nang (kg)  : ");
        double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao (m) : ");
        double height = scanner.nextDouble();

        double BMI = weight / (height * height);

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
