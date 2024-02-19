public class lec13 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello World");
        System.out.println(sb);

        System.out.println(sb.charAt(0));

        sb.setCharAt(0, 'L');   // ---- will replace existing character with new char
        System.out.println(sb);

        sb.insert(0,'P'); // ----- insert new char at specified index and shift other, no changes in prev string
        System.out.println(sb);

        sb.delete(0,1); // ---- deletes only 0th element, end index is non-inclusive
        System.out.println(sb); 

        sb.append("d");
        System.out.println(sb);
       
        System.out.println(sb.length());
    }
}
