package bangunDatar;

public class Triangle {
    //Attribute
    private double base;
    private double height;

    //Getter Setter
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //Constructor
    public Triangle() {
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //Methods
    public double getTriangleArea() {
        double triangleArea;
        triangleArea = base * height / 2;
        return triangleArea;
    }

    public double phytagoreanTheorem(double base, double height){
        double phytagoreanTheorem = Math.sqrt( Math.pow(base,2) + Math.pow(height,2) );
        return phytagoreanTheorem;
    }

    public double getTrianglePerimeter() {
        double trianglePerimeter;
        trianglePerimeter = base + height + phytagoreanTheorem(base, height);
        return trianglePerimeter;
    }
    
    
}
