import java.util.Scanner;

public class pr5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        if (a + b > c && a + c > b && b + c > a) {
            double s = (a + b + c) / 2;
            double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            System.out.printf("Area = %.2f", area);
        } else {
            System.out.println("Invalid triangle");
        }
    }
}
//output
//Enter three sides:
//3 4 5
//Area = 6.00
