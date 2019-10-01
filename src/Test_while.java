public class Test_while {
    public static void main(String[] args)
    {
        int x=1;
        while(x<5)
        {
            System.out.println("the value is:"+ x);
            if(x%2==0)
            {
                System.out.println("this is even number");
            }
            x=x+1;
        }
    }
}
