package FINALTP;

public class Part {
     private String Name;
     private int timeofmanufacture;
     public int getTimeofmanufacture(){
         return  timeofmanufacture;
     }
     public void setTimeofmanufacture(int timeofmanufacture){
         this.timeofmanufacture = timeofmanufacture;
     }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Part() {
    }

    public Part(String name, int timeofmanufacture){
        this.Name = Name;
        this.timeofmanufacture = timeofmanufacture;
    }
}
