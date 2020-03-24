package hw5;

import java.util.Arrays;

public class Human {

    private String name;

    private String surname;

    private int dateOfBirth;

    private int iq;

    private Family family;

    private static String[][] schedule = new String[][]{
            {"Sunday", " to go for a walk"},
            {"Monday", " watch a film"},
            {"Tuesday", " go to courses"},
            {"Wednesday", " do home work"},
            {"Thursday", " go to courses"},
            {"Friday", " do home work"},
            {"Saturday", "go to courses "}

    };

    private String task;

    public Human() {
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, int day) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.setSchedule(day);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(int dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getSchedule() {
        return task;
    }

    public void setSchedule(int day) {

        schedule[day-1][1]=task;
        this.task = schedule[day-1][0]+ " " +task;
    }

    public void greetPet() {
        System.out.println(String.format("Hello! %s", family.getPet().getNickname()));

    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public void describePet() {
        System.out.println("I have a " + family.getPet().getSpecies() + " he is " + family.getPet().getAge() + " years old, he is " + trickLevel(family.getPet()));
    }

    public String trickLevel(Pet pet) {
        if (pet.getTrickLevel() > 50) {
            return "very sly";
        } else return "almost not sly";
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +

                '}';
    }
}
