// 1. Space Allocation

// 2. class Parsing -> 
                    // for int - 0;
                    // for boolean - false;
                    // for non-primitive data type - null;
                    // for double 0.0;

// 3. Constructor firing -> 
                        //  Function with the name similar to the class name.
                        //  A default Constructor is provided by Java.. If we forget to write.
                        //  There won't be any return type for Constructor, not even void. It return "this"(which containes the address of Instance) by default.
                        //  By default it returns this.


                        // Very Important point..............................
                        // If we give Parameterised Constructor, we need to write default constructor as well... because java will not take default constructor if we provide Parameterised Constructor.
// 


import java.io.*;
import java.util.*;

public class Main{
    
    public static class Person{

        // To Over ride the java defaults we can do it here or we can do it in Parameterised Constructor.
        String name;
        int age;
        
        public void SaysHi(){
            System.out.println(name + " @ " + age + " Years of age Say's Hai");
        }
        
        // default Constructor.
        public Person(){
            // By default it will return "this" which contain the Instance Address....
        }

        // Parameterised Constructor. 
        public Person(String name, int age){
            this.name = name;
            this.age = age;
        }

    }
    
    public static void main(String[] args){
        Person p1 = new Person("A", 20);
        Person p2 = new Person("B", 30);
        
        p1.SaysHi();
        p2.SaysHi();
        
        
    }
    
}