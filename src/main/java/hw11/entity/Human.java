package hw11.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;

public class Human {

    private String name;
    private String surname;
    private long dateOfBirth;



    private int iq;
    public HashMap<DayOfWeek,String> schedule;



    public Human(String name, String surname, String  dateOfBirth) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth).getTime();
    }

    public Human(String name, String surname, String dateOfBirth, int iq) throws ParseException {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth =  new SimpleDateFormat("dd/MM/yyyy").parse(dateOfBirth).getTime();
        this.iq = iq;


    }

    public long getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(long dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    void greetPet() {}

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    private static SimpleDateFormat formatForDate = new SimpleDateFormat("dd/MM/yyyy");

    public static String format(long mills) {
        return formatForDate.format(mills);
    }

    public static String millsToString(Long mills) {
        return formatForDate.format(mills);
    }

    public static long stringToMills(String string) throws ParseException {
        try {
            return formatForDate.parse(string).getTime();
        } catch (ParseException ex) {
            throw new ParseException("Incorrect input. enter date in format: dd/MM/yyyy", 0);
        }
    }
    public String describeAge() {
        LocalDate date=LocalDate.ofEpochDay(dateOfBirth);
        LocalDate localDate=LocalDate.now();
        Period age=Period.between(date,localDate);
        return format(age.getYears()) + " year " + format(age.getMonths()) + " month " + format(age.getDays()) + " day";
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been removed");
    }


    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + format(dateOfBirth) +
                ", iq=" + iq +
                '}';
    }
}
