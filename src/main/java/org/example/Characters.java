package org.example;

enum Characters {
    SHIVAGAMI("Shivagami",true,55,65,76,true),
    BAHUBHALI("bahubali" ,true,95, 20, 95,true),
    DEVASENA("Devasena",true,80,25,94,true),
    BHALLALADEVA("Bhallaladeva",true, 94,90,32,true),
    KATTAPPA("Kattappa",true, 95,10,97,false);

    private final String name;
    private boolean exists;
    int strength;
    int cunning;
    int loyalty;
    boolean love;

    Characters(String name, boolean exists, int strength, int cunning, int loyalty,boolean love) {
        this.name = name;
        this.exists = exists;
        this.strength = strength;
        this.cunning = cunning;
        this.loyalty = loyalty;
        this.love = love;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public boolean isLove() {
        return love;
    }

    public void setLove(boolean love) {
        this.love = love;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}