
import java.util.Scanner;

class PrimeNo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();
        System.out.println("Prime Numbers: ");

        for(int i=n1; i<=n2; i++){
            if(i <= 1){
                continue;
            }
            for (int j = 1; j <= Math.sqrt(i); j++) {
                if(i % j == 0){
                    continue;
                }
                System.out.println(i);
            }
        }
    }
}