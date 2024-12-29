public class NextGreater_III {
    public static int nextGreaterElement(int n) {
        
        char[] ch = ("" + n).toCharArray();
        int i = ch.length - 2;

        while(i >= 0 && ch[i] >= ch[i+1])
            i--;

        if(i < 0) return -1;

        int j = ch.length - 1;
        while(j >= 0 && ch[j] <= ch[i])
            j--;

        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;

        int left = i + 1, right = ch.length - 1;
        while(left < right){
            temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        long val = Long.parseLong(new String(ch));
        return val >= Integer.MAX_VALUE ? -1 : (int)val; 
    }
    public static void main(String[] args) {
        int n = 21;
        System.out.println(nextGreaterElement(n));
    }
}
