public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(7,"Red","Circle");
        Square square = new Square(5,"Blue","Square");

        System.out.println("Circle - Area: "+circle.calculateArea()+" square units, Perimeter: "+circle.calculatePerimeter()+" units");
        System.out.println("Square - Area: "+square.calculateArea()+" square units, Perimeter: "+square.calculatePerimeter()+" units");
    }
}