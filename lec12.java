import java.util.Scanner;

public class lec12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Name is: "+name);

        System.out.println("Length of string: "+name.length());

        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

        String name2 = "hello";

        if(name.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        } else{
            System.out.println("Not equal");
        }

        String sub = name.substring(0,name.length()-1);
        System.out.println(sub);
    }
}