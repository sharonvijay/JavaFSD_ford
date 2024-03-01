public abstract class Shape {
    public String name;
    public String color;

    abstract double calculateArea();
    abstract double calculatePerimeter();

    public Shape(String name,String color)
    {
        this.name = name;
        this.color = color;
    }
}
