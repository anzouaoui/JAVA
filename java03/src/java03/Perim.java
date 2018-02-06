package java03;

public class Perim {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Il faut fournir le rayon en argument");
		} else {
			double rayon = Double.parseDouble(args[0]);
			double perim = rayon * 3.14d;
			System.out.println("Périmètre d'un cercle de rayon " + rayon + ": " + perim);
		}
	}

}
