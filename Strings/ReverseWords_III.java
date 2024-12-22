public class ReverseWords_III {
    public static  String reverseWords(String s) {
        if(s.isEmpty()){
            return s;
        }

        int count = 0;
        for(int i=0; i<=s.length()-1; i++){

            if(s.charAt(i) == ' ' || i == s.length()-1){
                int str = count, end = i-1;
                
                if(i == s.length()-1) end = s.length()-1;

                while(str < end){
                    char temp = s.charAt(str);
                    s = s.substring(0, str) + s.charAt(end) + s.substring(str+1);
                    s = s.substring(0, end) + temp + s.substring(end+1);

                    str++;
                    end--;
                }
                count = i+1;
            }

        }
        return s;
    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }
}
