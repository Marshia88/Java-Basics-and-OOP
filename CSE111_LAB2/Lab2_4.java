import java.util.Scanner;
public class Lab2_4
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[20];
    for (int i=0; i<arr.length; i++)
    {
      System.out.println("Enter a number");
      arr[i]= sc.nextInt();
    }
    for(int i=arr.length-1; i>=0; i--)
    {
      if(arr[i]%2==0)
        System.out.println(arr[i]);
    }
  }
}