package no.hvl.dat100.lab6.matriser;

public class Matriser {

	public static void main(String[] args) {

		int[][] a = { {1,2,3}, {4,5,6}, {7,8,9} };

		skaler(2, a);
	}

	// a)
	public static void skrivUt(int[][] matrise) {

		//Looper gjennom med dobbel utvidet forløkke. 
		for (int[] indreTabell: matrise) {
			for (int tall: indreTabell) {
				System.out.println(tall);
			}
			System.out.println();


		}

	}

	// b)
	public static String tilStreng(int[][] matrise) {

		// Looper gjennom tabellen med utvidet for-løkke
		String matriseTekst = "";
		for (int[] indreTabell: matrise) {
			for (int tall: indreTabell) {
				//Legger på det nye tallet i matriseteksten 
				matriseTekst = matriseTekst + Integer.toString(tall) + " ";
			}
			//legger på \n etter hver av de indre tabellene. 
			matriseTekst = matriseTekst + ("\n");

		}
		return matriseTekst;

	}

	// c)
	public static int[][] skaler(int tall, int[][] matrise) {

		// Oppretter en ny matrise av samme størrelse 
		int[][] skalertMatrise = new int[matrise.length][matrise[0].length];
		
		// Looper gjennom matrisen og multipliserer
		for(int i = 0; i < matrise.length; i++) {
			
			for(int j = 0; j < matrise[i].length; j++) {

				skalertMatrise[i][j] = matrise[i][j] * tall;
			}
		}
		
		
		return skalertMatrise;

	}

	// d)
	public static boolean erLik(int[][] a, int[][] b) {

		//Sjekker først om de har lik lengde
		if(a.length != b.length) return false;
		
		
		//Looper gjennom matrisen
		for(int i = 0; i < a.length; i++) {
			
			for(int j = 0; j < a[i].length; j++) {

				//Dersom a er ulik b på en gitt indeks, er ikke matrisene like
				if(a[i][j] != b[i][j]){
					return false;
				}
			}
		}

		return true;
		
		
	}

	// e)
	public static int[][] speile(int[][] matrise) {

		// TODO
		throw new UnsupportedOperationException("speile ikke implementert");

	}

	// f)
	public static int[][] multipliser(int[][] a, int[][] b) {

		// TODO
		throw new UnsupportedOperationException("multipliser ikke implementert");

	}
}
