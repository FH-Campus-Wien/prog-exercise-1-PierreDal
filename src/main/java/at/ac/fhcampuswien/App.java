package at.ac.fhcampuswien;

import java.sql.SQLOutput;
import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        int hex= 0xface;

        char z= 'Z';
        int charcast = (int) z;


        byte num = 012;
        int bytecast = (int) num;

        long long1 = 80L;
        int longcast = (int) long1;

        float float1 = 44e-1f;
        int float1cast = (int) float1;

        float float2 =5.5f;
        int float2cast = (int) float2;

        double double1 = 8.88e1;
        int double1cast = (int) double1;

        double double2 = 99.9;
        int double2cast = (int) double2;


        int sum= hex+charcast+bytecast+longcast+float1cast+float2cast+double1cast+double2cast;
        System.out.println(""+sum);


    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        int x;
        int y;

        Scanner add = new Scanner(System.in);
        x = add.nextInt();
        y = add.nextInt();
        int summe = x+y;
        System.out.println(summe);


    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here

        int x;
        int y;
        Scanner swap = new Scanner(System.in);
        System.out.println("Before Swap:");

        System.out.print("x: ");
        x = swap.nextInt();
        System.out.print("y: " );
        y = swap.nextInt();
        System.out.println("After Swap:");

        x = x + y;
        y = x - y;
        x = x - y;


        System.out.println("x: "+x);
        System.out.println("y: "+y);


    }



    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        int n1,n2;

        Scanner comp = new Scanner(System.in);

        System.out.print("n1: ");
        n1 = comp.nextInt();
        System.out.print("n2: ");
        n2 = comp.nextInt();

        if (n1 > n2){
            System.out.println("n1 > n2");
        }
        else if (n2 > n1){
            System.out.println("n2 > n1");
        }
        else {
            System.out.println("n1 == n2");
        }


    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here
        int umsatz;

        Scanner rev = new Scanner(System.in);


        System.out.print("Enter annual Revenue: ");
        umsatz = rev.nextInt();
        if (umsatz < 0 || umsatz >= 100000)
        {
            System.out.println("Invalid Revenue");
        }

        else if (umsatz <= 0 || umsatz <20000)
        {
            System.out.println("Poor Sales Revenue");
        }

        else if (umsatz <= 20000 || umsatz <50000)
        {
            System.out.println("Average Sales Revenue");
        }

        else if (umsatz <= 50000 || umsatz<80000)
        {
            System.out.println("Good Sales Revenue");
        }

        else if (umsatz <= 80000 || umsatz <100000)
        {
            System.out.println("Excellent Sales Revenue");
        }



    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        int provision;

        Scanner prov = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        provision = prov.nextInt();

        switch (provision)
        {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;

            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }


    }

    //todo Task 9
    public void leapyear(){
        // input your solution here
        int jahr;

        Scanner year = new Scanner(System.in);
        System.out.print("Year: ");
        jahr = year.nextInt();

        if ((jahr % 4 == 0) && ((jahr % 400 == 0) || (jahr % 100 != 0)) ) {
            System.out.println("Leapyear");
        }

        else {
            System.out.println("Not a Leapyear");
        }


}


    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        System.out.print("Number: ");
        Scanner turn = new Scanner(System.in);
        int number = number = turn.nextInt();;
        int reversednumber = 0;

        String s = String.valueOf(number);

        if (s.length() > 3)
        {
            System.out.println("Bitte nur dreistellige Zahlen!");
        }

        else {

            while (number != 0) {

                int komma = number % 10;
                reversednumber = reversednumber * 10 + komma;

                number /= 10;
            }

            System.out.println("" + reversednumber);
        }
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}