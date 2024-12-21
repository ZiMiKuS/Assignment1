public class Circle {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double circumference(double radius) {
        return (2 * Math.PI * radius);
    }

    public double area(double radius) {
        return (Math.PI * radius * radius);
    }

    @Override
    public String toString() {
        return "Circle with radius: " + radius;
    }
}

