package class12HW;

public class NotEmpty {
    public static void main(String[] args) {
        String str1 = "hello";

        if(!str1.isEmpty() && str1.length()%2==1 && str1.length()>=3){
            int mid=(str1.length()/2);
            System.out.println(str1.charAt(mid));
        }

    }
}
