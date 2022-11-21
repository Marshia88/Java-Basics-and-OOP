class Dot extends Point{
  protected double area= 0.0;
  
  public Dot(double rad){
  super(rad);
  System.out.println("Creating a Circle ... done!");
  }
  double space(){
  area= Math.pow(getRadius(),2)*3.1416;
  return area;
  }
}