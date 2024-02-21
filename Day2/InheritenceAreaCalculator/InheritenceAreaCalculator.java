class InheritanceA{

    public void findCircleArea(float rad) {
        System.out.println("The Area of Circle : "+Math.PI*Math.pow(rad,2));
    }

}

class InheritanceB extends InheritanceA{

    public void findRectArea(float length,float breadth) {
        System.out.println("The Area of Rectangle : "+length*breadth);
    }

}
class InheritanceC extends InheritanceB{
    float breadth,height;
    public void findTriangleArea(float breadth,float height) {
        System.out.println("The Area of Triangle : "+0.5*breadth*height);

    }

    public static void main(String[] args) {
        
        InheritanceA circle1=new InheritanceC();
        circle1.findCircleArea(5);
        InheritanceB rect1=new InheritanceC();
        rect1.findRectArea(5,5);
        InheritanceC tri1=new InheritanceC();
        tri1.findTriangleArea(5,5);

        InheritanceA circle2=new InheritanceB();
        circle2.findCircleArea(10);
        InheritanceB rect2=new InheritanceB();
        rect2.findRectArea(10,10);

        InheritanceA circle3=new InheritanceA();
        circle3.findCircleArea(100);


    }

}