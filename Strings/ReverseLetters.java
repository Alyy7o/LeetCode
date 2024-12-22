class ReverseLetters{

    public static boolean isLetter(char ch){
        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')){
            return true;
        }
        return false;
    }
    
    public static String reverseOnlyLetters(String s) { // T:O(n) | S:O(1) 
       if(s.isEmpty()){
        return s;
       }

       int str = 0, end = s.length()-1;
       while(str < end){
        if(isLetter(s.charAt(str)) && isLetter(s.charAt(end))){
            char temp = s.charAt(str);
            s = s.substring(0, str) + s.charAt(end) + s.substring(str+1); 
            s = s.substring(0, end) + temp + s.substring(end+1);

            str++;
            end--;
        }
        else if(isLetter(s.charAt(str))){
            end--;
        }
        else if(isLetter(s.charAt(end))){
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
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s));
    }
}