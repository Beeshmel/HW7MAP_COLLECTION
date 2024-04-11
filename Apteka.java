import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Apteka {
    public static void main(String[] args) throws IOException {
        TreeSet<String>drugs = new TreeSet<>();
        var reader = new BufferedReader(new InputStreamReader(System.in));
        for(;;){
            System.out.println("Введите название препарата, либо команду LIST, либо EXIT");
            var answer = reader.readLine();
            switch (answer){
                case "LIST":
                    for (String drug : drugs) {
                        System.out.println(drug);
                    }
                    break;
                case "EXIT":
                    return;
                default:
                    drugs.add(answer);
            }
        }
    }
}
