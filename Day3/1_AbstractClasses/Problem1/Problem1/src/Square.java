public class Square extends Shape{
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    public Square(int length,String color,String name)
    {
        super(color,name);
        this.length = length;
    }
    @Override
    double calculateArea() {
        return length*length;
    }

    @Override
    double calculatePerimeter() {
        return 2*length;
    }
}
