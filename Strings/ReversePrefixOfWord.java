public class ReversePrefixOfWord {
    // Time:O(n) | Space:O(1)
    public static String reversePrefix(String word, char ch) {
        if(word.indexOf(ch) == -1){
            return word;
        }

        int str = 0, end = word.indexOf(ch);
        while(str < end){
            char temp = word.charAt(str);
            word = word.substring(0, str) + word.charAt(end) + word.substring(str+1);
            word = word.substring(0, end) + temp + word.substring(end+1);

            str++;
            end--;
        }
        return word;
    }
    public static void main(String[] args) {
        String s = "xyxzxe";
        char ch = 'z';
        System.out.println(reversePrefix(s, ch));
    }
}
