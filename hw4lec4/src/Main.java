//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Uppgift 1.1
        System.out.println("-------");

        Person person = new Person("Viktor", 29, "Systemutvecklare");

        System.out.println("Användarens namn: " + person.name);
        System.out.println("Användarens ålder: " + person.age);
        System.out.println("Användarens sysselsättning: " + person.occupation);

        //Uppgift 1.2
        System.out.println("--------");

        person.introduce();

        System.out.println("--------");



    }
}