public class lec5 {
    public static void main(String[] args) {
        int n = 5; // rows
        int m = 5; // columns
        // ----- Solid Rectangle -------
        // for(int i=1;i <= 4;i++){
        //     for(int j=1; j <= 5;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ---- Hollow Rectangle -----
        // for(int i=1; i<=n; i++) {
        //     for(int j=1; j<=m; j++) {
        //         if(i == 1 || j==1 || i == n || j==m){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();

        // ----- Half Pyramid ------
        // for(int i=1; i <= n; i++){
        //     for(int j=1; j <= i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ----- Inverted Half Pyramid -----
        // for(int i=n; i>=1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ------ Inverted Half Pyramid rotated by 180 degrees ---------
        // for(int i=1; i<=n; i++){
        //     // spaces print
        //     for(int j=1; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // ------ Half Pyramid with Numbers --------
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }
    
        // ------- Inverted Half Pyramid with Numbers -------
        // for(int i=n; i >= 1; i--){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        // ----- Flyod's Triangle -----
        // int count = 1;
        // for(int i=1; i<= n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(count+" ");
        //         count++;
        //     }
        //     System.out.println();
        // }

        // ------ 0-1 Triangle ------
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0){
                    System.out.print("1");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

