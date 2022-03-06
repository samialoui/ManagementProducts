
public  abstract class Personne {
    protected  int ident;
    protected String nomsocial;
    protected String adresse;
    
    protected Personne(int ident, String nomsocial , String adresse){
        this.ident=ident;
        this.nomsocial=nomsocial;
        this.adresse=adresse;
        
        
    }
    Personne()
    {
    }
    protected int getIdent(){
        return ident;
    }
    protected void setIdent(int ident){
        this.ident = ident;
    }
    protected String getNomsocial(){
        return nomsocial;
    }
    protected void setNomsocial(String nomsocial){
        this.nomsocial = nomsocial;
    }
    protected String getAdresse(){
        return adresse;
    }
    protected void setAdresse(String Adresse){
        this.adresse = adresse;
    }
    protected void Affiche(){
        System.out.println(ident + " " + nomsocial + " " + adresse);
    }
    
    
}
