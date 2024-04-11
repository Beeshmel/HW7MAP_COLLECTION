import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
//        Преимущество LinkedList - только в версии 8.
//                1) Операция вставки элемента в середину выполняется быстрее чем в ArrayList
//        Минус
//                1) Получение элементов из LinkedList - очень медленная операция

        var list = new LinkedList<String>();
        Collections.addAll(list,"Java","PHP","JS");
        list.addFirst("Python");//используем спец. методы для ускорения времени вставки
        list.addLast("Node");
//        System.out.println(list);
        System.out.println(list.get(0));
    }
}
