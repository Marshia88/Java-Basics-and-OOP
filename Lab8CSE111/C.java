class C{
  public static int temp = 4;
  public int sum;
  public int y;
  public C(){
    y = temp - 2;
    sum = temp + 1;
    temp-=2;
  }
  public void methodA(int m, int n){
    int x = 0;
    y = y + m + (temp++);
    x = x + 1 +  n;
    sum = sum + x + y;
    System.out.println(x + " " + y+ " " + sum);  
  }
}

