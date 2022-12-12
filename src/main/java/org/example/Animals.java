package org.example;

public class Animals {

    private String name;
    private int limbs;
    private String habitat;

    public String getName() {
        return name;
    }

    public Animals(String name, int limbs, String habitat) {
        this.name = name;
        this.limbs = limbs;
        this.habitat = habitat;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLimbs() {
        return limbs;
    }

    public void setLimbs(int limbs) {
        this.limbs = limbs;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }



    public String Output() {
        return "Animals " +
                "{name='" + name + '\'' +
                ", limbs=" + limbs +
                ", habitat='" + habitat + '\'' +
                ' ';
    }
}
