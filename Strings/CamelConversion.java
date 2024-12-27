public class CamelConversion {
    public static String convertToCamelCase(String s) {
        // code here
        if(s.isEmpty()){
            return s;
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' '){
                s = s.substring(0,i+1) + Character.toUpperCase(s.charAt(i)) + s.substring(i+1);
                s = s.substring(0, i) + "" + s.substring(i+1);
            }
        }
        return s;
    }
    public static void main(String[] args) {
        String s = "I got intern at geeksforgeeks";
        System.out.println(convertToCamelCase(s));
    }
}
