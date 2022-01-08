// import java.util.*;

public class T1{
    
    public static class Student{
        String name;
        int age;
    
        void AnnounceYourSelf(){
            System.out.println( this.name + " [" + this.age + "]" );
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "A";
        s1.age = 10;

        Student s2 = new Student();
        s2.name = "B";
        s2.age = 20;

        s1.AnnounceYourSelf();
        s2.AnnounceYourSelf();
        swap4(s1, s2);
        s1.AnnounceYourSelf();
        s2.AnnounceYourSelf();
        
    }

    // swap will not happen b/c we are not changing any data in instance and the swap will happen in swap function.
    // 1 -> 
        // public static void swap1(Student s1, Student s2){

        //     Student temp = s1;
        //     s1 = s2;
        //     s2 = temp;

        // }
    // 

    // swap will happen because we are changing the data in instance.
    // 2 -> 
        // public static void swap2(Student s1, Student s2){
        //     String ntemp = s1.name;
        //     s1.name = s2.name;
        //     s2.name = ntemp;

        //     int atemp = s1.age;
        //     s1.age = s2.age;
        //     s2.age = atemp;
        // }
    // 
    
    // swap will not happen because we are creating new instance for s1 and s2 in swap function. Orginal s1 and s2 will remain unchanged.
    // 3 -> 
        // public static void swap3(Student s1, Student s2){

        //     s1 = new Student();
        //     s2 = new Student();

        //     String ntemp = s1.name;
        //     s1.name = s2.name;
        //     s2.name = ntemp;

        //     int atemp = s1.age;
        //     s1.age = s2.age;
        //     s2.age = atemp;
        // }
        // 
    // 


    // A10 B20 Null0 B20, s1 will swap with a new s2 instance created in swap function and orginal s2 will remain unchanged.
    // 4 ->
    public static void swap4(Student s1, Student s2){
        s2 = new Student();
        
        String ntemp = s1.name;
        s1.name = s2.name;
        s2.name = ntemp;

        int atemp = s1.age;
        s1.age = s2.age;
        s2.age = atemp;

        s1 = new Student();
    }


}

