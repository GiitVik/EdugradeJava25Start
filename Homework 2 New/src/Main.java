//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import com.sun.source.tree.WhileLoopTree;

import javax.lang.model.SourceVersion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // LOOOOOOOPS

        System.out.println("------");
        // 1.1
        System.out.println("1 till 10");
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("------");
        // 1.2
        System.out.println("1 till 100");
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
        }
        // 1.3
        System.out.println("------");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ange ett heltal: ");
        int number = scanner.nextInt();
        System.out.println("Du angav: " + number);
        for (int i = 0; i <= 10; i++) {
            System.out.println(number * i);
        }
        // 2.1
        System.out.println("------");
        int evenNumber = 2;
        while(evenNumber <= 20){
            System.out.println(evenNumber);
            evenNumber += 2;
        }
        // 2.2
        System.out.println("------");
        int lowestNumber = 1;
        int highestNumber = 100;
        int correctNumber = 33;
        boolean correctInput = false;
        while(!correctInput){
            System.out.print("Gissa ett tal mellan " + lowestNumber + " till " + highestNumber + ": ");
            number = scanner.nextInt();
            System.out.println("Du angav: " + number);
            if(number >= lowestNumber && number <= highestNumber && number == correctNumber){
                System.out.println(number + " är korrekt nummer!!");
                correctInput = true;
            }
            else if (number < lowestNumber || number > highestNumber){
                System.out.println("Ogiltigt nummer! Försök igen! Talet måste vara mellan "
                + lowestNumber + " till " + highestNumber + "!");
            }
            else {
                System.out.println("Fel! Försök igen!");
        }
        System.out.println("------");
        // 3.1
        do {
            System.out.print("Skriv ett negativt tal för att stänga loopen: ");
            number = scanner.nextInt();
            System.out.println("Du angav: " + number);
            if (number >= 0)  {
                System.out.println("Försök igen! " + number + " är för högt!");
            }
            else {
                System.out.println(number + " är korrekt!");
            }
            } while(number >= 0);
        }
        System.out.println("------");
        //3.2
        do {
            System.out.println("Välj mellan olika val på kalkylatorn.");
            System.out.println("1. Addition");
            System.out.println("2. Subtraktion");
            System.out.println("3. Multiplikation");
            System.out.println("4. Division");
            System.out.println("5. Avsluta kalkylatorn.");
            System.out.print("");
            number = scanner.nextInt();
            System.out.println("Du angav: " + number);
            switch (number) {
                case 1:
                    System.out.println("Addition");
                    break;
                case 2:
                    System.out.println("Subtraktion");
                    break;
                case 3:
                    System.out.println("Multiplikation");
                    break;
                case 4:
                    System.out.println("Division");
                    break;
                case 5:
                    System.out.println("Avsluta");
                    break;

            }
        } while(number != 5);

        // 4.1
        System.out.println("------");
        System.out.println("Primtal uppgift. 4.1");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;
            for (int j = 2; j <= i/2; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i + " är ett primtal.");
            }
        }
        // 4.2

    }
}