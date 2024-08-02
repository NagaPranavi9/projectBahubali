package org.example;

import static org.example.Characters.SHIVAGAMI;

public class BahubaliPart1 {



    public BahubaliPart1(){

    }

    public void part1Story(Characters ch){
        if(ch.getName().equals(SHIVAGAMI) ){
            ch.setExists(true);
        }
    }


}
