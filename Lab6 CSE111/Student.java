public class Student{
  private String name="";
  private String address="";
  private int id=0;
  private double cgpa=0.0;
  public Student(){
  name="Student@109dfdfd";
  id=24442;
  address="dhjl";
  cgpa=-4.0;
  }
  public void nameBoshap(String n){
    name=n;
  }
  public void idBoshao(int i){
    id=i;
  }
  public void addressBoshao(String a){
    address=a;
  }
  public void cgpaBoshao(double c){
    cgpa=c;
  }
  public String nameDao(){
    return name;
  }
  public String addressDao(){
    return address;
  }
  public int boloToAmiKe(){
    return id;}
  public double cgpaDao(){
    return cgpa;
  }
  public String toString(){
  return name+ "\n Ei name e kono student nai"+"\nStudent ei nai, abar id :P"+"\nNaam nai .. thikana ashbe koi theke?\n"+ cgpa;
  }
}