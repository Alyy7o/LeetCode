class IndexOffirstOcc {
    public static int strStr(String haystack, String needle) {
        if(needle.isEmpty()){
            return -1;
        }
        else{
            for(int i=0; i<haystack.length(); i++){
                if(haystack.substring(i, i+needle.length()).equals(needle)){
                    return i;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack = "sadbutsad", needle = "sad";
        System.out.println(strStr(haystack, needle));
    }
}