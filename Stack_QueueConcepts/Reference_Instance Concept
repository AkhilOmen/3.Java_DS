import java.io.*;
import java.util.*;

public class Main{
    
    public static class Person{
        String name;
        int age;
        
        Person(String name, int age){
            this.name = name;
            this.age = age;
        }
        
        public void SaysHi(){
            System.out.println(name + " @ " + age + " Years of age Say's Hai");
        }
        
    }
    
    public static void main(String[] args){
        Person p1 = new Person("A", 20);
        Person p2 = new Person("B", 30);
        
        p1.SaysHi();
        p2.SaysHi();
        
        // ...........................Swap will Happen.................
        Person temp = p1;
        p1 = p2;
        p2 = temp;
        p1.SaysHi();
        p2.SaysHi();
        // Ans............
        // B 30
        // A 20
        
        // ...........................Swap won't happen.................
        swap(p1, p2);
        p1.SaysHi();
        p2.SaysHi();
        // Ans............
        // A 20
        // B 30
        
        
        // ...........................Swap will happen.................
        swap1(p1, p2);
        p1.SaysHi();
        p2.SaysHi();
        // Ans............
        // B 30
        // A 20
        
        
        // ...........................See The code .................
        swap2(p1, p2);
        p1.SaysHi();
        p2.SaysHi();
        // Ans............
        // B 20
        // A 0
        
        
        // ...........................See The code .................
        swap3(p1, p2);
        p1.SaysHi();
        p2.SaysHi();
        // Ans............
        // A 20
        // null 30
        
    }
    
    public static void swap(Person p1, Person p2){
        Person temp = p1;
        p1 = p2;
        p2 = temp;
    }
    
    public static void swap1(Person p1, Person p2){
        
        String nP = p1.name;
        p1.name = p2.name;
        p2.name = nP;
        
        
        int aP = p1.age;
        p1.age = p2.age;
        p2.age = aP;
        
    }
    
    public static void swap2(Person p1, Person p2){
        String nP = p1.name;
        p1.name = p2.name;
        p2.name = nP;
        
        p1 = new Person(null, 0);
        int aP = p1.age;
        p1.age = p2.age;
        p2.age = aP;
        
    }
    
    public static void swap3(Person p1, Person p2){
        p1 = new Person(null, 0);
        String nP = p1.name;
        p1.name = p2.name;
        p2.name = nP;
        
        p2 = new Person(null, 0);
        int aP = p1.age;
        p1.age = p2.age;
        p2.age = aP;
        
    }
    
}