public class Car{
static int count=0;
int year=0;
public static int getObjectCount(){
return count;
}
public Car(int n){
 year=n;
 count++;
}
public int getYear(){
return year;
}
}