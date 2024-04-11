package sorting;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class TestSort {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        Collections.addAll(list,"bbb","aaa","ccc");
        Collections.sort(list);
        System.out.println(list);
    }
}
