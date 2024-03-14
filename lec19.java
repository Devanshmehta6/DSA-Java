import java.util.ArrayList;

public class lec19 {

    public static void permutations(String str, String permutation){

        if(str.length() == 0){
            System.out.println(permutation);
            return;
        }
        for(int i=0; i<str.length(); i++){
            char curr = str.charAt(i);
            String newStr =  str.substring(0,i) + str.substring(i+1);
            permutations(newStr, permutation+curr);
        }
        
    }

    public static int countPath(int i, int j, int n, int m){

        if(i == n-1 && j == m - 1){
            return 1;
        }

        if(i == n || j == m){
            return 0;
        }

        int downpath = countPath(i+1, j, n, m);
        int rightpath = countPath(i, j+1, n, m);

        return downpath + rightpath;

    }

    public static int placeTiles(int n, int m){
        
        if(n == m) return 2;
        if(n < m) return 1;
        int vertical = placeTiles(n-m, m);
        int horizontal = placeTiles(n-1, m);
        return vertical + horizontal;
    }

    public static int waysToInvite(int n){

        if(n <= 1) return 1;
        // single
        int single = waysToInvite(n-1);
        // pair
        int pair = (n-1) * waysToInvite(n-2);
        
        return single + pair;

    }

    public static void printSubset(ArrayList<Integer> subset){
        for(int i=0; i<subset.size();i++){
            System.out.print(subset.get(i)+" ");
        }
        System.out.println();
    }

    public static void findSubsets(int n, ArrayList<Integer> subset){

        if(n==0){
            printSubset(subset);
            return;
        }
        subset.add(n);
        findSubsets(n-1, subset);

        subset.remove(subset.size() - 1);
        findSubsets(n-1, subset);

    }
    public static void main(String[] args) {
        // permutations("abc", "");
        // int result = countPath(0, 0, 3, 3);
        // System.out.println(result);

        // int result = placeTiles(4, 2);
        // System.out.println(result);

        // int result = waysToInvite(4);
        // System.out.println(result);

        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSubsets(n, subset);
    }
}
