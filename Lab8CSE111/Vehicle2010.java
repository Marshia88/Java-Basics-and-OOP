/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8cse111;

/**
 *
 * @author 19101100
 */
public class Vehicle2010 extends Vehicle {
//    int x;
//    int y;
    Vehicle2010(){
//    x=0;
//    y=0;
    }
    public String toString(){
    return "("+ this.x + "," + this.y +")";
    }
    public void UpperRight(){
    x++;
    y++;
    }
    public void UpperLeft(){
    y++;
    x--;
    }
    public void LowerRight(){
    y--;
    x++;
    }
    public void moveLowerLeft(){
    y--;
    x--;
    }
    public boolean equals(Vehicle2010 c){
        boolean a=false;
  if(c.x==this.x && c.y==this.y){
        a=true;}
        return a;
  }
//    return false;
}
