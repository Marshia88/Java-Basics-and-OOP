/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19101100
 */
public class NewClass {
    public static void main(String [] args)
    {
        for(int i=0; i<a.length; ){
            a[i]=sc.nextInt();
            boolean flag=false;
            for(int j=0; j<i; j++){
                if(a[i]==a[j]){
                    flag=true;
                    break;
                }
            }
            if(flag==false){
                i++;
            }
        }
    }
}
