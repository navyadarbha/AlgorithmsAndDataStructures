public class Firstobject {
    int size;
    String bread;
    String name;
    void bark()
    {
        System.out.println("bow! bow!");
    }
}
class callfirstobject{
    public static void main(String[] args)
    {
        Firstobject dog = new Firstobject();
        dog.size = 40;
        System.out.println("Size of the dog is "+ dog.size);
        dog.bark();
    }
}
