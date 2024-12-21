public class Cylinder {
    public double radius;
    public double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public Cylinder() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double surfaceArea(double radius, double height) {
        return (2 * Math.PI * radius * height);
    }

    public double volume(double radius, double height) {
        return (Math.PI * radius * radius * height);
    }

    @Override
    public String toString() {
        return "Cylinder with radius: " + radius +  " and height: " + height;
    }
}
