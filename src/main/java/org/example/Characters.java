package org.example;

enum Characters {
    SHIVAGAMI("Shivagami"),
    BAHUBHALI("bahubali"),
    SHIVUDU("Shivudu"),
    DEVASENA("Devasena"),
    BHALLALADEVA("Bhallaladeva"),
    KATTAPPA("Kattappa");

    private final String name;
    private boolean exists;

    Characters(String name) {
        this.name = name;
        this.exists = false; // Default to false
    }

    public String getName() {
        return name;
    }

    public boolean exists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }
}