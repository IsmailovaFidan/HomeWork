package hw6;

public class Human {

    private String name;

    private String surname;

    private int dateOfBirth;

    private int iq;

    private Family family;

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    private String task;

    private Pet pet;

    private static String[][] schedule = new String[][]{
            {DayOfWeek.Sunday.name(), " to go for a walk"},
            {DayOfWeek.Monday.name(), " watch a film"},
            {DayOfWeek.Tuesday.name(), " go to courses"},
            {DayOfWeek.Wednesday.name(), " do home work"},
            {DayOfWeek.Thursday.name(), " go to courses"},
            {DayOfWeek.Friday.name(), " do home work"},
            {DayOfWeek.Saturday.name(), "go to courses "}
    };

    public Human() {
    }

    public Human(String name, String surname, int dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
    }

    public Human(String name, String surname, int dateOfBirth, int iq, int day,String task,Pet pet) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.iq = iq;
        this.setSchedule(day);
        this.pet=pet;
        this.task=task;
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



    public String trickLevel(Pet pet) {
        if (pet.getTrickLevel() > 50) {
            return "very sly";
        } else return "almost not sly";
    }

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
