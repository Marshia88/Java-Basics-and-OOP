
import java.util.Scanner; 
public class Lab2_8 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[]a=new int[10];
    for(int i=0; i<a.length; ){
      System.out.println("NO?");
      a[i]=sc.nextInt();
      boolean flag=false;
      for(int j=0; j<i; j++){
        if(a[i]==a[j]){
          flag=true;
          break;
        }
      }
      if(flag==false){
        i++;
      }
    }
    for(int i=0; i<a.length; i++)
    {
    System.out.println(a[i]);
    }
  }  
}
