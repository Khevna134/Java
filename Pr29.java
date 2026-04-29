import java.util.ArrayList;
import java.util.Collections;

public class pr29 {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();

        marks.add(75);
        marks.add(88);
        marks.add(92);
        marks.add(67);
        marks.add(81);

        System.out.println("Marks: " + marks);

        int max = Collections.max(marks);
        int min = Collections.min(marks);

        System.out.println("Highest Marks: " + max);
        System.out.println("Lowest Marks: " + min);
    }
}
