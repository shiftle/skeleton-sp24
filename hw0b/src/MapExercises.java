import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        Map<Character,Integer> letterToNumMap = new HashMap<>();
        for(char ch='a';ch<='z';ch++){
            letterToNumMap.put(ch, (int) ch - (int) 'a' + 1);
        }
        return letterToNumMap;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer,Integer> squaresentry = new HashMap<>();
        for(int num:nums){
            squaresentry.put(num,num*num);
        }
        return squaresentry;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }

    public static void main(String[] args) {
        Map<Character, Integer> map = letterToNum();
        // Print the map
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        Map<Integer, Integer> squaresMap = squares(numbers);
        // Print the map
        for (Map.Entry<Integer, Integer> entry : squaresMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
