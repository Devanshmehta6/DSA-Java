import java.util.Scanner;

public class lec10 {
    public static void main(String[] args) {
        // int[] marks = new int[3];

        // marks[0] = 90;
        // marks[1] = 95;
        // marks[2] = 70;

        // for(int i=0;i<marks.length;i++){
        //     System.out.println(marks[i]);
        // }

        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int[] numbers = new int[size];

        // for(int i=0; i<size;i++){
        //     numbers[i] = sc.nextInt();
        // }

        // for(int i=0;i<size;i++){
        //     System.out.println(numbers[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int[] numbers = new int[size];
        
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }

        int element = sc.nextInt();
        for(int i=0;i<size;i++){
            if(numbers[i] == element){
                System.out.println("Element is at index " +i);
            }
        }
        
        
    }
}
