public class Villkor {
    public static void main(String[] args) {
        System.out.println("Villkor");
        int number = 10;

        if (number > 10) {
            System.out.println("Talet: " + number + "  är större än 10");
        }

        else if (number < 10) {
            System.out.println("Talet: " + number + " är mindre än 10");
        }

        else if (number == 10) {
            System.out.println("Talet: " + number + " är lika med 10");
        }

        System.out.println("----------");

        number = 0;
        if (number > 0) {
            System.out.println("Talet: " + number + " är större än 0");
        }

        else {
            System.out.println("Talet: " + number + " är mindre än 1");
        }

    }
}
