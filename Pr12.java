public class pr12 {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {
        pr12 obj = new pr12();

        double cube = obj.calculateVolume(3);
        double rect = obj.calculateVolume(4, 5, 6);
        double sphere = obj.calculateVolume(2.5f);

        System.out.println("Cube Volume: " + cube);
        System.out.println("Rectangular Cube Volume: " + rect);
        System.out.println("Sphere Volume: " + sphere);
    }
}
//Cube Volume: 27.0
//Rectangular Cube Volume: 120.0
//Sphere Volume: 65.44984694978736
