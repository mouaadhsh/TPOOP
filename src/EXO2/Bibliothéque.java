package EXO2;

public class Bibliothéque {
    Document[]tabofdocs;
    public Bibliothéque(int n){
    this.tabofdocs = new Document[n];

    }
    public void ajouter(Document d){
        if (Document.NumOfDocs <tabofdocs.length) {
            this.tabofdocs[d.NumOfDocs] = d;
        }

    }
    public void listing(){
        for (int i = 0; i < Document.NumOfDocs; i++) {
            tabofdocs[i].affiche();
        }
    }
}
