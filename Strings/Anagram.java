import java.util.*;
public class Anagram {
    public static boolean isAnagram(String s, String t) {
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

}
