/*Given a paragraph and a list of banned words, return the most frequent word
that is not in the list of banned words.  It is guaranteed there is at least 
one word that isn't banned, and that the answer is unique. Words in the list of banned words 
are given in lowercase, and free of punctuation.  
Words in the paragraph are not case sensitive.  The answer is in lowercase.

Example:
Input: 
paragraph = "Bob hit a ball, the hit BALL flew far after it was hit."
banned = ["hit"]
Output: "ball"
Explanation: 
"hit" occurs 3 times, but it is a banned word.
"ball" occurs twice (and no other word does), so it is the most frequent non-banned word in the paragraph. 
Note that words in the paragraph are not case sensitive,
that punctuation is ignored (even if adjacent to words, such as "ball,"), 
and that "hit" isn't the answer even though it occurs more because it is banned.*/

package mostcommonword;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {

    public static String mostCommonWord(String paragraph, String[] banned){
        HashSet<String> bannedWords = new HashSet<>();
        for(String word : banned){
            bannedWords.add(word);
        }
        HashMap<String, Integer> counts = new HashMap<>();
        for(String word : paragraph.replaceAll("[^a-zA-Z]", " ").toLowerCase().split(" ")){
            if(!bannedWords.contains(word)){
                counts.put(word, counts.getOrDefault(word, 0) + 1);
            }
        }
        
        String result = "";
        for(String key : counts.keySet()){
            if(result.equals("") || counts.get(key) > counts.get(result))
                result = key;
        }
        return result;
    }
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        String output = mostCommonWord(paragraph, banned);
        System.out.println(output);
    }
    
}
