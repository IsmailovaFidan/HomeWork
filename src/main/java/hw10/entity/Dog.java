package hw10.entity;

public class Dog extends Pet implements Foul {
    public Species species;
    public Dog(Species species, String nickname, int age, int trickLevel, String[] habits){
        super(nickname,age,trickLevel);
        this.species=species;

    }

    @Override
    public void response() {
        System.out.println("I'm dog");
    }

    @Override
    public void foul() {
        System.out.println("I'm dog and i do foul");
    }


}
