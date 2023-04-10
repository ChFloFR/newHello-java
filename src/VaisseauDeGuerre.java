public class VaisseauDeGuerre extends Vaisseau {
    void attaque(Vaisseau type, String Y, int t){
        System.out.println("Un vaisseau de type" + type + " attaque un vaisseau de "
                + Y + " en utilisant l'arme Z pendant "+ t + " minutes");
    }
}
