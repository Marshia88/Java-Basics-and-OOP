/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dr. Anowara Begum
 */
public class Dog extends Animal {
    public Dog(String n){
    super(n);
    }
     public void makeNoise(){
    System.out.println(getName()+ " barks");
    }
}
