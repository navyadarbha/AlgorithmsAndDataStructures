public class Mix4 {
    int counter;

}
class main{
    public static void main(String[] args) {
        int count=0;
        Mix4[] m4a = new Mix4[20];
        int x = 0;
        while(x<7){
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count++;
            count += 1;
            x++;
        }
        System.out.println(count+" "+m4a[1].counter);
    }
}