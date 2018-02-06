package java04e;

public class Signe {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Il faut fournir un entier en argument");
		} else {
			int i = Integer.parseInt(args[0]);
			if (i < 0 ) {
				System.out.println(i + " est un nombre négatif");
			} else if (i > 0) {
				System.out.println(i + " est un nombre positif");
			} else {
				System.out.println(i + " est nul");
			}
		}
	}
}
