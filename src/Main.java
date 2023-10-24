import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int zero = 0;
        boolean yes_no = true;


        Scanner scan = new Scanner(System.in);
        // enter the doubles
        System.out.print("Enter double 1 ");

        double integer_1 = scan.nextDouble();
        System.out.print("Enter double 2 ");

        double integer_2 = scan.nextDouble();
        System.out.print("Enter double 3 ");

        double integer_3 = scan.nextDouble();
        System.out.print("Enter double 4 ");

        double integer_4 = scan.nextDouble();

        System.out.print("Enter double 5 ");
        double integer_5 = scan.nextDouble();


        System.out.println("Do you want me to do say it? ");
        Scanner scan2 = new Scanner(System.in);
        String yes_no2 = scan2.nextLine();


        if (yes_no2.equals("no") || yes_no2.equals("No")){
            yes_no = false;
        }

        // check if the doubles are even or odd
        if (integer_1 == 0) {
            zero++;
        } else if (integer_1 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        // integer one complete

        if (integer_2 == 0) {
            zero++;
        } else if (integer_2 % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        // integer 2 complete

        if (integer_3 == 0) {
            zero++;
        } else if (integer_3 % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        // integer 3 complete

        if (integer_4 == 0) {
            zero++;
        } else if (integer_4 % 2 == 0) {
            even++;
        } else {
            odd++;
        }

        //integer 4 complete
        if (integer_5 == 0) {
            zero++;
        } else if (integer_5 % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        //integer 5 complete

        //prints out it
        if (yes_no) {
            String zeroText = zero == 1 ? "zero" : "zeros";

            if (zero > 0) {
                System.out.println("There are " + even + " even numbers, " + odd + " odd numbers, and " + zero + " " + zeroText);
            } else {
                System.out.println("There are " + even + " even numbers, " + odd + " odd numbers, and no " + zeroText);
            }
        } else {
            System.out.println("No results to display.");
        }

        }
    }
