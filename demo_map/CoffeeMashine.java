package demo_map;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class CoffeeMashine {
    static void showInfo(Map<String,Integer> drinks){
        System.out.println("Имеются следующие напитки:");
        for (var item : drinks.entrySet()) {
            System.out.printf("Кофе %s стоит %d\n",item.getKey(),item.getValue());
        }
    }

//    Есть автомат, который Вам предоставляет разные напитки по определенным ценам
    public static void main(String[] args) throws IOException {
        Map<String,Integer> coffeeMashine = new HashMap<>();
        coffeeMashine.put("Капучино",100);
        coffeeMashine.put("Латте",120);
        coffeeMashine.put("Американо",80);
        showInfo(coffeeMashine);

        System.out.println("Введите сумму:");
        int money = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());

        boolean isEnough = false;//пусть средств недостаточно изначально

        for (var item : coffeeMashine.entrySet()) {
            if(item.getValue() <= money){
                System.out.println("Вы можете приобрести " + item.getKey());
                isEnough = true;
            }
        }
        if(!isEnough)
            System.out.println("У Вас недостаточно средств ни на один напиток");


    }
}
