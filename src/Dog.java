public class Dog {
    String name;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "Bruno";

        Dog[] mydogs = new Dog[3];
        mydogs[0] = new Dog();
        mydogs[1] = new Dog();
        mydogs[2] = dog1;

        mydogs[0].name = "Snoopy";
        mydogs[1].name = "Rambo";

        System.out.println("dog's name is" + mydogs[2].name);

    }

    public void bark(){
        System.out.println("bow bow");


    }
}
