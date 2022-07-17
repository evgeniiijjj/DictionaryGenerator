import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//применен stream api для написании кода в парадигме функционального программирования, т.е.
//функция принимает один параметр - коллекцию строк, и возвращает один параметр - коллекцию строк, не производя побочных эффектов
public class DictionaryGenerator {

    public List<String> getDictionary(List<String> strings) {

        return strings.stream()
                .flatMap(str -> Arrays.stream(str.trim().split(" +")))
                .map(str -> str.toLowerCase().replaceAll("[,.;:!?'\"]", ""))
                .distinct()
                .sorted(Comparator.naturalOrder())
                .collect(Collectors.toList());
    }
}
