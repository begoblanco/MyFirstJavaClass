package dev.bego;


public final class App {
    private App() {
    }

    public static void main(String[] args) {

        Person person1 = new Person("Miku", "Hatsune", "3939-A", 2007, "Japan", 'F');
        Person person2 = new Person("Kiara", "Takanashi", "3069-B", 1995, "Austria", 'F');

        System.out.println();
        person1.printAttributes();
        System.out.println();
        person2.printAttributes();
    }
}
