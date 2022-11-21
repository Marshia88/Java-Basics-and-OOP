class Geek 
{ 
    void display() 
       { 
           System.out.println("Hello World!"); 
       } 
} 

  
//This class is having default access modifier 
class GeekNew 
{ 
    public static void main(String args[]) 
       {   
          //accessing class Geek from package p1 
          Geek obj = new Geek(); 
  
          obj.display(); 
       } 
}