import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s, String t) {
        HashSet<Integer> set = new HashSet<>(256);
        set.addAll(-1);
        
        
        char[] s1 = s.toCharArray();
        char[] s2 = t.toCharArray();

        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0; i<s1.length; i++){
            if(!(s1[i] == s2[i])){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "racecar";
        String t = "carrace";
        System.out.println(isAnagram(s, t));
        
        
    }

    // HashSet<Character> set = new HashSet<>();
    // char[] ch = s.toCharArray();
    // int len = 0, maxLen = 0;

    // if(s == " "){
    //     return 1;
    // }

    // for(int i=0; i < ch.length; i++){
    //     if(set.contains(ch[i])){
    //         maxLen = Math.max(maxLen, len);
    //         len = 0;
    //     }
    //     set.add(ch[i]);
    //     len++;
    // }
    // return maxLen;
}
