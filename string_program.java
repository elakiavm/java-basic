/*
String can be create in the 3 ways 
String literal 
New keyword
Char Array

Heap memory 

String constant pool

non pool area stores new keyword

stack -> stores char array

string is immutable part 

*/
import java.util.*;
public class string_program {
    public static void main(String[] args){
        
        //stack
        char letter[] = {'a','b','c','d','e'};
        System.out.println(letter);

        //non-pool
        String mec = new String("Hello");
        System.out.println(mec);

        //pool
        String name = "elakia";
        System.out.println(name);

        String pets = "Dog,Cat,Cow,Rat";
        System.out.println(pets.toLowerCase());
        System.out.println(pets);
        System.out.println(pets.toUpperCase());
        System.out.println(pets.concat(",Monkey"));
        System.out.println(pets);
        System.out.println(pets.indexOf('a'));
        System.out.println(pets.charAt(5));
        System.out.println(pets);




    }
}
