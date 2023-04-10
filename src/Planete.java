public class Planete {

    String nom;
    String matiere;
    long diametre;
    int angle;
    int totalVisiteurs;
    Atmosphere atmosphere;
    Vaisseau vaisseauActuellementAccoste;
    static String forme="Sphérique";

    static int nbPlanetesDecouvertes = 0;

    Planete(String nom){
        this.nom=nom;
        nbPlanetesDecouvertes++;
    }

    public static void main(String... args) {


        Planete Mercure = new Planete("Mercure");
        Mercure.matiere = "tellurique";
        Mercure.diametre = 4880;
        System.out.println("La planète " + Mercure.nom + " est de type " + Mercure.matiere + " et possède un diamètre de " + Mercure.diametre + " kilomètres.");

        Planete Terre = new Planete("Terre");
        Terre.matiere = "tellurique";
        Terre.diametre = 12756;
        System.out.println("La planète " + Terre.nom + " est de type " + Terre.matiere + " et possède un diamètre de " + Terre.diametre + " kilomètres.");

        Planete Mars = new Planete("Mars");
        Mars.matiere = "tellurique";
        Mars.diametre = 6792;
        Mars.angle = -684;
        Mars.forme="";
        System.out.println("La planète " + Mars.nom + " est de type " + Mars.matiere + " et possède un diamètre de " + Mars.diametre + " kilomètres.");

        Planete venus = new Planete("Venus");
        venus.matiere = "tellurique";
        venus.diametre = 12100;
        venus.angle = 1250;
        System.out.println("La planète " + venus.nom + " est de type " + venus.matiere + " et possède un diamètre de " + venus.diametre + " kilomètres.");

        Planete Jupiter = new Planete("Jupiter");
        Jupiter.matiere = "gazeuse";
        Jupiter.diametre = 142984;
        System.out.println("La planète " + Jupiter.nom + " est de type " + Jupiter.matiere + " et possède un diamètre de " + Jupiter.diametre + " kilomètres.");

        Planete Saturne = new Planete("Saturne");
        Saturne.matiere = "gazeuse";
        Saturne.diametre = 120536;
        System.out.println("La planète " + Saturne.nom + " est de type " + Saturne.matiere + " et possède un diamètre de " + Saturne.diametre + " kilomètres.");

        Planete Uranus = new Planete("Uranus");
        Uranus.matiere = "gazeuse";
        Uranus.diametre = 51118;

        System.out.println("La planète " + Uranus.nom + " est de type " + Uranus.matiere + " et possède un diamètre de " + Uranus.diametre + " kilomètres.");

        Planete Neptune = new Planete("Neptune");
        Neptune.matiere = "gazeuse";
        Neptune.diametre = 49532;
        Neptune.angle = -3542;
        System.out.println("La planète " + Neptune.nom + " est de type " + Neptune.matiere + " et possède un diamètre de " + Neptune.diametre + " kilomètres.");

        Planete Pluton = new Planete("Pluton");
        Pluton.matiere = "gazeuse";
        Pluton.diametre = 2300;
        System.out.println("La planète " + Pluton.nom + " est de type " + Pluton.matiere + " et possède un diamètre de " + Pluton.diametre + " kilomètres.");


    }

    void revolution() {
        System.out.printf("Je suis la planète %s et je tourne autour de mon étoile", nom);
    }

    void rotation() {
        System.out.printf("Je suis la planète %s et je tourne sur moi-même", nom);
    }

    int revolution2(int angle) {
        return angle / 360;
    }

    int rotation2(int angle) {
        return angle / 360;
    }

    //code corrigé :
    int revolution(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne autour de mon étoile de " + degres + " degrés.");
        return degres / 360;
    }

    int rotation(int degres) {
        System.out.println("Je suis la planète " + nom + " et je tourne sur moi-même de " + degres + " degrés.");
        return degres / 360;
    }

    int totalPlaneteVisiteurs = 0;


    void accueillirVaisseau(int nbHumains) {
        totalVisiteurs = totalPlaneteVisiteurs + nbHumains;
        System.out.println(totalPlaneteVisiteurs);
    }

    void accueillirVaisseau(String typeVaisseau) {
        if (typeVaisseau.equals("CHASSEUR")) {
            totalVisiteurs = totalVisiteurs + 3;
        } else if (typeVaisseau.equals("FREGATE")) {
            totalVisiteurs = totalVisiteurs + 12;
        } else if (typeVaisseau.equals("CROISEUR")) {
            totalVisiteurs = totalVisiteurs + 50;

        }
    }

    // cette méthode fusionne les deux précédentes
    Vaisseau accueillYrVaisseau(Vaisseau vaisseau) {
        totalVisiteurs =totalVisiteurs+vaisseau.nbPassagers;
        if (vaisseauActuellementAccoste == null) {
            System.out.println("Aucun vaisseau ne s'en va");
        }
        else {
            System.out.println("Un vaisseau de type "+vaisseauActuellementAccoste.type+" doit s'en aller");
        }
        Vaisseau vaisseauPrecedent = vaisseauActuellementAccoste;
        vaisseauActuellementAccoste = vaisseau;
        return vaisseauPrecedent;
    }

    Vaisseau vaisseau(String typeVaisseau, int nbPassagers) {
        if (typeVaisseau.equals("CHASSEUR")) {
            nbPassagers = 3;
        } else if (typeVaisseau.equals("FREGATE")) {
            nbPassagers = 12;
        } else if (typeVaisseau.equals("CROISEUR")) {
            nbPassagers = 50;
        }
        return new Vaisseau();
    }
    //exercice expansion pour udemy
    static String expansion(double distance){
        if(distance < 14){
            return "Oh la la mais c'est super rapide !";
        } else{
            return "Je rêve ou c'est plus rapide que la lumière  ?";
        }
    }
}
