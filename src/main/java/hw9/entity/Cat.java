package hw9.entity;

public class Cat extends Pet {
    public Species species;
    public Cat(Species species, String nickname, int age, int trickLevel, String[] habits){
        super(nickname,age,trickLevel);
        this.species=species;

    }

    @Override
    public void response() {
        System.out.println("I'm cat");
    }

    @Override
    public void foul() {
        System.out.println("I'm Cat and i do foul");
    }
}
