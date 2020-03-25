package hw8;

public class RoboCat extends Pet implements Foul {
    public Species species;
    public RoboCat(Species species, String nickname, int age, int trickLevel, String[] habits){
        super(nickname,age,trickLevel);
        this.species=species;

    }

    @Override
    public void response() {
        System.out.println("I'm Robo Cat");
    }

    @Override
    public void foul() {
        System.out.println("I'm Robo Cat and i do foul");
    }
}
