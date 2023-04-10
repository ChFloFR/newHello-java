
//ici on créé une class "Mère", on retire les propriétés vitesse et moteur de "Voiture" ainsi que les méthodes "accélerer" et "transporter" pour les attribuer à
//cette class VéhiculeAMoteur
public class VehiculeAMoteur {
    int vitesse;
    Moteur moteur;

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
