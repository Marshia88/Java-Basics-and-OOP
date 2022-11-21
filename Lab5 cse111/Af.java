
//Java program to illustrate 
//protected modifier 
package p1; 
  
//Class A 
public class Af
{ 
   protected void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 
filter_none
edit
play_arrow

brightness_4
//Java program to illustrate 
//protected modifier 
package p2; 
import p1.*; //importing all classes in package p1 
  
//Class B is subclass of A 
class B extends Af
{ 
   public static void main(String args[]) 
   {   
       B obj = new B();   
       obj.display();   
   }   
      
}