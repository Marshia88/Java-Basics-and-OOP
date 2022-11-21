import java.util.Scanner;
public class Task5
{
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    System.out.println("Voltage?");
    double e= sc.nextDouble();
    System.out.println("Resistance?");
    double r= sc.nextDouble();
    System.out.println("Inductance?");
    double l= sc.nextDouble();
    System.out.println("Capacitance?");
    double c= sc.nextDouble();
    System.out.println("Frequency?");
    double f= sc.nextDouble();
    double pi= 3.14159;
    double I= e/(Math.sqrt(Math.pow(r,2)+Math.pow((2*pi*f*l)-(1/(2*pi*f*c)),2)));
    System.out.println(I);
//    double volt, res, ind, cap, freq=0;
    
    sc.close();
  }
}