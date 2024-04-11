package sorting.test_comparator;

import java.util.*;

public class TestSet implements Comparator<TVSet>  {

    public static void main(String[] args) {
        var m1 = new TVSet(24,"Sony");
        var m2 = new TVSet(28,"Samsung");
        var m3 = new TVSet(18,"Acer");

//        System.out.println(m1);

        Set<TVSet> TVList = new TreeSet<TVSet>();
        Collections.addAll(TVList,m1,m2,m3);

        System.out.println(TVList);
    }



    @Override
    public int compare(TVSet o1, TVSet o2) {
        return o1.getTitle().compareTo(o2.getTitle());
    }
}
