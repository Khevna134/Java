import java.util.Scanner;

public class pr8 {
    int x, y;

    public pr8() {
        x = 5;
        y = 5;
    }

    public pr8(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public pr8(pr8 p) {
        this.x = p.x;
        this.y = p.y;
    }

    void display() {
        System.out.println("Point: (" + x + ", " + y + ")");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        pr8 p1 = new pr8();
        p1.display();

        int x = sc.nextInt();
        int y = sc.nextInt();

        pr8 p2 = new pr8(x, y);
        p2.display();

        pr8 p3 = new pr8(p2);
        p3.display();
    }
}
//output
//Point: (5, 5)
//Enter x and y:
//10 20
//Point: (10, 20)
//Point: (10, 20)
