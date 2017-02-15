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
public class Butterfly extends Insect {
    private boolean walk = false;

    public void setWalk(boolean walk) {
        this.walk = walk;
    }
    
    public String iswalk(){
        String ans = "No";
        if (walk){
            ans = "Yes";
        }      
        return ans;
    }

   
}
