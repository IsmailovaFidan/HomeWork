package hw10.dao;



import java.util.List;

public interface FamilyDao<A> {
    List<A> getAllFamilies();
    A getFamilyByIndex(int index);
    boolean deleteFamily(int index);
    boolean deleteFamily(A a);
    void saveFamily(A a);

}
