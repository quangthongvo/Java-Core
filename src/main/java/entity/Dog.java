package entity;

public class Dog {
    public String name;
    public int age;


    public Dog (String name, int age) {
        System.out.println("Khoi tao 2 tham so");
        this.name = name;
        this.age = age;
    }
    @Override
    public  String toString(){
        return "entity.Dog{" +
                "name='" + name + '\'' +
                ", age =" + age +
                '}';
    }
}
