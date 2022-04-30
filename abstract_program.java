class Airtel extends Trai{
    int scheme(){
        return 23;
    }
}
class Jio extends Trai{
    int scheme(){
        return 23;
    }
}
public class abstract_program {
    public static void main(String[] args){
        Trai b;
        n=new Airtel();
        System.out.println("Airtel Scheme is :"  + b.scheme());
        b=new Jio();
        System.out.println("Jio scheme is" + b.scheme());

    }
}
