public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) { // T:O(n) S:O(1)
        s = s.trim();
        char[] ch = s.toCharArray();
        int count = 0;

        for(int i=ch.length-1; i>=0; i--){
            if(ch[i] == ' '){
                break;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "   fly me   to   the moon  ";
        System.out.println(lengthOfLastWord(s));
    }
}
