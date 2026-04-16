import java.util.Scanner;

public class pr1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.printf("Distance in feet: %.2f", feet);
    }
}

//output
//Enter distance in meters: 5
//Distance in feet: 16.40
