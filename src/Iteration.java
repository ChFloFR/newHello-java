public class Iteration {
    public static void main(String...args){

        //dans les () du for jusqu'à 3 informations séparées par des ;
        // A gauche, instruction à effectuer au démarrage, celle du milieu(tant qu'elle est vraie) fait fonctionner la boucle,
        // à droite: une ou plusieurs instructions qui doivent être faites à chaque fois
        //for( ; ; ){
        //    System.out.println();
        //}
    }
    public class HelloUniverse {
        public static void main(String... args) {
            //on peut utiliser while, avec 1 seul paramètre du coup
            for(int nbPlanetes=7 ; nbPlanetes<10; nbPlanetes++){
                switch (nbPlanetes) {

                    case 7:
                        System.out.println(" On sait qu'au 16ème siècle, seules 7 planètes avaient été découvertes.");
                        break;
                    case 8:
                        System.out.println(" On sait que le nombre de planètes est passé de 7 à 8 au 17ème siècle, mais il a également été réduit de 9 à 8 en 2006.");
                        break;
                    case 9:
                        System.out.println(" On sait que le nombre de planètes est passé de 8 à 9 au 18ème siècle et ce jusqu'en 2006, où ce nombre a été réduit à 8.");
                        break;
                    default:
                        System.out.printf(" Le programme ne peut pas fournir de résultat pour %d",nbPlanetes);
                }
            }
        }
    }
}
