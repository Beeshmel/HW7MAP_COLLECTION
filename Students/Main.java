package Students;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) throws IOException {
    createStudentsList();
    comanda();
    }
    private static void comanda() throws IOException {
        System.out.println("Какую команду выполнить?" +
                "\n - Введите LIST для показа списка всех студентов." +
                "\n - Введите SORT для сортировки списка студентов." +
                "\n - Введите EXIT для выхода.");
        switch (reader.readLine()){
            case ("LIST"):
                showStudentsList();
                comanda();
                break;
            case ("SORT"):
                sorting();
                break;
            case("EXIT"):
                System.out.println("Вы вышли из программы");
                break;
            default:
                System.out.println("Некорректная команда");
                comanda();
                break;
        }
    }
    private static void sorting() throws IOException {
        System.out.println("По какому полю требуется сортировка?" +
                "\n - Введите FIO для сортировке по фамилии." +
                "\n - Введите GRADE для сортировке по среднему баллу.");
        switch (reader.readLine()){
            case ("FIO"):
                studentsList.sort(studFio);
                showStudentsList();
                comanda();
                break;

            case ("GRADE"):
                studentsList.sort(studGrade);
                showStudentsList();
                comanda();
                break;

            default:
                System.out.println("Некорректный ввод");
                sorting();
                break;

        }
    }
    static Comparator<Student> studFio = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return o1.fio.compareTo(o2.fio);
        }
    };
    static Comparator<Student> studGrade = new Comparator<Student>() {
        @Override
        public int compare(Student o1, Student o2) {
            return Double.compare(o1.averageGrade,o2.averageGrade);
        }
    };
    private static void showStudentsList() {
        System.out.println("Список студентов");
        for (Student student : studentsList) {
            System.out.println(student.toString());
        }
    }
    static final int COUNTSTUD = 5;
    private static void createStudentsList() throws IOException {
        System.out.println("Создадим список студентов длиной "+COUNTSTUD);
        studentsList = new ArrayList<>();
        for (int i=0;i<COUNTSTUD;i++){
            System.out.println("Введите ФИО студента");
            fio = reader.readLine();
            averageScore = (Math.random()*3+2);
            Student student = new Student(fio,averageScore);
            Collections.addAll(studentsList,student);
            System.out.println(student.toString());
        }
    }
    static String fio;
    static double averageScore;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static List<Student> studentsList;


    }
