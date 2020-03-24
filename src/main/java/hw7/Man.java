package hw7;

public class Man extends Human {

        Man(String name, String surname, int dateOfBirth, int iq, String day, String task){
            super(name, surname, dateOfBirth, iq, day, task);
        }

        @Override
        void greetPet() {
            System.out.println("Hello from Man class");
        }

        void repairCar(){
            System.out.println("A Man repair his can");
        }
}
