package hw12.entity.pets;

public class DomesticCat extends Pet implements Foul {
    public Species species;
    public DomesticCat(Species species, String nickname, int age, int trickLevel, String[] habits){
        super(nickname,age,trickLevel);
        this.species=species;

    }

    @Override
    public void response() {
        System.out.println("I'm DomesticCat");
    }

    @Override
    public void foul() {
        System.out.println("I'm Domestic Cat and i do foul");
    }
}
