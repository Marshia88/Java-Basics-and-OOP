import java.util.Scanner; 
public class Task7_1 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int[]a=new int[11];
    for(int i=0; i<a.length; ){
      System.out.println("NO?");
      a[i]=sc.nextInt();
      int flag=0;
      for(int j=0; j<i; j++){
        if(a[i]==a[j]){
          flag++;
        }
      }
      if(flag<4){
        i++;
      }
    }
    for(int i=0; i<a.length; i++)
    {
      System.out.println(a[i]);
    }
  }  
}
