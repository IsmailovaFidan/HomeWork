package hw8;

import java.util.HashMap;
import java.util.Map;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private String task;
    public HashMap<DayOfWeek ,String> schedule;






    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq,HashMap<DayOfWeek,String> schedule) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.schedule=schedule;

    }


    public Map<DayOfWeek, String> getSchedule() {
        return schedule;
    }

    public void setSchedule(HashMap<DayOfWeek, String> schedule) {
        this.schedule = schedule;
    }


    void greetPet() {}


    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been removed");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", iq=" + iq +
                ", schedule=" + this.getSchedule() +
                '}';
    }
}
