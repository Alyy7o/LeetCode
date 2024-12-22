class ReverseWords{
    public static String reverseWords(String s) {
        s = s.trim();
        int str = 0, end = s.length()-1;
        while(str < end){ // reverse whole string
            char temp = s.charAt(str);
            s = s.substring(0, str) + s.charAt(end) + s.substring(str+1);
            s = s.substring(0, end) + temp + s.substring(end+1);

            str++;
            end--;
        }

        int count = 0;
        for(int i=0; i<s.length(); i++){ // now reverse each word and final string will be reverse words string

            while(s.charAt(i) == ' ' && s.charAt(i-1) == ' '){ // remove extra spaces between words 
                s = s.substring(0, i) + "" + s.substring(i+1);
            }

            if(s.charAt(i) == ' ' || i == s.length()-1){
                int st = count, en = 0;

                if(i == s.length()-1) en = i;
                else en = i-1;
                
                count = i+1;
                while(st < en){
                    char temp = s.charAt(st);
                    s = s.substring(0, st) + s.charAt(en) + s.substring(st+1);
                    s = s.substring(0, en) + temp + s.substring(en+1);
        
                    st++;
                    en--;
                }
            }
        }
        return s;
    }

    public static void main(String[] args) {
        String s = "a good   example";
        
        System.out.println(reverseWords(s));
    }
}