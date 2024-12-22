public class ReverseVowels {
    public static boolean vowelsCheck(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || 
        ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
            return true;
        }
        return false;
    }
    public static  String reverseVowels(String s) {

        if(s.isEmpty()){
            return s;
        }

        int str = 0, end = s.length()-1;
        while(str < end){
            if(vowelsCheck(s.charAt(str)) && vowelsCheck(s.charAt(end))){
                char temp = s.charAt(str);
                s = s.substring(0, str) + s.charAt(end) + s.substring(str+1);
                s = s.substring(0, end) + temp + s.substring(end+1);

                str++;
                end--;
            }
            else if(vowelsCheck(s.charAt(str))){
                end--;
            }
            else if (vowelsCheck(s.charAt(end))){
                str++;
            }
            else{
                str++;
                end--;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(reverseVowels(s));

        // to swap chars or change char at specific index in strings
        // s = s.substring(0, indexToChange) + newChar + s.substring(indexToChange + 1);
        // System.out.println(s);
    }
}
