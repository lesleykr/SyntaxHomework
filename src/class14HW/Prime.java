package class14HW;

public class Prime {
    boolean isPrime(int num) {

        if (num == 2) {
            return true;
        } else if (num == 1) {
            return false;
        }
        {
            for (int i = 2; i <= num / 2; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Prime num1 = new Prime();
        System.out.println(num1.isPrime(73));
    }
}

/*
Write a method to return whether given number is prime or not?

 */