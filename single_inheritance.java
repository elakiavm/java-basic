class key{
    int age = 20;
    void get(){
        age= age+40;
        System.out.println("Parent age"+age);
    }
}

class Subkey extends key{
    float tax = 10.5f;
    int age = 100;
    void print(){
        age = age + 50;
        System.out.println("Child age" + age);
        System.out.println("Child age" +  super.age);
        super.get();

    }
    void get(){
        System.out.println("Child age"+age);
        super.get();
    }
    
}


public class single_inheritance {
    public static void main(String[] agrs){
        Subkey s = new Subkey();
        s.print();
    }   
}
