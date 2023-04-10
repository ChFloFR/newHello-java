public class VaisseauDeGuerre extends Vaisseau {
    void attaque(Vaisseau vaisseauAttaque, String armeUtilisee, int dureeAttaque){
        System.out.println("Un vaisseau de type" + type + " attaque un vaisseau de " + vaisseauAttaque.type + " en utilisant l'arme "+armeUtilisee+" pendant "+ dureeAttaque + " minutes");
        vaisseauAttaque.resistanceDuBouclier=0;
        vaisseauAttaque.blindage= vaisseauAttaque.blindage/2;
    }
}
