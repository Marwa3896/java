
public class Test {
	public static void main(String args[])
    {
	System.out.println("***1-Circle***");
    Circle c=new Circle(4.4,"white",false);
    System.out.println(c.toString());
    
    System.out.println("***2-Rectangle***");
    Rectangle r=new Rectangle(2.3,6.4,"brown",true);
    System.out.println(r.toString());
    
    System.out.println("***3-Square***");
    Square s=new Square(4.0,"black",true);
    System.out.println(s.toString());
    
    }
}
