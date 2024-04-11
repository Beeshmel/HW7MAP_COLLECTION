package sorting.test_comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        var m1 = new TVSet(24,"Sony");
        var m2 = new TVSet(28,"Samsung");
        var m3 = new TVSet(18,"Acer");

//        System.out.println(m1);

        List<TVSet> TVList = new ArrayList<>();
        Collections.addAll(TVList,m1,m2,m3);

//        TVList.sort(new MyComparator());//сортировка по диагонали через внешний класс

        Comparator<TVSet>compDiagonal = new Comparator<TVSet>() {
            @Override
            public int compare(TVSet tv1, TVSet tv2) {
                return tv1.getDiagonale() - tv2.getDiagonale();
            }
        };

        Comparator<TVSet>compTitle = new Comparator<TVSet>() {
            @Override
            public int compare(TVSet tv1, TVSet tv2) {
                return tv1.getTitle().compareTo(tv2.getTitle());
            }
        };//в этом месте закончилась инструкция, поэтому ;

        TVList.sort(compDiagonal);
        TVList.sort(compTitle);
        System.out.println(TVList);

    }
}
