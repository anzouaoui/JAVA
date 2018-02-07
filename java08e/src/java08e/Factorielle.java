package java08e;

public class Factorielle {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Il faut saisir un entier en argument");
		} else {
			int entier = Integer.parseInt(args[0]);
			int factorielle = 1;
			for (int i=1 ; i<=entier ; i++) {
				factorielle = factorielle * i; 
			}
			System.out.println("Factorielle de " + entier + ": " + factorielle);
		}
	}

}
