package tempsCuisson;

import java.util.Scanner;

public class tempsCuisson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------- Temps de Cuisson du boeuf ou du porc -------");

		char r = ' ';
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Choisissez votre viande :");
			System.out.println("1- boeuf ");
			System.out.println("2- porc ");
			int i = sc.nextInt();

			if (i == 1) {

				System.out.println("Choisissez votre cuisson :");
				System.out.println("1- Bleu ");
				System.out.println("2- A point ");
				System.out.println("3- Bien cuit ");
				int color = sc.nextInt();

				switch (color) {
				case 1:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner poids = new Scanner(System.in);
					int grammes = poids.nextInt();
					if (grammes > 0)
						System.out.println("Temps de cuisson du boeuf bleu : " + ((grammes * 60) / 50)
								+ " secondes soit " + (((grammes * 60) / 50) / 60) + " minutes.");
					break;

				case 2:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner poid = new Scanner(System.in);
					int gramme = poid.nextInt();
					if (gramme > 0)
						System.out.println("Temps de cuisson du boeuf à point : " + ((gramme * 102) / 50)
								+ " secondes soit " + (((gramme * 102) / 50) / 60) + " minutes.");
					break;

				case 3:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner pds = new Scanner(System.in);
					int gr = pds.nextInt();
					if (gr > 0)
						System.out.println("Temps de cuisson du boeuf bien cuit : " + ((gr * 150) / 50)
								+ " secondes soit " + (((gr * 150) / 50) / 60) + " minutes.");
					break;

				default:
					System.out.println("ERROR!!!");

				}

			} else if (i == 2) {

				System.out.println("Choisissez votre cuisson :");
				System.out.println("1- Bleu ");
				System.out.println("2- A point ");
				System.out.println("3- Bien cuit ");
				int color = sc.nextInt();

				switch (color) {
				case 1:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner poids = new Scanner(System.in);
					int grammes = poids.nextInt();
					if (grammes > 0)
						System.out.println("Temps de cuisson du porc bleu : " + ((grammes * (15 * 60)) / 400)
								+ " secondes soit " + (((grammes * (15 * 60)) / 400) / 60) + " minutes.");
					break;

				case 2:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner poid = new Scanner(System.in);
					int gramme = poid.nextInt();
					if (gramme > 0)
						System.out.println("Temps de cuisson du porc à point : " + ((gramme * (25 * 60)) / 400)
								+ " secondes soit " + (((gramme * (25 * 60)) / 400) / 60) + " minutes.");
					break;

				case 3:
					System.out.println("Entrez le poids de votre viande : ");
					Scanner pds = new Scanner(System.in);
					int gr = pds.nextInt();
					if (gr > 0)
						System.out.println("Temps de cuisson du porc bien cuit : " + ((gr * (40 * 60)) / 400)
								+ " secondes soit " + (((gr * (40 * 60)) / 400) / 60) + " minutes.");
					break;

				default:
					System.out.println("ERROR!!!");

				}

			}

			System.out.println("Souhaitez-vous voir un autre temps de cuisson ? O/N ");
			Scanner rep = new Scanner(System.in);
			r = rep.nextLine().charAt(0);
		} while (r == 'O' || r == 'o');

		System.out.println("Merci d'avoir utilisé mon application !");
	}
}
