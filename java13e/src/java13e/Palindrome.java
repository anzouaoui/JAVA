package java13e;

public class Palindrome {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Il faut un mot en argument");
		} else {
			String mot = args[0];
			StringBuffer sb = new StringBuffer(mot);
			if(mot.equals(sb.reverse().toString())) {
				System.out.println(mot + " est un palindrome");
			} else {
				System.out.println(mot + " n'est pas un palindrome");
			}
		}

	}

}
