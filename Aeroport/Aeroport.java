package Aeroport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Aeroport {
    String label;
    int size;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public Stack<Plane> parking = new Stack<>();
    public Aeroport(String label, int size) {
        this.label = label;
        this.size = size;
    }

    public void setPlane() throws IOException {
        System.out.println("Введите название самолета");
        label = reader.readLine();
        System.out.println("Введите номер самолета");
        String number = reader.readLine();
        parking.push(new Plane(label, number));
        System.out.println(parking.peek() + " сел на стоянку");
    }
    public void clearAeroport() {
        size = parking.size();
        for (int i = 1; i <= size; i++) {
            System.out.println(parking.peek() + " покинул аэропорт");
            parking.pop();
        }
    }
    public int findPlane(String number){
        boolean b = false;
        for (Plane plane : parking) {
            if (plane.getID().equalsIgnoreCase(number)){
            return parking.indexOf(plane);
            }
        }
        if (b==false) {
            System.out.println("Такой номер не найден");
        }
        return -1;
     }
    public void showAeroport() {
        for (Plane plane : parking) {
            System.out.println(plane.toString());
        }
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    @Override
    public String toString() {
        return "В аэропорте " + label + " " + size + " посадочных мест.";
    }
}
