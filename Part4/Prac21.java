class Degree{
    void getDegree(){
        System.out.println("I got a degree");
    }
    
}
class Undergraduate extends Degree{
    void print(){
        System.out.println("I am a Undergraduate");
    }
}
class Postgraduate extends Degree{
    void print(){
        System.out.println("I am a Postgraduate");
    }
}


public class Prac21 {
    public static void main(String[] args) {
        Degree d = new Degree();
        Undergraduate u = new Undergraduate();
        Postgraduate p = new Postgraduate();
        d.getDegree();
        u.print();
        p.print();
    }
}
