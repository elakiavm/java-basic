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
import java.lang.*;
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

        StringBuffer a1 = new StringBuffer("Elakia");
        a1.append(" VM");

        System.out.println(a1);
        System.out.println(a1.insert(0,"Welcome "));

        String myStr = "Hello";
        char result = myStr.charAt(3);
        System.out.println(result);

        char result1 = myStr.charAt(0);
        System.out.println(result1);

        String myStra = "Hello";
        System.out.println(myStra.contentEquals("Hello"));  // true
        System.out.println(myStra.contentEquals("e"));      // false
        System.out.println(myStra.contentEquals("Hi"));

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        String myStr3 = "Another String";
        System.out.println(myStr1.equals(myStr2)); // Returns true because they are equal
        System.out.println(myStr1.equals(myStr3));




    }
}
