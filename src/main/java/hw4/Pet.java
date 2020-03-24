package Homeworks.hw4;

import java.util.Arrays;

public class Pet {

    public String species;

    public String nickname;

    public int age;

    public int trickLevel;

    public String[] habits;

    public Pet() {
    }

    public Pet(String species, String nickname) {
        this.species = species;
        this.nickname = nickname;
    }

    public Pet(String species, String nickname, int age, int trickLevel, String[] habits) {
        this.species = species;
        this.nickname = nickname;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }


    public void eat() {
        System.out.println("I am eating");
    }

    public void respond(Human human) {
        System.out.println(String.format("Hello, %s. I am %s I miss you!", human.name, nickname));
    }

    public void foul() {
        System.out.println("I need to cover it up");
    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickname='" + nickname + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits=" + Arrays.toString(habits) +
                '}';
    }
}




