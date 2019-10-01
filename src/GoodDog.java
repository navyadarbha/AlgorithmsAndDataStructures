public class GoodDog {
    private int size;

   public int getsize()
    {
        return size;
    }

    public void setsize(int s)
    {
        size = s;
    }

    void bark()
    {
        if (size>60)
        {
            System.out.println("woof woof");
        }
        else if (size >14)
        {
            System.out.println("Ruff Ruff");
        }
        else
        {
            System.out.println("Yip Yip");
        }
    }
}

class Gooddogtestdrive
{
    public static void main(String[] args)
    {
        GoodDog one = new GoodDog();
        one.setsize(50);
        System.out.println(one.getsize());
        GoodDog two = new GoodDog();
        System.out.println(two.getsize());
        two.setsize(12);
        one.bark();
        two.bark();

    }
}