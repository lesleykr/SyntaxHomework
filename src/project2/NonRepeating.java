package project2;

public class NonRepeating {
    public static void main(String[] args) {
        var count=0;
        var str="abracadabra";

        char[] arr1=str.toCharArray();

        for(char ch:arr1){
            count=0;
            for(char ch2:arr1){
              if(ch==ch2){
                  count++;
              }
            }if(count==1){
                System.out.println(ch);
                break;
            }
        }

    }
}
