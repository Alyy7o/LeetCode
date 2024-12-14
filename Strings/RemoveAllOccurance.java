public class RemoveAllOccurance{
    public static void main(String[] args) {
        String s = "aabababa";
        String part = "aba";

        while(s.indexOf(part) >= 0){
            s = s.replaceFirst(part, "");
        }

        System.out.println(s);
    }
}