//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //DEL 1

        // 1.1
        int age = 30;
        double height = 1.75;
        char initial = 'A';
        String name = "Alice";
        boolean isStudent = true;

        // 1.2
        System.out.println("Ålder: " + age);
        System.out.println("Höjd: " + height);
        System.out.println("Bokstav: " + initial);
        System.out.println("Namn: " + name);
        System.out.println("Sant eller falskt? " + isStudent);

        System.out.println("---------");

        System.out.println(((Object) age).getClass().getName());
        System.out.println(((Object) height).getClass().getName());
        System.out.println(((Object) initial).getClass().getName());
        System.out.println(((Object) name).getClass().getName());
        System.out.println(((Object) isStudent).getClass().getName());

        System.out.println("---------");

        // 2.1

        System.out.println(10 + 20);
        System.out.println(100 - 30);
        System.out.println(5 * 7);
        System.out.println(20 / 4);
        System.out.println(10 % 3);

        System.out.println("---------");

        // 2.2

        int a = 15;
        int b = 20;

        boolean isEqual = (a == a);
        boolean isNotEqual = (b != b);
        boolean isLessThan = (a < b);
        boolean isGreaterThan = (b > a);
        boolean isGreaterThanOrEqualTo = (b >= b);
        boolean isLessThanOrEqualTo = (a <= b);

        System.out.println(a == b);
        System.out.println(a > b);
        System.out.println(a <= b);

        System.out.println("---------");

        // 2.3

        int x = 10;
        int y = 5;
        int z = 20;

        System.out.println(x > y && z > y);
        System.out.println(x > y || z < y);
        System.out.println(!(x > y));

        System.out.println("---------");

        // 2.4

        System.out.println((10 + 5) * 2 > 20);

        System.out.println("---------");

        // 3.1

        System.out.println(Math.sqrt(a * a + b * b));

        System.out.println("---------");

        // 3.2

        int userAge = 40;
        boolean legalVotingAge = (userAge >= 18);
        boolean eligibleForPension = (userAge >= 65);
        System.out.println(legalVotingAge);
        System.out.println(eligibleForPension);

        System.out.println("---------");

        // 3.3

        double priceForTomatoes = 25;
        double priceForPotatoes = 30;
        double priceForSnacks = 19;

        System.out.println(priceForSnacks + priceForPotatoes + priceForTomatoes);

        // 3.4


    }
}