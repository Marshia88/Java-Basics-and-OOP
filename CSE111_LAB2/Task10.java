import java.util.Scanner; 
public class Task10 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[]a=new int[100];
    int[]b= new int[10];
    for(int i=0; i<a.length;)
    {
      System.out.println("NO?");
      if(a[i]>=0 && a[i]<=9)
      {
        a[i]=sc.nextInt();
        b[a[i]]++;
      }
      for(int j=0; j<b.length; j++)
      {
        if(b[i]<2 || b[i]>=5)
        {
          i++;
        }
      }
    }  
    int flag=0;
    for(int i=0; i<b.length; i++)
    {
      if(b[i]>=2 && b[i]<5)
      {
        System.out.println(i);
        flag++;
      }
      if(flag>1)
        break;
    }
  }  
}
