package hw9.dao;

import hw9.entity.Family;

import java.util.ArrayList;
import java.util.List;

public class CollectionFamilyDao implements FamilyDao<Family> {
    List<Family> families=new ArrayList<>();

    @Override
    public List<Family> getAllFamilies() {
        return families;
    }

    @Override
    public Family getFamilyByIndex(int index) {
        if(index<0 || families==null || index>=families.size() ) {
            return null;
        }
        else {
            return families.get(index);
        }
    }

    @Override
    public boolean deleteFamily(int index) {
        if(index<0 || families==null || index>=families.size() ) {
            return true;
        }
        else {
            families.remove(index);
            return false;
        }
    }

    @Override
    public boolean deleteFamily(Family family) {
        if(families==null || !families.contains(family) ) {
            return false;
        }
        else {
            families.remove(family);
            return true;
        }
    }

    @Override
    public void saveFamily(Family family) {
        int index = families.indexOf(family);
        if (index == -1) families.add(family);
        else families.set(index, family);

    }
}
