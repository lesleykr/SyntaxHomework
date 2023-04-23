package class11HW;

import java.util.Scanner;

public class BabyNames {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Is your baby a boy or girl?");
        String gender = input.next().toUpperCase();
        System.out.println("What is the mother's name?");
        String mom = input.next().toUpperCase();
        System.out.println("What is the father's name?");
        String dad = input.next().toUpperCase();

        String momBeg = "";
        String momEnd = "";
        String dadBeg = "";
        String dadEnd = "";

        if (dad.length() % 2 == 0) {
            dadBeg = dad.substring(0, (dad.length() / 2));
            dadEnd = dad.substring((dad.length() / 2), dad.length());
        } else {
            dadBeg = dad.substring(0, ((dad.length() - 1) / 2)+1);
            dadEnd = dad.substring(((dad.length() - 1) / 2), dad.length());
        }
        if (mom.length() % 2 == 0) {
            momBeg = mom.substring(0, (mom.length() / 2));
            momEnd = mom.substring((mom.length() / 2), mom.length());
        } else {
            momBeg = mom.substring(0, ((mom.length() - 1) / 2)+1);
            momEnd = mom.substring(((mom.length() - 1) / 2), mom.length());
        }
        if (gender.toUpperCase().equals("BOY")) {
            System.out.println(dadBeg+ momEnd);

        } else if (gender.toUpperCase().equals("GIRL")) {
            System.out.println(momBeg+ dadEnd);
            }else{
                System.out.println("Gender is unknown/non-binary. Come up with a creative name!");
            }

        }
    }
