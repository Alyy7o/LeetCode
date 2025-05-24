public class AddBinary {
    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";

        StringBuilder sb = new StringBuilder();
        
        int carry = 0;
        int i = a.length()-1;
        int j = b.length()-1;
        
        while(i >= 0 || j >= 0 || carry > 0){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i) - '0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j) - '0';
                j--;
            }
            sb.append(sum % 2);
        }
    
        System.out.println(sb.reverse().toString());
    }
}
