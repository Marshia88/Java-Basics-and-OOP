public class Quiz2
{
  private int x;
  private int y;
  private int sum;
  public void methodA()
  {
    int msg[]= new int[1];
    msg[0]=15;
    methodB(msg, msg[0]);
    methodB(y,msg[0]);
  }
  public void methodB(int mg2[], int mg1){
  mg2[0]=mg2[0]-8;
  }
  public void methodB(int x, int z){
  x=9+z;
  System.out.println(x);
  }
  
}