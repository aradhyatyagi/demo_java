
interface Rect {
    double Area();
    double Perimeter();
}


class Rectangle implements Rect {
    protected double length;
    protected double width;
    
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    
    public double Area() {
        return length * width;
    }
    
    
    public double Perimeter() {
        return 2 * (length + width);
    }
}


class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }
}


public class Shape {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 4);
        System.out.println("Rectangle Area: " + rectangle.Area());
        System.out.println("Rectangle Perimeter: " + rectangle.Perimeter());
        
        Square square = new Square(5);
        System.out.println("Square Area: " + square.Area());
        System.out.println("Square Perimeter: " + square.Perimeter());
    }
}

