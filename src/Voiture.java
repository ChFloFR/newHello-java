public class Voiture {
    short nbPortes = 5;
    String couleur;
    //un booleen par défaut est à false
    boolean automatic;
    int rapportCourant;
    int vitesse;
    Moteur moteur;
    static int nbRoues=4;


    //constructeur par défaut (permet d'abord d'utiliser "new" dans le main par exemple

    Voiture(){
        System.out.println("une voiture est construite sans paramètre");
        System.out.println("Une voiture est en cours de construction");

    }

    //ATTENTION SI UN CONSTRUCTEUR AVEC PARAMETRE EST EN PREMIER, LE CONSTRUCTEUR SANS PARAMETRE NE POURRA FONCTIONNER
    //constructeur avec parametre couleur
    Voiture (String couleur){
        this.couleur=couleur;
        System.out.println("voiture construite avec un paramètre, la couleur");
    }

    //constructeur avec paramètre porte
    Voiture(short nbPortes){
        this.nbPortes=nbPortes;
        System.out.println("Une voiture est construite avec des portes");
    };
    //klaxonner est une méthode propre à Voiture - on pourra l'appeler
    static void klaxonner(){
        System.out.println("tutut'");
    }

    //accelérer est aussi une méthode mais typée (int)
    int accelerer(int vitesse){
        System.out.println("J'accélère");
        this.vitesse = this.vitesse+vitesse;
        return this.vitesse;
    }

    //nouvelle méthode typée avec paramètres
    int passerRapport(boolean augmenter){
        if(augmenter){
            rapportCourant++;
        }else{
            rapportCourant--;
        }
        return rapportCourant;
    }
    static void tourner(boolean droite, int angle){
        String droiteOuGauche=null;
        if (droite) {
            droiteOuGauche="droite";
        }else{
            droiteOuGauche="gauche";
        }
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de " +angle+ " degrés");
    }
    //ajout d'une surcharge sur la méthode tourner, permet de laisser le choix

    void tourner(String droiteOuGauche, int angle){
        System.out.println("La voiture va tourner à "+droiteOuGauche+" d'un angle de "+angle);
    }
    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("je transporte un passager qui s'appelle "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de "+villeDeDepart.nomVille);

        Ville villeDestination=new Ville();
        villeDestination.nomVille="Lille";
        return villeDestination;
    }
}
