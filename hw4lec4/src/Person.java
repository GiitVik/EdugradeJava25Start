public class Person {
    String name;
    int age;
    String occupation;

    public void introduce() {
        System.out.println("Hej! Jag heter " + name + ". Jag är " + age +
                " år gammal. Just nu arbetar jag som " + occupation + ".");
    }
    //Uppgift 2.1
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }
}
