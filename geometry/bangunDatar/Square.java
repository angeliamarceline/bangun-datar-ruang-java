package bangunDatar;

public class Square {
    // Attribute
    private double side;

    //Getter Setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    //Constructor
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    //Methods
    public double getSquareArea() {
        double squareArea;
        squareArea = side * side;
        return squareArea;
    }

    public double getSquarePerimeter() {
        double squarePerimeter;
        squarePerimeter = 4 * side;
        return squarePerimeter;
    }
    
}
