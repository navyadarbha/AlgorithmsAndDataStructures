import java.util.ArrayList;

public class Egg {

    public static void main(String[] args) {

        ArrayList<Egg> mylist = new ArrayList<Egg>();
        Egg a = new Egg();
        mylist.add(a);
        Egg b = new Egg();
        mylist.add(b);
        mylist.add(2,b);
        int size = mylist.size();
        System.out.println(size);
        boolean test = mylist.contains(a);
        System.out.println(test);
        int index = mylist.indexOf(b);
        System.out.println(index);
        mylist.remove(b);
        mylist.remove(a);
        boolean empty = mylist.isEmpty();
        System.out.println(empty);

    }
}
