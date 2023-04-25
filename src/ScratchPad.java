/*
import java.util.List;

public class MixedSum {

    */
/*
     * Assume input will be only of Integer o String type
     *//*


    public int sum(List<?> mixed) {
        int total=0;
        String[] arr=mixed.toArray(new String[0]);
        for(int i=0;i<arr.length;i++){
            int j=Integer.parseInt(arr[i]);
            total+=j;

        }

        return total;
    }
}*/
