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
    }}

