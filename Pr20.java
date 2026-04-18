public class pr20 {
    public static void main(String[] args) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;
            System.out.println("Result: " + result);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please provide two command-line arguments");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero not allowed");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
//output
//> java pr20 10 2
//Result: 5
//> java pr20 10 0
//Error: Division by zero not allowed
