package java14e;

public class Majus {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Il faut une chaine de caractère en argument");
		} else {
			StringBuffer chaine = new StringBuffer(args[0]);
			char premiereLettre = chaine.charAt(0);
			char majus = Character.toUpperCase(premiereLettre);
			chaine.setCharAt(0, majus);
			System.out.println(chaine);
		}
	}
}
