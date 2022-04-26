public class hello{
    public static void main(String[] agrs)
    {
        System.out.println("Hello world" + 2951);
        System.out.println("Hello அம்மா");
        int a =50;
        int b = (++a)+(++a)-(a--)+(a++)-(--a)+(a--);
        System.out.println(a);
        System.out.println(b);

    }
}
/*
Mem   51   52     51    52    51    50
b = (++a)+(++a)-(a--)+(a++)-(--a)+(a--)
Dis   51   +  52  - 52  + 51  -   50  +  50
*/