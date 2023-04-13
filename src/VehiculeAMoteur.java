
//ici on créé une class "Mère", on retire les propriétés vitesse et moteur de "Voiture" ainsi que les méthodes "accélerer" et "transporter" pour les attribuer à
//cette class VéhiculeAMoteur
public class VehiculeAMoteur {
    int vitesse;
    Moteur moteur;

    VehiculeAMoteur(){
        System.out.println("Un véhicule à moteur est contruit");
    }

    //le constructeur ci-dessous est celui appelé dans le fichier Voiture.java ligne 20
    VehiculeAMoteur(Moteur moteur){
        this.moteur=moteur;
        System.out.println("Une voiture est construite avec un moteur");
    }

    int accelerer(int vitesse){
        System.out.println("J'accélère");
        this.vitesse = this.vitesse+vitesse;
        return this.vitesse;
    }

    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("Le véhicule transporte un passager qui s'appelle "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de "+villeDeDepart.nomVille);

        Ville villeDestination=new Ville();
        villeDestination.nomVille="Lille";
        return villeDestination;
    }
}
