package Homeworks.hw4;

public class Main {
//    public static void main(String[] args) {
//
//
//
//
//

//        kitty.describePet();
//        kitty.greetPet();
//        System.out.println(kitty.toString());
//
//    }

    public static void main(String[] args) {

        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "to go for a walk";
        schedule[1][0] = "Monday";
        schedule[1][1] = "watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to courses";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "do home work";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to courses";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do home work";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go to courses";

        String[] habits = {"eating,drinking,sleeping"};

        Pet july = new Pet();
        Pet bolt = new Pet("dog", "Bolt");
        Pet garfield = new Pet("cat", "Garfield", 5, 75, habits);


        Human vito = new Human("Vito", "Karlene", 1977);//Father
        Human jane = new Human("Jane", "Karlene", 1977);//Mother
        Human michael = new Human("Michael", "Karlene", 2003, vito, jane);
        Human kitty = new Human("Kitty", "Karleone", 2000, 75, garfield, jane, vito, schedule);

        garfield.respond(kitty);
        System.out.println();
        System.out.println();
        System.out.println();
    }
}
