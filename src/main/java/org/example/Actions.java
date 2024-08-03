package org.example;

public class Actions {

    static void love(Characters c1,Characters c2){
        System.out.println(c1.getName() + " loves " + c2.getName());
        if(c1.isLove()==c2.isLove()){
            System.out.println(c1.getName() + " and " + c2.getName() +" both are in love");
        }else{
            System.out.println(c1.getName() + " and " + c2.getName() +" are not in love");
        }
    }
    static void kills(Characters c1, Characters c2) {
        if (c1.strength > c2.strength) {
            System.out.println(c1.getName() + " kills " + c2.getName());
        } else {
            System.out.println(c2.getName() + " kills " + c1.getName());
        }
    }

    static void betray(Characters betrayer, Characters victim) {
        System.out.println(betrayer.getName() + " betrays " + victim.getName());
        if (betrayer.cunning > victim.loyalty) {
            System.out.println(betrayer.getName() + " successfully betrays " + victim.getName());
        } else {
            System.out.println(victim.getName() + " sees through the betrayal attempt.");
        }
    }

     static void claimThrone(Characters claimant, Characters opponent) {

        if (claimant.cunning > opponent.cunning) {
            System.out.println(claimant.getName() + " claims the throne from " + opponent.getName());
        } else {
            System.out.println(opponent.getName() + " claims the throne from " + claimant.getName());
        }
    }
}
