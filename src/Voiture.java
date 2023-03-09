public class Voiture {
    short nbPortes = 5;
    String couleur;
    //un booleen par défaut est à false
    boolean automatic;
    int rapportCourant;
    int vitesse;

    //klaxonner est une méthode propre à Voiture - on pourra l'appeler
    void klaxonner(){
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
    void tourner(boolean droite, int angle){
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
}
