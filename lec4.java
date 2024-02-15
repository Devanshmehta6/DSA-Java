import java.util.Scanner;

public class lec4 {
    public static void main(String[] args) {

        // ------- For Loop --------
        // for (int i=0; i<3; i++)
        // {
        //     System.out.println("Hello");
        // }

        // -------- While loop --------
        // int i = 0;
        // while(i < 4)
        // {
        //     System.out.println(i);
        //     i++;
        // }
        
        // ----- Do while loop ---------
        // int i = 0;
        // do 
        // {
        //     System.out.println(i);
        //     i++;
        // }while(i < 5);

        // --------- Sum of n natural numbers -------
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int sum = 0;
        // for(int i=0;i<=num;i++){
        //     sum = sum + i;
        // }
        // System.out.println(sum);
        // sc.close();

        // --------- Print table -----------
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        for(int i=1; i<=10; i++){
            System.out.println(""+num+"*"+""+i+" = "+num*i);
        }
    }
}
