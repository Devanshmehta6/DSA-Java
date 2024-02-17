import java.util.Scanner;

public class lec8 {

    public static void sumOfOddNumbers(int n){
        int sum = 0;
        for(int i=1; i<=n; i=i+2){
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void gcd(int a, int b){
        int result = Math.min(a,b);
        while(result > 0){
            if(a % result == 0 && b % result == 0){
                break;
            }
            result--;
        }
        System.out.println("The GCD of " + a + " and " + b + " is: "+result);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // sumOfOddNumbers(n);

        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(a, b);
    }
}
