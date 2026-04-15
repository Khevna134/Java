public class pr9 {
    double width;
    double height;

    public pr9(double width, double height) {
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
        pr9 r1 = new pr9(4, 40);
        pr9 r2 = new pr9(3.5, 35.9);

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has larger area");
        } else if (r1.getArea() < r2.getArea()) {
            System.out.println("\nRectangle 2 has larger area");
        } else {
            System.out.println("\nBoth rectangles have equal area");
        }
    }
}
//output
//Rectangle 1:
//Width: 4.0
//Height: 40.0
//Area: 160.0
//Perimeter: 88.0

//Rectangle 2:
//Width: 3.5
//Height: 35.9
//Area: 125.65
//Perimeter: 78.8

//Rectangle 1 has larger area
