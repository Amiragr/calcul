package calcul;
import java.util.Scanner;
public class Test {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("Choisissez une opération :");
	            System.out.println("1. Addition");
	            System.out.println("2. Soustraction");
	            System.out.println("3. Multiplication");
	            System.out.println("4. Division");
	            System.out.println("5. Quitter");

	            int choix = scanner.nextInt();

	            if (choix == 5) {
	                System.out.println("Au revoir !");
	                break;
	            }

	            System.out.println("Entrez le premier nombre :");
	            double a = scanner.nextDouble();
	            System.out.println("Entrez le deuxième nombre :");
	            double b = scanner.nextDouble();

	            double resultat = 0;

	            try {
	                switch (choix) {
	                    case 1:
	                        resultat = Calculatrice.addition(a, b);
	                        break;
	                    case 2:
	                        resultat = Calculatrice.soustraction(a, b);
	                        break;
	                    case 3:
	                        resultat = Calculatrice.multiplication(a, b);
	                        break;
	                    case 4:
	                        resultat = Calculatrice.division(a, b);
	                        break;
	                    default:
	                        System.out.println("Choix invalide");
	                        continue;
	                }

	                System.out.println("Résultat : " + resultat);
	            } catch (IllegalArgumentException e) {
	                System.out.println("Erreur : " + e.getMessage());
	            }
	        }

	        scanner.close();
	    }
	}


