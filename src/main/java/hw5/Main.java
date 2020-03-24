package Homeworks.hw5;

public class Main {
    public static void main(String[] args) {



        String[] habits = {"eating,drinking,sleeping"};


        Pet garfield = new Pet("cat", "Garfield", 5, 75, habits);


        Human vito = new Human("Vito", "Karlene", 1977);//Father
        Human jane = new Human("Jane", "Karlene", 1977);//Mother
        Family family=new Family(vito,jane);
        Human child1 = new Human("Kitty", "Karleone", 2000, 75,4);
        Human child2 = new Human("Jack", "Karleone", 2002, 60,3);

        garfield.respond(child1);
        garfield.eat();
        garfield.foul();



        family.addChild(child1);
        family.addChild(child2);
        System.out.println(family.showChildren());
        family.deleteChild(1);
        System.out.println(family.showChildren());


        if(child1.equals(child2)){
            System.out.println("They are same child");
        }
        else {
            System.out.println("They are different child");
        }

        System.out.println(family);



    }
}
