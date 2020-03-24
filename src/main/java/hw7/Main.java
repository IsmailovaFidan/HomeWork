package hw7;

public class Main {
    public static void main(String[] args) {
        Pet dog = new Dog(Species.DOG, "Bolt", 5, 70, new String[]{"eat", "sleep"});
        Pet cat = new Dog(Species.CAT, "Garfield", 5, 100, new String[]{"eat", "sleep"});
        Pet fish = new Dog(Species.FISH, "Nemo", 3, 20, new String[]{"eat", "sleep"});
        Man father = new Man("Vito", "Karlene", 1970, 70, DayOfWeek.Monday.name(), "Go to work");
        Woman mother = new Woman("Jane", "Karlene", 1972, 80, DayOfWeek.Friday.name(), "Watch the film");
        Family fam = new Family(mother, father);
        Man child1 = new Man("Jack", "Karlene", 1997, 70, DayOfWeek.Saturday.name(), "go to courses");
        Woman child2=new Woman("Kitty","Karlene",2000,70,DayOfWeek.Thursday.name(),"do homework");

        fam.addChild(child1);
        fam.addChild(child2);

        fish.response();
        fam.setPet(dog);
        cat.foul();

        mother.makeUp();
        father.repairCar();

        System.out.println(fam);


    }
}
