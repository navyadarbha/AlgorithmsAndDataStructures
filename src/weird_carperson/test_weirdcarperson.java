package weird_carperson;

public class test_weirdcarperson
{
    public static void main(String[] args)
    {
        car camry = new car("camry", "red");
        car bmw = new car("BMW","Black");
        car accord = new car("Accord","white");

        person Navya = new person("Navya",142,160, camry);
        person Balaji = new person("Balaji",160,170,bmw);
        person Jenny = new person("Jenny",5,50,accord);
    }
}
