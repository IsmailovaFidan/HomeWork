package hw7;

public final class Woman extends Human {
    Woman(String name, String surname, int dateOfBirth, int iq, String day, String task){
        super(name, surname, dateOfBirth, iq, day, task);
    }

    @Override
    void greetPet() {
        System.out.println("Hello from Woman class");
    }

    void makeUp(){
        System.out.println("Woman do makeup");
    }
}
