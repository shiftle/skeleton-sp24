import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
	public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int res=0;
        for(int i:L){
            res+=i;
        }
        return res;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        List<Integer> evensnums = new ArrayList<>();
        for(int i:L){
            if(i%2==0){
                evensnums.add(i);
            }
        }
        return evensnums;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        List<Integer> commonnums = new ArrayList<>();
        for(int i:L1){
            for(int j:L2){
                if(i==j){
                    commonnums.add(i);
                }
            }
        }
        return commonnums;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int count=0;
        for(String word:words){
            for(int i=0;i<word.length();i++){
                if(word.charAt(i) == c){
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args){
        List<Integer> numbers1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> numbers2 = List.of(1, 3, 4, 5, 6, 7, 9, 10);
        List<Integer> evennumss = evens(numbers1);
        System.out.println(sum(numbers1));
        System.out.println(evennumss);
        System.out.println(common(numbers1,numbers2));
        List<String> words = Arrays.asList("hello", "world", "java", "programming", "code");
        char c = 'o';
        System.out.println(countOccurrencesOfC(words, c));
    }
}
