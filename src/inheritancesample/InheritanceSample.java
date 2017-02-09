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
public class InheritanceSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal butterfly = new Butterfly();
        
        butterfly.setName("Butterfly");
        butterfly.setAge(1);
        butterfly.setVoice("no voice");
        
        butterfly.speak();
        
        Insect bf = new Insect();
        bf.move("fly");
        
    }
    
}
