package EXO1;
public class Main{
    public static void main(String[] args) {
        //in line 6 the code will create an instance of C5 but then upcast it to C1
        //note that upcast is typecasting from a subclass to a superclass
        C1 a= new C5();
        //in line 8 the code will create an instance of C3 but then upcast it to C1
        C1 b = new C3();
        //c is an object of subclass C2 and a is an object of superclass C1 ,Downcasting is not possible in java
        //Downcasting is typecasting form superclass to a subclass
        //C2 c = a;
        // same problem for line 13 as in line 10 Downcasting is not possible in java
        //C4 d = new C1();
        // we assign object a to b in line 15 and this possible because a and b are of the same class type
        b = a;

        b = new C6();
        //Downcasting is not possible in java
        //c = b;
        //Downcasting is not possible in java
        //d = b;
        // we created object e of class type C4
        C4 e;
        //the code in line 25 will create an instance of C5 but then upcast it to C1
        b = new C5();
        // again we upcast the object b to C4 then we assign it to object e of type class C4
        e = (C4) b;


    }


}
