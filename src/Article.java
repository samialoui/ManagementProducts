
public class Article {
    int reference;
    private String designation;
    private double prixunitaire;
    private int quantitestock;
    
    public Article(int reference , String designation , double prixunitaire , int quantitestock){
        this.reference = reference;
        this.designation = designation;
        this.prixunitaire = prixunitaire;
        this.quantitestock = quantitestock;
        
    }
    public Article(Article a){
        reference = a.reference;
        designation = a.designation;
        prixunitaire = a.prixunitaire;
        quantitestock = a.quantitestock;
    }

    Article() {
        
    }
    public int getReference(){
        return reference;
    }
    public void setReference(int reference){
        this.reference = reference;
    }
    public String getDesignation(){
        return designation;
    }
    public void setDesignation(String designation){
        this.designation = designation;
    }
    public double getPrixunitaire(){
        return prixunitaire;
    }
    public void setPrixunitaire(double prixunitaire){
        this.prixunitaire = prixunitaire;
        
    }
    public int getQauntitestock(){
        return quantitestock;
    }
    public void setQuantitestock(int quantitestock){
        this.quantitestock = quantitestock; 
    }
    public void Affiche(Article a){
        System.out.println("Reference: "+ a.reference+ "   Designation: "+ a.designation+"    Prixunitaire: "+a.prixunitaire+"    Quantitestock: "+a.quantitestock+"" );
    }
    
    
    
}
