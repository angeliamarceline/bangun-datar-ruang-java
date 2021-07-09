package bangunDatar;

public class Circle {
    // Attribute
    private double phi = 3.14159265358979323846;
    private double radius;

    // Getter Setter
    public double getPhi() {
        return phi;
    }

    public void setPhi(double phi) {
        this.phi = phi;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Constructor
    public Circle() {
    }

    public Circle(double phi, double radius) {
        this.phi = phi;
        this.radius = radius;
    }

    // Methods
    public double getCircleArea() {
        double circleArea;
        circleArea = phi * radius * radius;
        return circleArea;
    }

    public double getCircleCircumference() {
        double circleCircumference;
        circleCircumference = 2 * phi * radius;
        return circleCircumference;
    }

}
