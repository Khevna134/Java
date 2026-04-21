public class pr21 {

    void checkEligibility(int age) {
        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        pr21 obj = new pr21();

        int[] ages = {16, 20};

        for (int age : ages) {
            try {
                System.out.println("Checking age: " + age);
                obj.checkEligibility(age);
            } catch (IllegalArgumentException e) {
                System.out.println("Exception: " + e.getMessage());
            } finally {
                System.out.println("Validation process completed");
            }
            System.out.println();
        }
    }
}
//output
//Checking age: 16
//Exception: Age must be 18 or above to vote
//Validation process completed

//Checking age: 20
//Eligible to vote
//Validation process completed
