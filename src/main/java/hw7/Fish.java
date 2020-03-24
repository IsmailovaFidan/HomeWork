package hw7;

public class Fish extends Pet implements Foul {
    public Species species;
    public Fish(Species species, String nickname, int age, int trickLevel, String[] habits){
        super(nickname,age,trickLevel);
        this.species=species;

    }

    @Override
    public void response() {
        System.out.println("I'm fish");
    }

    @Override
    public void foul() {
        System.out.println("I'm fish and i do foul");
    }
}
