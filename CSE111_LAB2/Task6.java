import java.util.Scanner;
    public class Task6 {
        public static void main(String [] args)
        {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int y=0;
        for(int i=0; i<=n; i++)
        {
        if(i%2!=0)
            y+= Math.pow(i,2);
        else
            y+= Math.pow(i,2)*-1;
        }
        System.out.println(y);
        }

    }
