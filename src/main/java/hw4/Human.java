package Homeworks.hw4;

import java.util.Arrays;

public class Human {

    public String name;

    public String surname;

    public int dateOfBirth;

    public int iq;

    public Pet pet;

    public Human mother;

    public Human father;

    String[][] schedule;

    public Human() {
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, Human mother, Human father) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.mother = mother;
        this.father = father;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, Pet pet, Human mother, Human father, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
        this.schedule = schedule;
    }


    public void greetPet() {
        System.out.println("Hello," + pet.nickname);

    }

    public void describePet() {
        System.out.println("I have a " + this.pet.species + " he is " + this.pet.age + " years old, he is " + trickLevel(this.pet));
    }

    public String trickLevel(Pet pet) {
        if (this.pet.trickLevel > 50) return "very sly";
        else return "almost not sly";
    }

    public void fillTheSchedule() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", schedule=" + Arrays.toString(schedule) +
                '}';
    }
}
