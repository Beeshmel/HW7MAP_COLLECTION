package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Monitor implements Comparable<Monitor> {
    private int diagonale;
    private String title;

    public Monitor(int diagonale, String title) {
        this.diagonale = diagonale;
        this.title = title;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "diagonale=" + diagonale +
                ", title='" + title + '\'' +
                '}';
    }

    public static void main(String[] args) {
        var m1 = new Monitor(24,"Sony");
        var m2 = new Monitor(28,"Samsung");
        var m3 = new Monitor(18,"Acer");

//        System.out.println(m1);

        List<Monitor> monitorList = new ArrayList<>();
        Collections.addAll(monitorList,m1,m2,m3);
        Collections.sort(monitorList);
        System.out.println(monitorList);
    }

    /**
     * Поле по которому будем выполнять сортировку указываем в этом методе
     * Данный метод сравнивает последовательно 2 объекта - первый - это тот, через который запускаем
     * данный метод, а второй объект находится в параметре. Если сортируем коллекцию по числовому
     * свойству, то делаем разность свойств объектов. От полученного значения(либо > 0, либо < 0)
     * зависит направление сортировки
     * @param o the object to be compared.
     * @return
     */
//    @Override
//    public int compareTo(Monitor o) {
//        return o.diagonale - this.diagonale;
//    }

//    Если сортировка по строковому полю, то вычитать мы не можем строки, поэтому используем
//    встроенный в класс String метод compareTo, который посимвольно сравнит наши строки и вернет
//    также 0, если символы равны, > 0, если следующий символ дальше предыдущего и < 0, если предыдущий символ имеет код больше кода следующего символа
//    @Override
    public int compareTo(Monitor monitor) {
        return this.title.compareTo(monitor.title);//используем встроенный метод строки compareTo
    }
}
