public class BookAllocation {

    public boolean isValid(int arr[], int n, int m, int maxAllowedPages){ // O(n)
        int students = 1, pages = 0;

        for(int i=0; i<n; i++){ // O(n)
            if(arr[i] > maxAllowedPages) return false; //Edge case

            if(pages + arr[i] <= maxAllowedPages){
                pages += arr[i];
            }
            else{
                students++;
                pages = arr[i];
            }
        }

        return students > m ? false : true;
    }

    public int allocateBooks(int arr[], int n, int m){ // O(logN * n) or O(nlogn)

        if(m > n) return -1;

        int sum = 0;
        for(int i=0; i<n; i++){ // O(n)
            sum += arr[i];
        }

        int str = 0, end = sum, ans = -1; // range of Binary Search
        
        while (str <= end) { // O(logN * n) where n = total no. of books & N range at which BS apply
            int mid = str + (end-str) / 2;

            if (isValid(arr, n, m, mid)) { //left
                ans = mid;
                end = mid-1;
            }
            else{ //right
                str = mid+1;
            }
        }
        return ans;
    } 

    public static void main(String[] args) {
        BookAllocation bookAllocation = new BookAllocation();

        // int arr[] = {15,17,20};
        int arr[] = {12, 34, 67, 90};
        int n = arr.length, m = 2;

        System.out.println(bookAllocation.allocateBooks(arr, n, m));

        // problem link:
        // https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1
    }
}
