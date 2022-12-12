package org.example;

public class NonVertebrates extends Animals{
    private int wings;
    private int antenna;

    public NonVertebrates(String name, int limbs, String habitat, int wings, int antenna) {
        super(name, limbs, habitat);

        this.wings = wings;
        this.antenna = antenna;

    }

    public int getWings() {
        return wings;
    }

    public void setWings(int wings) {
        this.wings = wings;
    }

    public int getAntenna() {
        return antenna;
    }

    public void setAntenna(int antenna) {
        this.antenna = antenna;
    }


    @Override
    public String toString() {
        return Output() +
                "wings=" + wings +
                ", antenna=" + antenna +
                '}';
    }
}
