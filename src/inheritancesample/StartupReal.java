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
public class StartupReal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Animal bf1 = new Butterfly();
        
        bf1.setName("Butterfly");
        bf1.setAge(1);
        System.out.print("BF1 ");
        bf1.setVoice("no voice");
        bf1.speak();
        
        System.out.println("==========================");
        
        
        Insect bf2 = new Butterfly();
        System.out.print("BF2 ");
        bf2.move("fly");
        bf2.setVoice("sooo");
        System.out.print("BF2 ");
        bf2.speak();
        
        System.out.println("==========================");
        
        
        Butterfly bf3 = new Butterfly();
        System.out.print("BF3 ");
        bf3.move("fly too far");
        bf3.setWalk(true);
        System.out.println("is BF3 walk = " + bf3.iswalk());
        
    }
    
}
