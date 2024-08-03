package org.example;

import static org.example.Characters.*;

public class BahubaliStory {

    public BahubaliStory(){

    }

    public void storyPlot(){
        if(SHIVAGAMI.exists()) {
            if (DEVASENA.exists()) {
                if (BAHUBHALI.isLove()) {
                    Actions.love(BAHUBHALI, DEVASENA);
                } else {
                    DEVASENA.setLove(false);
                    Actions.love(BHALLALADEVA, DEVASENA);
                    System.out.println("After devasena rejected bhallaladeva");
                    BHALLALADEVA.setCunning(100);
                }
                System.out.println("Shivagami orders kattapa to kill bahubali because of hate that bahubali supports devasena");
                Actions.betray(SHIVAGAMI, BAHUBHALI);
                Actions.claimThrone( BHALLALADEVA,SHIVAGAMI);
                KATTAPPA.setStrength(100);
                Actions.kills(KATTAPPA, BAHUBHALI);
            } else{
                Actions.love(SHIVAGAMI,BAHUBHALI);
                Actions.love(SHIVAGAMI,BAHUBHALI);
            }

        }
    }


}
