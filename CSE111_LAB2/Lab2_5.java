import java.util.Scanner;
public class Lab2_5
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int arr[]= new int[10];
    for (int i=0; i<arr.length; i++)
    {
      System.out.println("Enter a number");
      arr[i]= sc.nextInt();
    }
    System.out.println("Enter another number");
    int num= sc.nextInt();
    int flag=0; 
    for (int i=0; i<arr.length; i++)
    {
      if(num==arr[i])
        flag=1;
    }
    if(flag==1)
      System.out.println("Yes");
    else
      System.out.println("Yes");
  }
}