public interface Operations {
   
    public void AjouterArticle(Article a);
    public void SupprimerArticle(int reference);
    public void AjouterClient(Client C);
    public void SupprimerClient(int ident);
   // public Client RechercherClient(int identifiant); 
    public void PasserCommande(Commande c);
    public void AnnulerCommande(int numcomm);
}
