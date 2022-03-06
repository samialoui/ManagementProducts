
public class Ligne {
    private Commande commande;
    private Article article;
    private int quantitecomm;
    private Client client;
    
    public Ligne(Commande commande,Article article,Client client) {
        this.commande = commande;
        this.article = article;
        this.client = client;
    
}
    public Commande getCommande(){
        return commande;
    }
    public void setCommande(Commande commande){
        this.commande = commande;
    }
    public Article getArticle(){
        return article;
    }
    public void setArticle(Article article){
        this.article = article;
        
    }
    public int getQuantitecomm(){
        return quantitecomm;
    }
    public void setQuantite(int quantitecomm ){
        this.quantitecomm = quantitecomm;
        
    }
    
    
}
