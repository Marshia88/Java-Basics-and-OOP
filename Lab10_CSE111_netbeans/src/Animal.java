/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dr. Anowara Begum
 */
public abstract class Animal {
    private String name="";
    public Animal(String n){
    name=n;
    }
    public String getName(){
    return name;
    }
    public abstract void makeNoise();
}
