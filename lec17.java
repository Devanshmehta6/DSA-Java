public class lec17 {
    // public static void printNum(int n){
    //     if(n == 6){
    //         return;
    //     }

    //     System.out.println(n);
    //     // printNum(n-1);             printing 5 to 1
    //     printNum(n+1);
    // }

    // sum of n natural numbers

    // public static void sumOfNnumbers(int n, int i, int sum){
    //     if(i == n){
    //         sum += i;
    //         System.out.println(sum);
    //         return;
    //     }

    //     sum = sum + i;
    //     sumOfNnumbers(n, i+1, sum);
    // }

    // factorial
    // public static int factorial(int n){
    //     if(n == 1 || n == 0){
    //         return 1;
    //     }
        
    //     int result = factorial(n-1);
    //     return result * n;
    // }

    // fibonacci
    // public static void fibo(int a, int b, int n){
    //     if(n == 0) return;        
    //     int c = a + b;
    //     System.out.println(c);
    //     fibo(b,c,n-1);
    // }

    // x raised to n
    public static int power(int x, int n){
        if (x == 0) return 0;
        else if(n == 0) return 1;

        int result = x * power(x,n-1);
        return result;
    }


    public static void main(String[] args) {
        // int i = 1;
        // int n = 10;
        // System.out.println(0);
        // System.err.println(1);
        // int n = 7;
        // fibo(0,1,n-2);

        int x = 2, n = 5;
        System.out.println(power(x, n));
    }
}
