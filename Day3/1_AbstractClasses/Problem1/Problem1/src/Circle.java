public class Circle extends Shape{
    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius,String color,String name)
    {
        super(color,name);
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius*radius;
    }

    @Override
    double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
