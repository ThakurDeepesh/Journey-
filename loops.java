import java.util.*;

public class loops {
    public void main(String[] args) {


        for (int counter = 0; counter < 11; counter = counter + 1) {
            System.out.println(counter);
        }

        for (int counter = 0; counter < 11; counter++) { //kindly focus on semicolons they are causing lots of erroe
            System.out.println(counter);

        }

        for (int i = 0; i <= 15; i++) {
            System.out.println(i);
        }


        int i = 0;
        while (i < 11) {
            System.out.println(i);
            i = i + 1; // i++;
        }


        //do - while
        int j = 0;
        do {
            System.out.println(i);
            j++; //or i= i+1;
        } while (j < 11);

        //Q.--> print sum of N natural numbers
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int sum = 0;

        for (int k = 1; k <= N; i++) {
            sum = sum + k;

        }
        System.out.println(sum);


        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int p = 2; p <= 10; p++) {
            System.out.println(n * i);
        }


        // Menu program to check marks and Give remarks
        Scanner x = new Scanner(System.in);
        int choice;

        do {
            System.out.println("chose 1 to continue and 0 to exit");
            choice = x.nextInt();
            if (choice == 1) {
                System.out.println("Enter you Marks between 1 to 100");
                int marks = sc.nextInt();
                if (marks >= 90) {
                    System.out.println("Very good ");
                } else if (marks >= 60) {
                    System.out.println("Good");

                } else if (marks > 0) {
                    System.out.println("you can do better");

                }
            } else if (choice != 0) {
                System.out.println("Invalid Choice please chose again");

            }

        } while (choice != 0);
        System.out.println("Thank you");

        //  Print if No. is prime
        Scanner y = new Scanner(System.in);
        int m = sc.nextInt();
        int Counter = 0;

        for (int l = 1; l <= m; l++) {
            if (m % l == 0) {
                Counter++;    //remember this and revise your notes if dont remember or dont understand what is going on here

            }
        }
        if (Counter <= 2) {
            System.out.println("Number is prime");
        } else {
            System.out.println("Number is not prime");


        }
    }
}