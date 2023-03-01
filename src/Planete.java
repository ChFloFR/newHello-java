public class Planete {

    String nom;
    String matiere;
    long diametre;


    public static void main(String... args) {


        Planete Mercure = new Planete();
        Mercure.nom = "Mercure";
        Mercure.matiere = "tellurique";
        Mercure.diametre = 4880;
        System.out.println("La planète " + Mercure.nom + " est de type " + Mercure.matiere + " et possède un diamètre de " + Mercure.diametre + " kilomètres.");

        Planete Terre = new Planete();
        Terre.nom = "Terre";
        Terre.matiere = "tellurique";
        Terre.diametre = 12756;
        System.out.println("La planète " + Terre.nom + " est de type " + Terre.matiere + " et possède un diamètre de " + Terre.diametre + " kilomètres.");

        Planete Mars = new Planete();
        Mars.nom = "Mars";
        Mars.matiere = "tellurique";
        Mars.diametre = 6792;
        System.out.println("La planète " + Mars.nom + " est de type " + Mars.matiere + " et possède un diamètre de " + Mars.diametre + " kilomètres.");

        Planete venus = new Planete();
        venus.nom = "Venus";
        venus.matiere = "tellurique";
        venus.diametre = 12100;
        System.out.println("La planète " + venus.nom + " est de type " + venus.matiere + " et possède un diamètre de " + venus.diametre + " kilomètres.");

        Planete Jupiter = new Planete();
        Jupiter.nom = "Jupiter";
        Jupiter.matiere = "gazeuse";
        Jupiter.diametre = 142984;
        System.out.println("La planète " + Jupiter.nom + " est de type " + Jupiter.matiere + " et possède un diamètre de " + Jupiter.diametre + " kilomètres.");

        Planete Saturne = new Planete();
        Saturne.nom = "Saturne";
        Saturne.matiere = "gazeuse";
        Saturne.diametre = 120536;
        System.out.println("La planète " + Saturne.nom + " est de type " + Saturne.matiere + " et possède un diamètre de " + Saturne.diametre + " kilomètres.");

        Planete Uranus = new Planete();
        Uranus.nom = "Uranus";
        Uranus.matiere = "gazeuse";
        Uranus.diametre = 51118;
        System.out.println("La planète " + Uranus.nom + " est de type " + Uranus.matiere + " et possède un diamètre de " + Uranus.diametre + " kilomètres.");

        Planete Neptune = new Planete();
        Neptune.nom = "Neptune";
        Neptune.matiere = "gazeuse";
        Neptune.diametre = 49532;
        System.out.println("La planète " + Neptune.nom + " est de type " + Neptune.matiere + " et possède un diamètre de " + Neptune.diametre + " kilomètres.");

        Planete Pluton = new Planete();
        Pluton.nom = "Pluton";
        Pluton.matiere = "gazeuse";
        Pluton.diametre = 2300;
        System.out.println("La planète " + Pluton.nom + " est de type " + Pluton.matiere + " et possède un diamètre de " + Pluton.diametre + " kilomètres.");


    }
    void revolution(){
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile", nom);
    }
    void rotation(){
        System.out.printf("Je suis la planète %s et je tourne sur moi-même", nom);
    }

    int revolution2(int angle){
        return angle/360;
    }
    int rotation2(int angle){
        return angle/360;
    }
}
