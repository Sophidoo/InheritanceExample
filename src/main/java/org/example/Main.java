package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vertebrates vert = new Vertebrates("Lizard", 4, "Land", true);
        Vertebrates vert2 = new Vertebrates("Lion", 4, "Forest", true);
        Vertebrates vert3 = new Vertebrates("Monkey", 4, "Forest", true);
        Vertebrates vert4 = new Vertebrates("Dog", 4, "Land", true);
        Vertebrates vert5 = new Vertebrates("Birds", 2, "Trees", true);

        NonVertebrates nvert = new NonVertebrates("Mosquito", 6, "Tall Grasses", 4, 2);
        NonVertebrates nvert2 = new NonVertebrates("Butterflies", 6, "GrassLands", 4, 2);
        NonVertebrates nvert3 = new NonVertebrates("Millipede", 750, "Moist Soil", 0,2);
        NonVertebrates nvert4 = new NonVertebrates("Octopus", 8, "Sea", 0, 0);
        NonVertebrates nvert5 = new NonVertebrates("Jellyfish", 8, "Sea", 0, 0);

        List<Animals> animals = new ArrayList<>();
        animals.add(vert);
        animals.add(vert2);
        animals.add(vert3);
        animals.add(vert4);
        animals.add(vert5);
        animals.add(nvert);
        animals.add(nvert2);
        animals.add(nvert3);
        animals.add(nvert4);
        animals.add(nvert5);

        List<Vertebrates> vertebrate = new ArrayList<>();
        vertebrate.add(vert);
        vertebrate.add(vert2);
        vertebrate.add(vert3);
        vertebrate.add(vert4);
        vertebrate.add(vert5);

        List<NonVertebrates> nonvertebra = new ArrayList<>();
        nonvertebra.add(nvert);
        nonvertebra.add(nvert2);
        nonvertebra.add(nvert3);
        nonvertebra.add(nvert4);
        nonvertebra.add(nvert5);

//        display all animals who live in a particular habitat
        animals.stream().filter(animal -> animal.getHabitat().equalsIgnoreCase("Land"))
                        .forEach(animal -> System.out.println(animal));

//        display all animals with a number of limbs
        animals.stream().filter(animal -> animal.getLimbs() > 2)
                .forEach(animal -> System.out.println(animal));


//         display all vertebrates with tail
        vertebrate.stream().filter(vertebra -> vertebra.isTail() == true)
                .forEach(vertebra -> System.out.println(vertebra));

//        display all non-vertebrate with number of wings
        nonvertebra.stream().filter(nonvert -> nonvert.getWings() < 4)
                .forEach(nonvert -> System.out.println(nonvert));
    }
}