package hw9.entity;

import java.util.ArrayList;

public class Family {
    Human mother;
    Human father;
    ArrayList<Pet> pets=new ArrayList<>();
    ArrayList<Human> children=new ArrayList<>();
    static int count = 0;


    public Family(Human mother, Human father) {
        count = 0;
        this.mother = mother;
        this.father = father;
    }

    public Human getMother() {
        return mother;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public Human getFather() {
        return father;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public ArrayList<Human> getChildren() {
        return children;
    }

    public int countFamily(){
        return 2+children.size();
    }

    public void addChild(Human child) {
        children.add(child);
        count++;
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }


    public String showChildren() {
       return children.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object has been removed");
    }

    @Override
    public String toString() {
        return "Family{" +
                "mother=" + mother +",\n"+
                "father=" + father +",\n"+
                "children=" + showChildren() +
                ", count=" + count +
                '}';
    }


}
