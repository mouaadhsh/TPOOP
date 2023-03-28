package FINALTP;

public class Test {
    public static void main(String[] args) {
        Part Gpu = new Part("Rtx2070",20);
        Part Cpu = new Part("i913th13900k",50);
        Part Ram = new Part("16GBRAM",30);
        System.out.println(Gpu.getName());

        CompoundParts PC = new CompoundParts("GamingPC");
        PC.add(Gpu);
        PC.add(Cpu);
        PC.add(Ram);
        PC.displayParts();
        System.out.println("Compound Part name:"+PC.getName()+" Compound Part time of manufacture:"+PC.fabTime());
    }
}
