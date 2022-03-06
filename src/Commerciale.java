

import java.time.Instant;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

public  class Commerciale implements Operations{

    private Vector<Article> articles =new Vector<Article>();
    private Vector<Client> clients = new Vector<Client>();
    private Vector<Commande> commandes = new Vector<Commande>();
    private Vector<Ligne> lignes = new Vector<Ligne>();
    
    
//////// Méthodes de l'articles
    @Override
    public void AjouterArticle(Article a) {
        articles.add(a);
        System.out.println(" ----Ajouter avec succés---- ");
    }
   
    
    public Article RechercherArticle(int reference){
        for(Article a : articles){
            if(a.reference==reference)
                return a;
        }
        return null;
        
    }
    @Override
    public void SupprimerArticle(int reference) {
        Article article  = new Article();
        article = RechercherArticle(reference);
      if (article !=null){
                  articles.remove(article);
                  System.out.println("----Suppression avec succès----");
      }
      
              
          
       else{
                  System.out.println("----Supression impossible: Article non existant----");
                  
           }
          
      }
     
    public void AfficherArticle(){
        for(Article a:articles){
          a.Affiche(a);
        }
    }
    
    
    
//////// Méthodes de  clients
    @Override
    public void AjouterClient(Client C) {
        clients.add(C);
        System.out.println(" ----Ajout avec succés---- ");
    }
    public Client RechercherClient(int identifiant){
        for(Client C : clients){
            if(C.ident==identifiant)
                return C;
            
        }
        return null;
        
    }
    @Override
    public void SupprimerClient(int  identifiant) {
        Client client = new Client();
        client =RechercherClient(identifiant);
        if (client!=null){
            
                    clients.remove(client);
                    System.out.println("----Suppression avec succès----");
                    
                    
                }
                else{
                    System.out.println("----Supression impossible: Client non existant----");
                    
                }  
            }
            
        public void AfficherClient(){
        for(Client a:clients){
          a.Affiche(a);
        }
    }
        
        
    
//////// Méthodes de commandes
    @Override
    public void PasserCommande(Commande c) {
        commandes.add(c);
        System.out.println("----Le commande passé avec succée----");
        
    }
     public Commande RechercherCommande(int NumC){
        for(Commande N : commandes){
            if(N.numcomm==NumC)
                return N;
            
        }
        return null;
        
    }
    @Override
    public void AnnulerCommande(int  numcomm) {
        Commande commande = new Commande();
        commande =RechercherCommande(numcomm);
        if (commande!=null){
            
                    clients.remove(commande);
                    System.out.println("----Annulation de commande avec succès----");
                    
                    
                }
                else{
                    System.out.println("----Annulation impossible: Commande non existant----");
                    
                }  
            }
     public void AfficherCommande(){
        for(Commande a:commandes){
          a.Affiche(a);
        }
    }
    public void Menu(){
        System.out.println("1-Ajouter un article");
        System.out.println("2-Supprimer un article");
        System.out.println("3-Ajouter un client");
        System.out.println("4-Supprimer un client");
        System.out.println("5-Passer une commande");
        System.out.println("6-Annuler une commande");
        System.out.println("0-Quitter");
    }
    public static void main(String[] args){
        Commerciale comm = new Commerciale();
        Article article = new Article();
        Commande commande = new Commande();
        Scanner clavier = new Scanner (System.in);
        int choix=1;
        System.out.println("--------------------Gestion Commerciale------------------");
        comm.Menu();
        System.out.println(" Entrer votre choix( entre 0 et 9):");
        choix = clavier.nextInt();
         
        while(choix>=0){
            
            if(choix==0){
                
                    System.out.println("Au revoir !!");
                    break;
            }
            else if(choix==1){
                    System.out.println("Saisie le Reference :"); 
                    int reference = clavier.nextInt();
                    System.out.println(" Saisie la Designation :");
                    String designation = clavier.next();
                    System.out.println(" Saisie le prix unitaire :");
                    double prixunitaire = clavier.nextDouble();
                    System.out.println(" Saisie le quantite stock :");
                    int quantitestock = clavier.nextInt();
                    System.out.println("  ");
                    article = new Article(reference, designation, prixunitaire, quantitestock );
                    comm.AjouterArticle(article);
                   System.out.println("\n----------Voici les articles avant le suppression----------");
                   System.out.println("\nListes de articles: ");
                   comm.AfficherArticle();
                   System.out.println("  ");
                   comm.Menu();
                }
            else if(choix==2){
                
                    System.out.println("Taper le réference de l'article à supprimer : "); 
                    int ref = clavier.nextInt();
                    
                    comm.SupprimerArticle(ref);
                    System.out.println("\n----------Voici les articles après la suppression---------- ");
                    System.out.println("\nListes de articles: ");
                    comm.AfficherArticle();
                    System.out.println("   ");
                    
            }
                else if(choix==3){
                    System.out.println(" Saisie l'ident de client : "); 
                    int ident = clavier.nextInt();
                    System.out.println(" Saisie le nom social de client : ");
                    String nomsocial = clavier.next();
                    System.out.println(" Saisie l'adresse de client : ");
                    String adresse = clavier.next();
                    System.out.println(" Saisie le chiffre affaire de client : ");
                    double chiffreaffaire = clavier.nextDouble();
                    System.out.println("  ");
                    Client client = new Client(ident, nomsocial, adresse, chiffreaffaire);
                    comm.AjouterClient(client);
                    System.out.println("\n---------- Voici Les clients avants la suppression----------  ");
                    System.out.println("\nListe de clients: ");
                    comm.AfficherClient();
                    System.out.println("   ");
                     comm.Menu();
               }
               else if(choix==4){
                   System.out.println("Taper l'identifiant de client à supprimer : "); 
                    int identif = clavier.nextInt();
                    
                    comm.SupprimerClient(identif);   
                    System.out.println("\n----------Voici les articles après la suppression---------- ");
                    System.out.println("\nListe de clients: ");
                    comm.AfficherClient();
                    System.out.println(" ");
                }
                else if(choix==5){
                  
                    System.out.println("Saisie le numero du commande : ");
                    int numcom =clavier.nextInt();
                    System.out.println("Saisie la date de commande : ");
                    String date = clavier.toString();
                    Date dt = new Date();
                    System.out.println("Saisie l'identifiant de client : ");
                    int ID = clavier.nextInt();
                    Client c1= new Client();
                    //RechercherClient(ref);
                    commande = new Commande(numcom,dt,c1);
                    comm.PasserCommande(commande);
                    System.out.println("\n----------Voici les commandes avant la suppression----------");
                    System.out.println("\nListe de commandes: ");
                    comm.AfficherCommande();
                    System.out.println("  ");
                    comm.Menu();
                    
                }
                else if(choix==6){
                      System.out.println("Taper le numéro du commande à Annuler : "); 
                    int NumCom = clavier.nextInt();
                    
                    comm.AnnulerCommande(NumCom);   
                    System.out.println("\n----------Voici les commandes après la suppression---------- "); 
                    System.out.println("\nListe de commandes: ");
                    comm.AfficherCommande();
                    System.out.println("  ");
                }
              
            System.out.println(" Entrer votre choix( entre 0 et 9):");
            choix = clavier.nextInt();
             
           
        }
  }
}


