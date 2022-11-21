public class CTester{
  public static void main(String [] args){
    C a1 = new C();
    D b1 = new D();
    D b2 = new D(b1);
    b1.methodA(1, 2);
    b2.methodB(3, 2);
  }
}