
  
class Best
{ 
   public static void main(String args[]) 
      { 
          A obj = new A(); 
          //trying to access private method of another class 
          obj.display(); 
      } 
} 
class A 
{ 
   private void display() 
    { 
        System.out.println("GeeksforGeeks"); 
    } 
} 