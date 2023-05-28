import java.util.LinkedList;

   import java.util.*;

    class Main {
        public static void main(String[] args){
            LinkedList<Integer> primeNums=new LinkedList<>();

            int i=2;

            for( i=2; i<100; i++){
                int flag=0;
                int h=i/2;
                for(int j=2; j<=h; j++){
                    if(i%j==0){
                        flag++;
                    }
                }if(flag==0){
                    primeNums.add(i);
                }
            }System.out.println(primeNums);
        }
    }

