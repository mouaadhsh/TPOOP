package EXO3;

public class Circulation {
    public static void main(String[] args) {
        Object a = new automobile(0, 50);
        Object v = new Velo(0, "VTT");
        Vehicule vh = new Vehicule(3, 10);
        conducteur c = new conducteur("Karim", "1234567");
        //v.tombe();
        // the object "v" here of the type "Object" in java "Object" class is the supper class of all other class, so we can't use the object "v" to call method from class Vehicule because Vehicule is subclass of "Object"
        //c.conduit((automobile) v);
        //again we cant cast "v" here to automobile because automobile is subclass of "Object" and "v" is an object of type "Object"
        //c.conduit(a);
        // same problem here as before we can't cast to "a" which is an object of type "Object" to subclass type
        //((automobile)vh).faitLePlein(10);
        // also here "vh" is object of type Vehicule which is super class of class automobile so we can't cast "Vh" to it
        // NOTE: all code in line 9 and 11,13,15 well throw Exception message
    }
}
