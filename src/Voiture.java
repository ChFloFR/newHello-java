public class Voiture extends VehiculeAMoteur{
    //avec extends, Voiture récupère les propriétés et méthodes de VéhiculeAMoteur
//par convention, on range les attributs static d'abord
    static int nbRoues=4;

    //puis les attributs d'instance
    short nbPortes = 5;
    String couleur;
    //un booleen par défaut est à false
    boolean automatic;
    int rapportCourant;

    short nbSieges=4;
    short volumeCoffre;


//par convention on range ensuite les constructeurs par nombre de paramètre

    //constructeur par défaut (permet d'abord d'utiliser "new" dans le main par exemple
    Voiture(Moteur moteur){
        super(moteur);
    }

    Voiture(){
        System.out.println("une voiture est construite sans paramètre");
        System.out.println("Une voiture est en cours de construction");
    }

    //ATTENTION SI UN CONSTRUCTEUR AVEC PARAMETRE EST EN PREMIER, LE CONSTRUCTEUR SANS PARAMETRE NE POURRA FONCTIONNER
    //constructeur avec paramètre couleur

    //Voiture (String couleur){
    //    this.couleur=couleur;
    //    System.out.println("voiture construite avec un paramètre, la couleur");
    //}

    //constructeur avec paramètre porte
    //Voiture(short nbPortes){
    //    this.nbPortes=nbPortes;
    //    System.out.println("Une voiture est construite avec des portes");
    //}

    // On ne peut avoir 2 constructeurs avec la même nature de paramètre (string, int etc)
    // Par contre on peut avoir des constructeurs de plusieurs paramètres
    // mais aussi un type comlexe comme une class - ici le moteur


    //Voiture(String couleur, short nbSieges, short volumeCoffre, Moteur moteur){
    //    this.couleur=couleur;
    //    this.nbSieges=nbSieges;
    //    this.volumeCoffre=volumeCoffre;
    //    this.moteur=moteur;
    //   System.out.println("Contructeur avec 4 paramètres : la couleur, le nombre de sièges et le volume du coffre et son moteur");
    //}

    //par convention, on range les méthodes en dernier
    //klaxonner est une méthode propre à Voiture - on pourra l'appeler
    static void klaxonner(){
        System.out.println("tutut'");
    }

    //accelérer est aussi une méthode mais typée (int)


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
// ci-dessous, la méthode transporter de VéhiculeAMoteur (class mère)ne me convient pas totalement
//donc je la reproduis ici avec ce qui me convient mieux (ici, juste changé véhicule pour voiture")
    Ville transporter(Passager passager, Ville villeDeDepart){
        System.out.println("La voiture transporte un passager qui s'appelle "+passager.prenom+" "+passager.nom);
        System.out.println("Le passager est parti de "+villeDeDepart.nomVille);

        Ville villeDestination=new Ville();
        villeDestination.nomVille="Lille";
        return villeDestination;
    }
}
