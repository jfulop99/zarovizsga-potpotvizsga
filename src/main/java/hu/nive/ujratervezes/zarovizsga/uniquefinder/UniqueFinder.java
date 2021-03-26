package hu.nive.ujratervezes.zarovizsga.uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {


    public List<Character> uniqueChars(String o) {
        if (o == null) {
            throw new IllegalArgumentException("Cannot be null");
        }

        List<Character> result = new ArrayList<>();
        for (Character item: o.toCharArray()) {
            if (!result.contains(item)) {
                result.add(item);
            }
        }
        return result;
    }
}
