import java.util.Scanner;

public class lec11 {
    public static void main(String[] args) {
        // int rows = 3;
        // int columns = 5;
        // int[][] numbers = new int[rows][columns];

        // Scanner sc = new Scanner(System.in);

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         numbers[i][j] = sc.nextInt();
        //     }
        // }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<columns;j++){
        //         System.out.println("Element at "+i+","+j+" is "+numbers[i][j]);
        //     }
        // }

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] numbers = new int[rows][columns];

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        int element = sc.nextInt();

        for(int i=0;i<rows;i++){
            for(int j=0;j<columns;j++){
                if(numbers[i][j] == element){
                    System.out.println("Element found at "+i+" "+j);
                }
            }
        }
    }
}
