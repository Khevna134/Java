public class pr6 {
    double width = 1;
    double height = 1;

    public pr6() {
    }

    public pr6(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        pr6 r1 = new pr6();
        pr6 r2 = new pr6(5, 3);

        System.out.println("Rectangle 1 Area: " + r1.getArea());
        System.out.println("Rectangle 1 Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle 2 Area: " + r2.getArea());
        System.out.println("Rectangle 2 Perimeter: " + r2.getPerimeter());
    }
}
//output
//Rectangle 1 Area: 1.0
//Rectangle 1 Perimeter: 4.0
//Rectangle 2 Area: 15.0
//Rectangle 2 Perimeter: 16.0
