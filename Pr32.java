import java.util.LinkedList;

public class pr32 {

    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        LinkedList<Integer> rollNumbers = new LinkedList<>();
        rollNumbers.add(101);
        rollNumbers.add(102);
        rollNumbers.add(103);

        LinkedList<String> names = new LinkedList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");

        System.out.println("Search 102 in roll numbers: " + searchElement(rollNumbers, 102));
        System.out.println("Search 105 in roll numbers: " + searchElement(rollNumbers, 105));

        System.out.println("Search Alice in names: " + searchElement(names, "Alice"));
        System.out.println("Search Tom in names: " + searchElement(names, "Tom"));
    }
}
