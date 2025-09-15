import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();
        System.out.println("Du angav: " + number);
        scanner.close();

        System.out.println("------");
        //Uppgift 1.1
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------");
        //Uppgift 1.2
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
        System.out.println("------");
        //Uppgift 1.3
        for (int i = 1; i <= 10; i++) {
            System.out.println(number * i);
        }
        System.out.println("------");
        //Uppgift 2.1
        int evenNumbers = 2;
        while (evenNumbers <= 20) {
            System.out.println(evenNumbers);
            evenNumbers +=2;
        }
        System.out.println("------");
        //Uppgift 2.2
        int guessedNumber = 33;
        boolean correctNumber = false;
        while (correctNumber == false) {
            System.out.println("The correct number is: " + guessedNumber);
            correctNumber = true;
        }
        //Uppgift 3.1
        do {
            System.out.println("Ange en siffra, så länge det inte är ett negativt tal: "
            + number);
        } while (number >= 0);
        //Uppgift 3.2
        do {
            
        } while (number >= 0);
    }
}