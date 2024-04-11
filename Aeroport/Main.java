package Aeroport;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    static Aeroport aeroport = new Aeroport("Домодедово",5);
    public static void main(String[] args) throws IOException {
        System.out.println(aeroport.toString());
        command();
}
    private static void command() throws IOException {
        System.out.println("Введите команду" +
                "\n ADD - посадить самолет на парковку" +
                "\n exitAll - распечатать номера самолётов в порядке покидания стоянки"+
                "\n exitLast - распечатать и удалить из памяти только тот самолёт, который сейчас выезжает");
        switch (reader.readLine()){
            case ("ADD"):
                if (aeroport.parking.size()<5) {
                    aeroport.setPlane();
                    command();
                }
                else {
                    System.out.println("Стоянка заполнена");
                    command();
                }
                break;
            case("exitALL"):
                if (aeroport.parking.empty()){
                    System.out.println("Аэропорт пуст");
                }else {
                    aeroport.clearAeroport();
                    }
                command();
                break;
            case ("exitLast"):
                if (aeroport.parking.empty()){
                    System.out.println("Аэропорт пуст");
                }else {
                    int index;
                    System.out.println("Введите номер самолета, который должен покинуть стоянку");
                    index = aeroport.findPlane(reader.readLine());
                    if (index != -1) {
                        aeroport.parking.removeElementAt(index);
                    }
                    System.out.println("На стоянке остались:");
                    aeroport.showAeroport();
                }
                command();
                break;
            default:
                System.out.println("Проверьте правильность написания команды");
                command();
                break;
        }
    }
}
