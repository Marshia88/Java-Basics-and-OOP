import java.util.Scanner;
public class Lab2_6
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[15];
    int b[]= new int[10];
    for (int i=0; i<arr.length; i++)
    {
      System.out.println("Enter a number");
      if(arr[i]>=0 && arr[i]<=9)
        arr[i]= sc.nextInt();
      b[arr[i]]++;
    }
    
    for (int i=0; i<b.length; i++)
    {
      System.out.println("This number "+ i + " has been entered " + b[i] + " times");
    }
  }
}