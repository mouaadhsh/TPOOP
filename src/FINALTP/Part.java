package FINALTP;

public class Part {
    private String Name;
    private int timeofmanufacture;

    public Part(String name, int timeofmanufacture) {
        this.Name = name;
        this.timeofmanufacture = timeofmanufacture;
    }

    public String getName() {
        return this.Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setTimeofmanufacture(int timeofmanufacture) {
        this.timeofmanufacture = timeofmanufacture;
    }

    public int fabTime() {
        return timeofmanufacture;
    }
}
