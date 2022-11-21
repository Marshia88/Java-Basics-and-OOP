import java.util.Scanner;
public class Task8
{
  public static void main(String [] args)
  {
    Scanner sc= new Scanner(System.in);
    int a[]= new int[10];
    for(int i=0; i<a.length; i++ )
    {
      System.out.println("NO?");
      if(a[i]>=0 && a[i]<=9)
        a[i]=sc.nextInt();
      int flag= 0;
      for(int j=0; j<i; j++) 
      {
        if(a[i]==a[j])
        {
          flag++;
        }
      }
    }
    for(int i=0; i<a.length ;i++)
    {
      if(flag>=2 && flag<5)
      {
        System.out.println(a[i]);
      }
    }
//    for(int i=0; i<a.length; i++){
//      System.out.println(a[i]);
//    }
  }
}
