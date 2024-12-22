public class FaultyKeyboard {

    public static String finalString(String s) { // Time: O(n), Space: O(n)
        char[] ch = s.toCharArray();

        if(s.isEmpty()){
            return s;
        }
        
        for(int i=0; i<ch.length; i++){
            
            if(ch[i] == 'i' && i > 0){
                int str = 0, end = i-1;
                while(str < end){
                    char temp = ch[str];
                    ch[str] = ch[end];
                    ch[end] = temp;

                    str++; 
                    end--;
                }
                ch[i] = '1';
            }
            
        }

        s = new String(ch);
        s = s.replace("1", "");
        return s;

    }
    public static void main(String[] args) {
        String s = "poiinter";
        System.out.println(finalString(s));
    }
}
