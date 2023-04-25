package class12HW;

public class Reverse {
    public static void main(String[] args) {
        String str1="meep";

        for (int i = str1.length()-1; i >= 0 ; i--) {
            System.out.print(str1.charAt(i));

        }
    }
}
