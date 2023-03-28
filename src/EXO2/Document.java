package EXO2;

public class Document {
    String titre;
    static int NumOfDocs;

    public Document(){
        NumOfDocs++;
    }
    public  Document(String titreinput){
        this.titre = titreinput;
        NumOfDocs++;
    }
    public void affiche(){

        System.out.println(this.titre);
    }
}
