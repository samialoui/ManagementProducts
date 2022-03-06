
public class Client extends Personne{
    private double chiffreaffaire;
    public Client(int ident , String nomsocial, String adresse,double chiffreaffaire){
        super(ident , nomsocial , adresse);
        this.chiffreaffaire = chiffreaffaire;
   
    }

     Client(){
         
     }

   
    public double getChiffreaffaire(){
        return chiffreaffaire;
   
    }
    public void setChiffreaffaire(double chiffreaffaire ){
        this.chiffreaffaire = chiffreaffaire;
       
    }
    @Override
    public void Affiche(){
        super.Affiche();
        System.out.println("chiffreaffaire :" +chiffreaffaire );
        
    }
     public void Affiche(Client c){
        System.out.println("Identifiant: "+ c.ident+ "   Nom Social: "+ c.nomsocial+"   Adresse: "+c.adresse+"   Chiffre d'affaire: "+c.chiffreaffaire+"" );
    }
    
}
