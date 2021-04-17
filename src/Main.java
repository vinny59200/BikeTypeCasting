import BusinessObjects.BMX;
import BusinessObjects.Bike;
import BusinessObjects.Cruiser;

public class Main {
/*
JAVA: UPCASTING & DOWNCASTING

An object can be referenced using either of the following:
Specific child subclass type
Generic parent superclass types

To invoke an operation on the object, reference type has to be specific enough to be at least at the level in the class hierarchy where the operation was first declared.

Type casting rules:
⚠ Casting is required to assign parent to child reference type.
✅ No casting is required to assign child to parent reference type.
❌ Casting is not possible between objects of sibling types.

⬆  Object          Object   ⚠
⬆   Bike            Bike    ⬇
✅  BMX   <-❌->  Cruiser  ⬇

 */
    public static void main(String[] args) {
        //✅
        BMX b1 = new BMX();
        Bike b2 = new Cruiser();
        Bike b3 = new BMX();
        Object b4 = new BMX();

        //⚠
        Bike b5 =(Bike) new Object();
        Cruiser b6 = (Cruiser) new Cruiser();

        //❌
        Cruiser b7 = (Cruiser) new BMX();//Does not compile: inconvertible types
    }
}
