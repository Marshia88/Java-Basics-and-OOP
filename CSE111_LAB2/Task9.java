import java.util.Scanner;
public class Task9
{ 
  public static void main(String [] args){
    Scanner sc= new Scanner(System.in);
    int a[]= new int[10];
    for(int i=0; i<a.length; i++){
      System.out.println("No?");
      a[i]= sc.nextInt();
    }   
    System.out.println("How do you want to sort? If at even positions, type 2 or if at odd positions, type 1 or if all numbers, type 3?");
    int num= sc.nextInt();
    if(num==3)
    {
      for(int i=0; i<a.length; i++){
        int min=i;
        for(int j=i+1; j<a.length; j++){
          if(a[j]<a[min])
          {
            min=j;
          }
          int temp= a[i];
          a[i]= a[min];
          a[min]= temp;
        }
      }
      for(int i=0; i<a.length; i++){
        System.out.println(a[i]+ " " + i);
      }   
    }
    
    else if(num==2)
    {
      for(int i=0; i<a.length; i+=2){
        int min=i;
        for(int j=i+2; j<a.length; j+=2){
          if(a[j]<a[min])
          {
            min=j;
          }
          int temp= a[i];
          a[i]= a[min];
          a[min]= temp;
        }
      }
      for(int i=0; i<a.length; i+=2){
        System.out.println(a[i]+ " "+ i);
      }   
    }
    
    else if(num==1)
    {
      for(int i=1; i<a.length; i+=2){
        int min=i;
        for(int j=i+2; j<a.length; j+=2){
          if(a[j]<a[min])
          {
            min=j;
          }
          int temp= a[i];
          a[i]= a[min];
          a[min]= temp;
        }
      }
      for(int i=1; i<a.length; i+=2){
        System.out.println(a[i]+ " " +i);
      }   
    }
    sc.close();
  }
}
