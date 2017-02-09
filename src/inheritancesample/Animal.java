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
public class Animal {
    private String name;
    private int age;
    private String voice;

    public void setVoice(String voice) {
        this.voice = voice;
    }
    
    public void speak(){
        System.out.println(voice);
    }

    public String getName() {
        return name;
    }

    public String getVoice() {
        return voice;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    } 
}
