package FINALTP;

import javax.lang.model.element.Name;
import java.util.ArrayList;

public class CompoundParts extends Part{
    private String Name;

    private  int timeofmanufacture;

    private ArrayList<Part> listofparts = new ArrayList<Part>();

    public void add(Part newpart){
        listofparts.add(newpart);
        this.timeofmanufacture+=newpart.getTimeofmanufacture();
    }
    public CompoundParts(String name){
        this.Name = name;
        this.timeofmanufacture = 0;
    }

    @Override
    public void setName(String name) {
        Name = name;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public int getTimeofmanufacture() {
        return timeofmanufacture;
    }
}
