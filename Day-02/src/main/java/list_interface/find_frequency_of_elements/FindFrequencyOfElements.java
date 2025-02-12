package list_interface.find_frequency_of_elements;

import java.util.*;

public class FindFrequencyOfElements {

    public static Map<String, Integer> countFrequency(List<String> list) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        for (String item : list) {
            // Update count in the map
            frequencyMap.put(item, frequencyMap.getOrDefault(item, 0) + 1);
        }

        return frequencyMap;
    }

    public static void main(String[] args) {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "orange");

        // Get frequency map
        Map<String, Integer> frequency = countFrequency(inputList);

        // Display result
        System.out.println(frequency);
    }
}
