package hw11.entity;

import java.text.ParseException;

public final class Woman extends Human {
    public Woman(String name, String surname, String dateOfBirth, int iq) throws ParseException {
        super(name, surname, dateOfBirth, iq);
    }

    @Override
    public void greetPet() {
        System.out.println("Hello from Woman class");
    }

    public void makeUp(){
        System.out.println("Woman do makeup");
    }
}
