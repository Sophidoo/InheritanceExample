package org.example;

public class Vertebrates extends Animals{
    private boolean tail;

    public Vertebrates(String name, int limbs, String habitat, boolean tail) {
        super(name, limbs, habitat);

        this.tail = tail;
    }

    public boolean isTail() {
        return tail;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }

    @Override
    public String toString() {
        return Output() +
                "tail=" + tail +
                '}';
    }
}
