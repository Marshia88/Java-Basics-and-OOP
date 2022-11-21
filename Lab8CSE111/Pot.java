class Pot extends Point{
  protected double area= 0.0;
  public Pot(double rad){
  super(rad);
  System.out.println("Creating a Sphere ... done!");
  }
   double space(){
  area=4/3*(Math.pow(getRadius(),3))*3.1416;
  return area;
}
}