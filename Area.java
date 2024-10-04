class shape{
    protected float lenght,breadth;
    void show(){
        System.out.println("Lenght: "+lenght);
        System.out.println("Breadth: "+breadth);
    }
    
}
class rectangle extends shape{
    void getPerimeter(){
        float peri=2*(lenght+breadth);
        System.out.println("Perimeter: "+peri);
    }
    void getArea(){
        float area=lenght*breadth;
        System.out.println("Area: "+area);
    }
}
class square extends shape{
    
    void getPerimeter(){
        float peri=2*(lenght+breadth);
        System.out.println("Perimeter: "+peri);
    }
    void getArea(){
        float area=lenght*breadth;
        System.out.println("Area: "+area);
    }
}
public class Area{
    public static void main(String[] args){
        rectangle b=new rectangle();
        square b1=new square();
        System.out.println("Rectangle:");
        b.lenght=5;
        b.breadth=3;
        b.show();
        b.getPerimeter();
        b.getArea();
        System.out.println("Square:");
        b1.lenght=4;
        b1.breadth=4;
        b1.show();
        b1.getPerimeter();
        b1.getArea();
    }
}