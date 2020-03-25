package hw8;

import java.util.*;

public class Family {

    Woman mother;
    Man father;
    ArrayList<Pet> pets=new ArrayList<>();
    ArrayList<Human> children=new ArrayList<>();
    static int count = 0;
    static int temp = 0;



    public Family(Woman mother, Man father) {
        count = 2;
        this.mother = mother;
        this.father = father;
    }



    public void addChild(Human child) {
        children.add(child);
        count++;
    }


    public void deleteChild(int i) {
        children.remove(i);
        count--;
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
