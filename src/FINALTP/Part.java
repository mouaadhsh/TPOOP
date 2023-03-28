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
        return this.Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public Part() {
    }

    public Part(String name, int timeofmanufacture){
        this.Name = name;
        this.timeofmanufacture = timeofmanufacture;
    }
}
