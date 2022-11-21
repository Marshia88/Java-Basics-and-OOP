import java.util.Scanner;
public class PointTester{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the radius of circle");
    double r= sc.nextDouble();
    System.out.println("Enter radius f Circle: "+ r);
    Dot d= new Dot(r);    
    System.out.println(d.space());
    System.out.println("Enter the radius of sphere");
    double r2= sc.nextDouble();
    System.out.println("Enter radius of Sphere: "+ r2);
    Pot p= new Pot(r2);
    System.out.println(p.space());
  }
}