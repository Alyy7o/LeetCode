public class ASCII {
    public static void main(String[] args) {
        String str = "A";
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            int ascii = (int) ch;
            char as = (char) ascii;
            System.out.println(ascii);
            System.out.println(as);
        }
    }
}
