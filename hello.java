public class hello{
    public static void main(String[] agrs)
    {
        // System.out.println("Hello world" + 2951);
        // System.out.println("Hello அம்மா");
        // int a =50;
        // int b = (++a)+(++a)-(a--)+(a++)-(--a)+(a--);
        // System.out.println(a);
        // System.out.println(b);
        // String s = "\u0ab1";
        // String g = "\u0bb9";
        // String k = s.concat(g);
        // String h = (s + g);
        // System.out.println(h);
        int a = 50;
        if (a<10 | ++a>50){
            System.out.println("hello");
        }
        System.out.println(a);


    }
}
/*
Mem   51   52     51    52    51    50
b = (++a)+(++a)-(a--)+(a++)-(--a)+(a--)
Dis   51   +  52  - 52  + 51  -   50  +  50
*/