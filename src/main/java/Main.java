import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();

        while (true) {
            System.out.println("Введите текст, либо end для завершения ввода");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("end")) break;
            strings.add(input);
        }
        System.out.println("\nСписок слов в словаре:");

        List<String> dictionary = new DictionaryGenerator()
                .getDictionary(strings);

        dictionary.forEach(System.out::println);
    }
}
