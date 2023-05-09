
public class ScratchPad3 {

        // your code
        public static char[] sortDesc(final int num) {
            //Your code

           char[] arr=Integer.toString(num).toCharArray();
           int arrLen=arr.length;
           char[] newArr= new char[arrLen];

           for(int i=0; i<arrLen; i++){
               for (int j = 9; j >= 0; j--) {
                   if(arr[i]==arr[j]){
                       newArr[j]=arr[i];
               }
               }
           }
           return newArr;



        }

    public static void main(String[] args) {
      char[] res= sortDesc(52947);
        System.out.println(res);
    }
}
