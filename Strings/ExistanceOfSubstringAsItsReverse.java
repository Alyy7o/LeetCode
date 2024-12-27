public class ExistanceOfSubstringAsItsReverse {
    public static boolean isSubstringPresent(String s) {
        if(s.isEmpty()){
            return true;
        }
        String rev = s;
        int str = 0, end = s.length()-1;
        while(str < end){
            char temp = rev.charAt(str);
            rev = rev.substring(0, str) + rev.charAt(end) + rev.substring(str+1);
            rev = rev.substring(0, end) + temp + rev.substring(end+1);

            str++;
            end--;
        }

        int s_fr = 0, s_sec = 1;
        int r_fr = rev.length()-1, r_sec = r_fr-1;
        while(s_sec < s.length()){
            if(s.charAt(s_fr) == rev.charAt(r_fr) && s.charAt(s_sec) == rev.charAt(r_sec)){
                return true;
            }
            s_fr++;
            s_sec++;
            r_fr--;
            r_sec--;    
        }

        return false;
    }

    public static void main(String[] args) {
        String s = "abcd";
        if(isSubstringPresent(s)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
