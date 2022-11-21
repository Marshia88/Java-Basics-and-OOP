import java.util.Scanner; 
public class Task8_2 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    int[]b= new int[10];
    for(int i=0; i<a.length; i++ )
    {
      System.out.println("NO?");
      if(a[i]>=0 && a[i]<=9)
        a[i]=sc.nextInt();
      b[a[i]]++;
    }
    for(int i=0; i<b.length; i++)
    {
      if(b[i]>=2 && b[i]<5)
        System.out.println(i);
    }
  }  
}
