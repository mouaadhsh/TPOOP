package FINALTP;

import javax.lang.model.element.Name;
import java.util.ArrayList;

public class CompoundParts {
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
    public void displayParts(){
        for (int i = 0; i < this.listofparts.size(); i++) {
            System.out.println("part Name"+this.listofparts.get(i).getName() +" Manufacture time:"+ this.listofparts.get(i).getTimeofmanufacture());
        }
    }

    public void setName(String name) {
        Name = name;
    }


    public String getName() {
        return this.Name;
    }


    public int getTimeofmanufacture() {
        return timeofmanufacture;
    }
}
