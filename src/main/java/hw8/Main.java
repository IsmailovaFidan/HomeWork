package hw8;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<DayOfWeek, String> schedule = new HashMap<>();
        schedule.put(DayOfWeek.Sunday, " to go for a walk");
        schedule.put(DayOfWeek.Monday, " watch a film");
        schedule.put(DayOfWeek.Tuesday, " go to courses");
        schedule.put(DayOfWeek.Friday, " do home work");


        Pet dog = new Dog(Species.DOG, "Bolt", 5, 70, new String[]{"eat", "sleep"});
        Pet cat = new Dog(Species.CAT, "Garfield", 5, 100, new String[]{"eat", "sleep"});
        Pet fish = new Dog(Species.FISH, "Nemo", 3, 20, new String[]{"eat", "sleep"});
        Man father = new Man("Vito", "Karlene", 1970,70,schedule);
        Woman mother = new Woman("Jane", "Karlene", 1972, 80, schedule);
        Family fam = new Family(mother, father);
        Man child1 = new Man("Jack", "Karlene", 1997, 70,schedule);
        Woman child2 = new Woman("Kitty", "Karlene", 2000, 70, schedule);

        fam.addChild(child1);
        fam.addChild(child2);

        fish.response();
        cat.foul();

        mother.makeUp();
        father.repairCar();

        System.out.println(fam);


    }
}
