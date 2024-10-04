class Box{
    double width;
    double height;
    double depth;
    void volume(double w,double d,double h)
    {
        return(width*height*depth);
        System.out.println("volume="+(width*height*depth))
    }
    }
public class BoxDemo
{
    public static void main(String[]args)
    {
        Box mybox=new Box();
        mybox.width=10;
        mybox.height=20;
        mybox.depth=15;
        double vol=mybox.volume();
        System.out.println("Volume is"+vol);
    }
}