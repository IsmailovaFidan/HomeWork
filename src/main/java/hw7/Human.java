package hw7;

public class Human {

    private String name;
    private String surname;
    private int dateOfBirth;
    private int iq;
    private String task;


    private static String[][] schedule = new String[][]{
            {DayOfWeek.Sunday.name(), " to go for a walk"},
            {DayOfWeek.Monday.name(), " watch a film"},
            {DayOfWeek.Tuesday.name(), " go to courses"},
            {DayOfWeek.Wednesday.name(), " do home work"},
            {DayOfWeek.Thursday.name(), " go to courses"},
            {DayOfWeek.Friday.name(), " do home work"},
            {DayOfWeek.Saturday.name(), "go to courses "}
    };


    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, String day,String task) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.setSchedule(day,task);

    }

    void setSchedule(String day, String task) {
        schedule[0][0] = day;
        schedule[0][1] = task;
        this.task = day + " " + task;
    }
    private String getSchedule() {

        return task;
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
                ",task="+task+

                '}';
    }
}
