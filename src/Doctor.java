class Hospitalstaff {

    boolean worksathospital;

    void treatpatient()
    {

    }
}

class Familydoctor extends Hospitalstaff{

    boolean makeshousecalls;

    void giveadvice()
    {

    }
}

class Surgeon extends Hospitalstaff{

    void treatpatient()
    {

    }

    void operate()
    {

    }
}

public class Doctor{

    public static void main(String[] args) {

        Hospitalstaff a = new Hospitalstaff();
        a.treatpatient();
        Familydoctor b = new Familydoctor();
        b.giveadvice();
        Surgeon c = new Surgeon();
        c.treatpatient();
        c.operate();
        Surgeon d = new Surgeon();
        d.operate();
    }
}
