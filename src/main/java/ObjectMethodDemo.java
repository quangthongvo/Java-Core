public class ObjectMethodDemo {
    public static void main(String[] args) {
        //toString
        Dog dog = new Dog();
        dog.name = "long";
        dog.age   = 2;
        System.out.println("dog = " + dog);

        // equals
        Dog dog1 = new Dog();
        dog1.name = "long";
        dog1.age = 2;
        Dog dog2 = new Dog();
        dog2.name = "long";
        dog2.age = 20;
        System.out.println(dog1==dog2);
        System.out.println(dog1.equals((dog2)));

        // hashCode

    }
}
