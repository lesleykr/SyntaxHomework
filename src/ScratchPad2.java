public class ScratchPad2 {
    public static void main(String[] args) {
      /*  pattern1(5);
        pattern2(4);*/
        //pattern3(11);
        pattern35(5);
    }

    static void pattern35(int n){
        for (int row = 1; row <2*n ; row++) {
            for (int col = 0; (row>n) ? col < (2*n)-row : col < row ; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
/*    static void pattern3(int n){
        for (int row = 1; row <= n ; row++) {
            for (int col = 1; (col<=row && row<=n/2+1); col++) {
                System.out.print("*");
            }
            for (int col2 = n-row+1; (col2>0 && row>n/2+1); col2--) {
                System.out.print("*");
            }

            System.out.println();

        }
    }*/
/*static void pattern2(int n){
    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <=i ; j++) {
            System.out.print(j);
        }
        System.out.println();
    }
}
    static void pattern1(int n){
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }*/
}
