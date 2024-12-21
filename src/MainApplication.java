import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextInt();
        double height = scanner.nextInt();

        Circle circle = new Circle();
        Cylinder cylinder = new Cylinder();

        System.out.println(circle.area(radius));
        System.out.println(circle.circumference(radius));
        System.out.println(cylinder.surfaceArea(radius, height));
        System.out.println(cylinder.volume(radius, height));
    }
}