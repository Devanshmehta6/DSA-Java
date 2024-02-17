import java.util.Scanner;

public class lec7 {

    public static void printName(String name){
        System.out.println("Name is "+name);
        return;
    }

    public static int addNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int factorial(int num){
        if(num<0){
            System.out.println("Invalid Number");
            return 0;
        }
        int result = 1;
        for(int i=num;i >= 1;i--){
            result = result * i;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String name = sc.next();
        // printName(name);
        
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = addNumbers(a,b);
        // System.out.println(sum);

        int num = sc.nextInt();
        System.out.println("Factorial: "+factorial(num));

    }
}
