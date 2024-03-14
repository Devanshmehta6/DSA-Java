public class lec18 {

    public static void towerOfHanoi(int n, String source, String helper, String dest){
        if(n == 1){
            System.out.println("Move disk " + n + " from " + source + " to " + dest);
            return;
        }
        towerOfHanoi(n-1, source, dest, helper);
        System.out.println("Move disk " + n + " from " + source + " to " + dest);
        towerOfHanoi(n-1, helper, source, dest);
    }

    public static void reverseString(int index, String str){
        if(index == -1){
            return;
        }

        System.out.print(str.charAt(index));
        reverseString(index - 1, str);
    }

    public static int first = -1;
    public static int last = -1;

    public static void firstAndLast(int index, String str, char element){
        if(index == str.length()){
            System.out.println("first: "+first);
            System.out.println("last: "+last);
            return;
        }

        if(str.charAt(index) == element){
            if(first == -1){
                first = index;
            }else{
                last = index;
            }
        }

        firstAndLast(index+1, str, element);
    }

    public static boolean sortedArray(int index, int arr[]){
        if(index == arr.length-1){
            return true;
        }
        
        if(arr[index] < arr[index+1]){
            return sortedArray(index+1, arr);
        } else{
            return false;
        }
    }

    public static void moveAllXatEnd(int index, String str, String newString, int count){
        

        if(index == str.length()){
            for(int i=0;i<count;i++){
                newString += "x";
            }
            System.out.println(newString);
            return;
        }


        if(str.charAt(index) == 'x'){
            count++;
            moveAllXatEnd(index+1, str, newString, count);
        }
        else {
            newString += str.charAt(index);
            moveAllXatEnd(index+1, str, newString, count);
        }
    }

    public static boolean[] map = new boolean[26];

    public static void removeDuplicate(int index, String str, String newString){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        if(map[str.charAt(index) - 'a'] == true){
            removeDuplicate(index+1, str, newString);
        }else{
            newString += str.charAt(index);
            map[str.charAt(index) - 'a'] = true;
            removeDuplicate(index+1, str, newString);
        }
    }

    public static void subsequences(int index, String str, String newString){

        if(index == str.length()){
            System.out.println(newString);
            return;
        }
        char curr = str.charAt(index);
        subsequences(index+1, str, newString + curr);
        subsequences(index+1, str, newString);
    }

    public static String[] keypad = {".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombinations(String str, int index, String combination){
        if(index == str.length()){
            System.out.println(combination);
            return;
        }
        char curr = str.charAt(index);
        String mapping = keypad[curr - '0'];

        for(int i=0; i<mapping.length(); i++){
            printCombinations(str, index+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        // int n = 2;
        // towerOfHanoi(n, "S", "H", "D");

        // String str = "abcde";
        // reverseString(str.length()-1, str);

        // String str = "abababbeafhau";
        // firstAndLast(0, str, 'a');

        // int[] arr = {1,2,3,4,5,1};
        // boolean res = sortedArray(0, arr);
        // System.out.println(res);

        // moveAllXatEnd(0, "abxxcxddx", "", 0);

        // removeDuplicate(0, "adddbccd", "");

        // subsequences(0, "abc", "");

        printCombinations("23", 0, "");
    }
}
