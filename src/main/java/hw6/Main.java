package Homeworks.hw6;

public class Main {
    public static void main(String[] args) {

        String[] habits = {"eating,drinking,sleeping"};


        Pet garfield = new Pet(Species.CAT, "Garfield", 5, 75, habits);
        Pet bolt = new Pet(Species.DOG, "Bolt", 5, 80, habits);


        Human vito = new Human("Vito", "Karlene", 1977,70,1,"go to courses ",bolt);//Father
        Human jane = new Human("Jane", "Karlene", 1977,80,2,"go to courses ",garfield);//Mother
        Family family=new Family(jane,vito);
        Human child1 = new Human("Kitty", "Karleone", 2000, 75,4,"go to courses ",garfield);
        Human child2 = new Human("Jack", "Karleone", 2002, 60,3,"to go for a walk",bolt);

        garfield.respond(child1);
        garfield.eat();
        garfield.foul();




        family.addChild(child1);
        family.addChild(child2);

        family.deleteChild(0);
        System.out.println(family.showChildren());


        if(child1.equals(child2)){
            System.out.println("They are same child");
        }
        else {
            System.out.println("They are different child");
        }

        if(garfield.equals(bolt)){
            System.out.println("They are same pets");
        }
        else {
            System.out.println("They are different pets");

        }
        System.out.println(family);
        System.out.println();



    }
}
