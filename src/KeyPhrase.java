import java.util.ArrayList;
import java.util.HashMap;

public class KeyPhrase {
    public static void main(String[] args) {
        String text = "But this way neither the donkey was comfortable nor the potter was able to take rest. A saint, who happened to be passing by, saw the potter holding on to the donkey’s ears. Then the saint wanted to know what the problem of the potter was. When the potter told the saint what the problem was, the wise saint said, Take the donkey to the place where you tie him everyday. Pretend to tie him using an imaginary rope. I assure you he won’t run away. The potter did what the saint had said";
        ArrayList<String> wordsToLeave = new ArrayList<>();
        wordsToLeave.add("the");
        wordsToLeave.add("is");
        wordsToLeave.add("a");
        wordsToLeave.add("by");
        wordsToLeave.add("to");
        wordsToLeave.add(".");
        wordsToLeave.add(",");
        wordsToLeave.add("of");
        HashMap<String, Integer> wordFrequency = new HashMap<>();;
        String[] textSplit = text.split(" ");
        int maxFrequency = 0;
        for (String word : textSplit){
            if (wordsToLeave.contains(word) || word.trim().length() == 0){
                continue;
            }
            String key = word.trim().toLowerCase();
            if (wordFrequency.get(key)==null){
                wordFrequency.put(key, 1);
            }else {
                int frequency = wordFrequency.get(key) + 1;
                wordFrequency.put(key, frequency);
            }
            if (wordFrequency.get(key)>maxFrequency){
                maxFrequency = wordFrequency.get(key);
            }
        }
        for (String key: wordFrequency.keySet()){
            if (wordFrequency.get(key) == maxFrequency){
                System.out.println(key + " : "+ wordFrequency.get(key));
            }
        }
    }
}
