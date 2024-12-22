class ReverseString{
    public static void main(String[] args) {
        // String st = "Hello World";
        String st = "121";

        char[] ch = st.toCharArray();

        int str = 0, end = ch.length-1;
        while (str < end) {
            char temp = ch[str];
            ch[str] = ch[end];
            ch[end] = temp; 

            str++;
            end--;
        }
        String rev = new String(ch);
        
        System.out.println(rev);

    }
}