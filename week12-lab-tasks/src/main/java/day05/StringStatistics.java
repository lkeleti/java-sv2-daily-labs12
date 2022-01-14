package day05;

import java.util.HashMap;
import java.util.Map;

public class StringStatistics {
    public Map<Character, Integer> countCharaters(String text) {
        if (text == null || text.isEmpty() || text.isBlank()) {
            throw new IllegalArgumentException("Text can not be empty!");
        }

        Map<Character, Integer> result = new HashMap<>();

        for (char c: text.toCharArray()) {
            if (result.containsKey(c)) {
                result.put(c, result.get(c) + 1);
            }
            else {
                result.put(c,1);
            }
        }
        return result;
    }
}
