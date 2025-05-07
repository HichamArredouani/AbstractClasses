public class Mainn {
    public static void main(String[] args) {
        Dog een = new Dog("KleineDaggoe");
        Cat twee = new Cat("KleineCattoe");

        een.displayInfo();
        een.makeSound();

        twee.displayInfo();
        twee.makeSound();
    }
}
