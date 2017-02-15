/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritancesample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author roshann
 */
public class StartupImaginory {
    public static void main(String[] args) {
        
        List<Story> bookshelf = new ArrayList();
        
        CrimeFictionStory crimeFictionStroy = new CrimeFictionStory();
        crimeFictionStroy.setAuthor("Sir Arthur Conan Doyle");
        crimeFictionStroy.setStoryType("Murder");
        crimeFictionStroy.setDetectorName("Sherlock Holmes");
        crimeFictionStroy.setPublishYear("1891");
        
        MysteryFictionStory mysteryfictionStory = new MysteryFictionStory();
        mysteryfictionStory.setAuthor("Agatha Christie");
        mysteryfictionStory.setStoryType("Mystery");
        mysteryfictionStory.setDetectorName("");
        mysteryfictionStory.setPublishYear("1890");
        
        bookshelf.add(crimeFictionStroy);
        bookshelf.add(mysteryfictionStory);
        
        for (Story story : bookshelf ){
            System.out.println("Story type : " + story.getStoryType());
        }
    }
    
}
