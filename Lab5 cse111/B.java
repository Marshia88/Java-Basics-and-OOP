class Prob3{
  public int x = 10;
  public Prob3(){
    x++;
    System.out.println("In the constructor "+x);
  }
  public Prob3(int x){
    x++;
    System.out.println("In the constructor "+x);
  }
  public Prob3(int [] x){
    x[0]++;
    System.out.println("In the constructor "+x[0]);
  }  
}

