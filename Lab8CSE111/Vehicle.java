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
public class Vehicle {
    int x;
    int y;
    public Vehicle(){
    x=0;
    y=0;
    }
      public void moveUp(){
    y+=1;
    }
    public void moveLeft(){
    x-=1;
    }
  
    public void moveDown(){
    y-=1;
    }
    public void moveRight(){
    x+=1;
    }
     public String toString(){
        return "("+ this.x + "," + this.y +")";
    }
}
