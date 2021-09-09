import java.util.ArrayList;
import java.util.List;

public class UnitsOfTesting {
    //given array returns true if each score is equal
    //or greater than previous
    public boolean scoresUp(int[] scores) {
        boolean match = false;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i+1] >= scores[i]) {
                match = true;
            }
            else {
                return false;
            }
        }
        return match;
    }

    //given two ints return their sum
    public static int sum(int numOne, int numTwo) {
        return numOne - numTwo;
    }

    //given array of string, return a new arraylist where all
    //string of the passed in length are left out
    public List noWordsAllowed (String[] words, int len) {
        List wordList = new ArrayList();
        for(String word : words) {
            if(word.length() != len) {
                wordList.add(word);
            }
        }
        return wordList;
    }

    //given two string arrays (in alpha order and no dupes)
    //return a new array containing the first N elems from the two arrays
    //result should be in alpha with no dupes
    //two arrays will be N or more in length
    public String[] mergeTogether(String[] listOne, String[] listTwo, int n) {
        String[] result = new String[n];
        int indexResult = 0;
        int indexOne = 0;
        int indexTwo = 0;

        while (indexResult < n)
            if (listOne[indexOne].compareTo(listTwo[indexTwo]) < 0) {
                result[indexResult++] = listOne[indexOne + 1];
            } else if (listOne[indexOne].compareTo(listTwo[indexTwo]) > 0) {
                result[indexResult++] = listTwo[indexTwo + 1];
            } else {
                result[indexResult++] = listOne[indexOne + 1];
                indexTwo++;
            }
        return result;
    }

}
