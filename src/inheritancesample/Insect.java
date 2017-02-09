/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancesample;

/**
 *
 * @author roshann
 */
public class Insect extends Animal{
   private int legs;
   private String mortion;
   
    public void move(String mortion){
        this.mortion = mortion;
        System.out.println("Can " + this.mortion);
    }    

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }
}
