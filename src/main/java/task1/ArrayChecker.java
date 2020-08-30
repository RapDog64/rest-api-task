package task1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ArrayChecker<T> {


    private Map<T, Integer> findDuplicates(List<T> listOfValues) {
        int amountOfDuplicates = 0;
        Map<T, Integer> mapCopies = new HashMap<>();
        Set<T> setOfUniques = new HashSet<>();

        for (T value : listOfValues) {
            if (!setOfUniques.add(value)) {
                amountOfDuplicates++;
                mapCopies.put(value, amountOfDuplicates);
            }
        }

        return mapCopies;
    }


    public void check(List<T> listOfValues) {
        Map<T, Integer> mapCopies = findDuplicates(listOfValues);

        if (mapCopies.isEmpty()) {
            System.out.println("All of the entries are different");
        }

        mapCopies.forEach((key, value) -> {
            String format = String.format("The { %s } entry has %s duplicates", key, value);
            System.out.println(format);
        });
    }
}

