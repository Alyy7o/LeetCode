public class NonRepeating {

    // Find 1st non repeating char in string
    public static char notRep(String st){ //O(n)

        if(st != ""){

            if(st.charAt(0) != st.charAt(1)){
                return st.charAt(0);
            }
            if(st.charAt(st.length()-1) != st.charAt(st.length()-2)){
                return st.charAt(st.length()-1);
            }
            for(int i=1; i<st.length()-2; i++){
                if(st.charAt(i) != st.charAt(i-1) && st.charAt(i) != st.charAt(i+1)){
                    return st.charAt(i);
                }
            }
        }

        return '1';
    }
    public static void main(String[] args) {
        String st = "aaabbcccf";
        System.out.println(notRep(st));
        
    }
}
