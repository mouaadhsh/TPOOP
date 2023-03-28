package FINALTP;

import java.util.ArrayList;

public class CompoundParts extends Part {

    private final ArrayList<Part> listofparts = new ArrayList<>();
    private int assembleTime ;
    public CompoundParts(String Name) {
        super(Name, 0);
    }

    public void add(Part newpart) {
        listofparts.add(newpart);
        this.assembleTime +=newpart.fabTime();
    }

    @Override
    public int fabTime() {
        return assembleTime;
    }

    public void displayParts() {
        for (Part listofpart : this.listofparts) {
            System.out.println("part Name" + listofpart.getName() + " Manufacture time:" + listofpart.fabTime());
        }
    }
}
