package org.example;

import static org.example.Characters.BAHUBHALI;

public class Main {
    public static void main(String[] args) {

        // normal scenario
//        BahubaliStory bahubaliStory = new BahubaliStory();
//        bahubaliStory.storyPlot();


        BAHUBHALI.setLove(false);

        BahubaliStory bahubaliStory = new BahubaliStory();
        bahubaliStory.storyPlot();
    }

}