package sorting;

import sorting.test_comparator.TVSet;

import java.util.Comparator;

public class MyComparator implements Comparator<TVSet> {
    @Override
    public int compare(TVSet tv1, TVSet tv2) {
        return tv1.getDiagonale() - tv2.getDiagonale();
    }
}
