public class ETester{
  public static void main(String [] args){
E a1 = new E();
F b1 = new F();
F b2 = new F(b1);
a1.methodA(1, 1);
b1.methodA(1, 2);
b2.methodB(3, 2);
  }
}