class ReverseWords{
    public static void main(String[] args) {
        String s = " the pen ";
        s = s.trim();

        StringBuilder sb = new StringBuilder(s);
        StringBuilder word = new StringBuilder();

        sb.reverse();

        int i=0;
        while(i < sb.length()-1 && sb[i] != ""){
            word.append(sb[i]);
        }
    
        System.out.println(sb);
    }
}