public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int age = 23;
        System.out.println(age);
        var anneeDenaissance = 1977;
        var javaEstFacile = true;
        String monTexte;
        monTexte = "Holà, coucou";
        System.out.println(monTexte);

        String phrase;
        phrase = "Aux dernières nouvelles, le nombre total de planètes dans le système solaire est de : ";
        System.out.println(phrase);
        int nbPlanetes = 8;
        System.out.println(nbPlanetes);
        phrase = "Il y a quelques années cependant, elles étaient au nombre de : ";
        System.out.println(phrase);
        nbPlanetes = 9;
        System.out.println(nbPlanetes);
        System.out.println("LES OPERATEURS ARITHMETIQUES");
        // OPERATEURS ARITHMETIQUES

        int resultat = 5 + 2;
        System.out.println(resultat);
        int division = 5 / 2;
        System.out.println(division);
        float divisionReelle = 5f / 2;
        System.out.println(divisionReelle);
        int resteModulo = 5 % 2;
        System.out.println(resteModulo);

        System.out.println("Opérations multiples");
        float multi = 5f / 2 + 3;
        System.out.println(multi);
        float multiBis = 5f / (2 + 3);
        System.out.println(multiBis);

        System.out.println("OPERATEURS RELATIONNELS");
        boolean estCeQueCestVrai = 20 < 30;
        System.out.println(estCeQueCestVrai);
        boolean un = 20 <= 30;
        System.out.println(estCeQueCestVrai);
        boolean deux = 20 != 30;
        System.out.println(estCeQueCestVrai);

        char char1 = 'c';
        char char2 = 'y';
        boolean compareChar = char1 == char2;
        System.out.println(compareChar);
        boolean superieurOuPas = char1 > char2;
        System.out.println(superieurOuPas);

        System.out.println("La concaténation");
        if (superieurOuPas != true) {
            String maChaine = "j'y suis depuis ";
            int heure = 2;

            System.out.printf("%s %d heures", maChaine, heure);
        }

        System.out.println("Le Débogage");
        int ageFlo = 44;
        System.out.printf("Mon âge est %d ans.", ageFlo);
        if (ageFlo > 30) {
            System.out.println(" On dit middle age ?");
        }
        int ageAutre = 20;

        if (ageAutre > 20 && ageFlo < 50) {
            System.out.println("l'autre age de l'exercice est " + ageAutre);
        } else {
            System.out.println("Le code ne permet pas d'afficher l'age autre pour une raison farfelue");
        }
        System.out.println("En ternaire :");
        System.out.println(ageAutre > 20 && ageFlo < 50 ? "l'autre age de l'exercice est " + ageAutre : "Le code ne permet pas d'afficher l'age autre pour une raison farfelue");

        System.out.println("Exercice Système Solaire");
        String phraseIntro = "En %d, les planètes du système solaire étaient au nombre de : %d";
        int nbPlanetesEx = 0;
        short annee = 2100;

        if (annee < 1600 || annee > 2020) {
            System.out.printf("Le programme ne peut pas fournir de résulat pour %d", annee);
        } else {
            if (annee < 1700) {

                nbPlanetesEx = 7;
            } else if (annee < 1800) {

                nbPlanetesEx = 8;
            } else if (annee < 2006) {
                nbPlanetesEx = 9;
            } else {
                nbPlanetesEx = 8;
            }

            System.out.printf(phraseIntro, annee, nbPlanetesEx);
        }
        Voiture voitureDeMichel = new Voiture();

        voitureDeMichel.couleur = "jaune";
        voitureDeMichel.nbPortes = 3;
        voitureDeMichel.automatic = true;
        //changement de couleur
        voitureDeMichel.couleur = "verte";

        System.out.println(voitureDeMichel.couleur);
        voitureDeMichel.klaxonner();

        //ici j'appelle une méthode qui retourne un résultat, je place ce dernier dans une variable typée
        // comme nécessaire -> la méthode est dans la class Voiture

        //int nouvelleVitesse= voitureDeMichel.accelerer();
        //System.out.println("Nouvelle vitesse de michel :"+nouvelleVitesse);

        int nouveauRapport = voitureDeMichel.passerRapport(true);
        System.out.println("Le nouveau rapport est : " + nouveauRapport);

        voitureDeMichel.passerRapport(true);
        System.out.println("Je suis en " + nouveauRapport + " vitesse");
        voitureDeMichel.passerRapport(true);
        System.out.println("Je suis en " + nouveauRapport + " vitesse");

        nouveauRapport = voitureDeMichel.passerRapport(false);
        System.out.println("Le dernier rapport enclenché est " + nouveauRapport);

        voitureDeMichel.tourner(false, 45);


        Planete neptune = new Planete("Neptune");
        neptune.nom = "Neptune";
        neptune.diametre = 49532;
        neptune.matiere = "Gazeuse";

        Planete mars = new Planete("Mars");
        mars.nom = "Mars";
        mars.matiere = "tellurique";
        mars.diametre = 6792;

        Planete venus = new Planete("Venus");
        venus.nom = "Venus";

        //appel de la méthode construite dans la class Planete
        neptune.revolution();
        mars.rotation();

        System.out.println("Neptune a effectué " + neptune.revolution2(-3542) + " tours autour de son étoile");
        System.out.println("Mars a effectué " + mars.rotation2(-684) + " tours sur elle-même");
        System.out.println("Venus a effectué " + venus.rotation2(1250) + " tours sur elle-même");

        Voiture voitureDeJerome = new Voiture();
        boolean egauxOuNon = voitureDeMichel == voitureDeJerome;
        System.out.println(egauxOuNon);

        String chaine1 = "le ciel bleu";
        String chaine2 = "le ciel bleu";
        boolean egauxOuPas = chaine1 == chaine2;
        System.out.println(egauxOuPas);
        System.out.println("Ici les deux chaines sont égales - contrairement aux deux objets voitureDeJerome et voitureDeMichel - car " +
                "nous n'avons pas instancié la chaine en appelant le mot clef new ...ceci est propre à la chaine de caractère. Ces deux chaines utilisent le même emplacement mémoire et sont donc égales, ");


        String chaine3 = new String("le ciel bleu");

        boolean egauxOuPas2 = chaine1 == chaine3;
        System.out.println(egauxOuPas2);
        System.out.println("le rendu est false car chaine3 est un objet instancié");
        System.out.println("méthode equals plutôt que ==  //equalsIgnoreCase est une méthode pour ignorer la case");

        boolean egauxAvecEquals = chaine1.equals(chaine2);
        System.out.println(egauxAvecEquals);

        //exercice planète

        mars.accueillirVaisseau(8);
        mars.accueillirVaisseau("FREGATE");
        System.out.println("Le nombre d'êtres humains ayant déjà séjourné sur mars est de " + mars.totalVisiteurs);

        // mot clef "this"
        System.out.println("Usage du mot clé this");
        System.out.println("si le paramètre reçu dans la méthode a le même nom que la propriété que l'objet que l'on manipule, c'est le paramètre de la méthode qui a la priorité");
        System.out.println("int accelerer(int vitesse)" +
                "this.vitesse=this.vitesse+vitesse;" +
                "this.vitesse" +
                "ICI this.vitesse est la propriété de l'objet courant(voitureDeMichel ");
        int nouvelleVitesse = voitureDeMichel.accelerer(50);
        System.out.println("La nouvelle vitesse est de " + nouvelleVitesse);

        Voiture voitureDeRoger = new Voiture();
        Moteur moteur = new Moteur();
        moteur.carburation = "Diesel";
        moteur.nbCylindres = 6;
        voitureDeRoger.moteur = moteur;

        System.out.println("le nombre de cylindres de la voiture de Roger est " + voitureDeRoger.moteur.nbCylindres);

        voitureDeMichel.moteur = moteur;
        System.out.println("le moteur de  Roger et Michel sont le même = c'est la référence (son emplacement en mémoire dit copie par référence) du moteur créé :" + voitureDeMichel.moteur);
        System.out.println(voitureDeRoger.moteur);

        moteur.nbCylindres = 8;
        System.out.println("Ici, le nbCylindre a été changé et comme la référence moteur est identique pour les deux voitures, alors elles ont toutes deux 8 cylindres");
        System.out.println(voitureDeRoger.moteur.nbCylindres);
        System.out.println(voitureDeMichel.moteur.nbCylindres);

        Planete Uranus = new Planete("Uranus");

        Atmosphere atmosphereUranus = new Atmosphere();
        atmosphereUranus.txHydrogene = 83;
        atmosphereUranus.txHelium = 15;
        atmosphereUranus.txMethane = 2.5F;

        Uranus.atmosphere = atmosphereUranus;

        System.out.println("L'atmosphère d'Uranus est composée de ");
        System.out.println("A" + atmosphereUranus.txHydrogene + " % d'hydrogene");
        System.out.println("A" + atmosphereUranus.txArgon + " % d'argon");
        System.out.println("A" + atmosphereUranus.txAzote + " % d'azote");
        System.out.println("A" + atmosphereUranus.txCO2 + " % d'dioxyde de carbone");
        System.out.println("A" + atmosphereUranus.txHelium + " % d'helium");
        System.out.println("A" + atmosphereUranus.txSodium + " % d'sodium");



        Passager passager=new Passager();
        passager.nom="Dupont";
        passager.prenom="Antoine";

        Ville toulouse=new Ville();
        toulouse.nomVille="Toulouse";
        Ville destination=voitureDeMichel.transporter(passager, toulouse);
        System.out.println("L'illustre passager est arrivé à "+destination.nomVille);

        //Vaisseau vaisseau = new Vaisseau();
        Vaisseau nouveauVaisseau=new Vaisseau();
        nouveauVaisseau.type="Fregate";
        nouveauVaisseau.nbPassagers=9;
        mars.accueillYrVaisseau(nouveauVaisseau);

        Vaisseau autreVaisseau=new Vaisseau();
        autreVaisseau.type="Croiseur";
        autreVaisseau.nbPassagers=42;

        mars.accueillYrVaisseau(autreVaisseau);

        System.out.println("Le nombre total d'humains ayant séjourné sur Mars est actuellement de "+mars.totalVisiteurs);

        //je peux redéfinir ici une propriété qui s'appliquera à toutes les instances :
        //Voiture.nbRoues=5;

        System.out.println("Le nombre de roues de la voiture de Michel est "+voitureDeMichel.nbRoues);
        System.out.println("Il paraît qu'en général, une voiture a "+Voiture.nbRoues);

        System.out.println("La forme de la planète Mars est "+mars.forme);
        System.out.println("La forme d'une planète est "+Planete.forme);

        //retour cours - voiture -> méthode static
        Voiture.klaxonner();
        Voiture.tourner(true, 45);
        //ceci une méthode déclarée static ne peut avoir accès aux attributs d'instance mais peut avoir aux propriétés static.
        //la méthode rapport ne pourrait donc être static

        //exercice expansion pour udemy
        System.out.println(Planete.expansion(10.5));
        System.out.println(Planete.expansion(14.2));

        System.out.println(Planete.nbPlanetesDecouvertes);

        System.out.println(voitureDeMichel.couleur);

        VaisseauDeGuerre chasseur= new VaisseauDeGuerre();
        chasseur.blindage=156;
        chasseur.resistanceDuBouclier=2;
        chasseur.type="CHASSEUR";

        VaisseauCivil VaisseauMonde= new VaisseauCivil();
        VaisseauMonde.blindage=4784;
        VaisseauMonde.resistanceDuBouclier=30;
        VaisseauMonde.type="VAISSEAU-MONDE";
        VaisseauMonde.activerBouclier();
        chasseur.activerBouclier();

        chasseur.attaque(VaisseauMonde, "laser photonique", 3 );
        VaisseauMonde.desactiverBouclier();
        System.out.println("La résistance du bouclier du VaisseauMonde est de "+VaisseauMonde.resistanceDuBouclier);
        System.out.println("Le blindage VM est" + VaisseauMonde.blindage);
    }

}