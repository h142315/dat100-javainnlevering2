package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

	// a)
	public static void skrivUt(int[] tabell) {

		for(int i = 0; i < tabell.length; i++){
			System.out.println(tabell[i]);


		}
		System.out.println();

	}

	// b)
	public static String tilStreng(int[] tabell) {

		String txt = "[";

		for(int i = 0; i < tabell.length; i++){

			if(i == (tabell.length-1)) {
				txt = txt + Integer.toString(tabell[i]);
			}
			else {
				txt = txt + Integer.toString(tabell[i]) + ",";
			}

		}

		txt = txt + "]";
		System.out.println(txt);
		return txt;
	}

	// c)
	public static int summer(int[] tabell) {

		int sum = 0; 

		//Med vanlig for-løkke
		/*for(int i = 0; i < tabell.length; i++){
			sum = sum + tabell[i];
		}*/


		//med while-løkke 
		/*
		int i = 0;
		while(i < tabell.length){
			sum = sum + tabell[i];
			i++;
		}*/

		//med utvidet for-løkke
		for (int tall: tabell) {
			sum = sum + tall;
		}

		return sum;
	}

	// d)
	public static boolean finnesTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++){
			if(tall == tabell[i]){
				return true; 
			}
		}
		return false; 
	}

	// e)
	public static int posisjonTall(int[] tabell, int tall) {

		for(int i = 0; i < tabell.length; i++){
			if(tall == tabell[i]){
				return i; 
			}
		}
		return -1;

	}

	// f)
	public static int[] reverser(int[] tabell) {

		for(int i = 0; i < tabell.length / 2; i++)
		{
			int temp = tabell[i];
			tabell[i] = tabell[tabell.length - i - 1];
			tabell[tabell.length - i - 1] = temp;
		}
		return tabell; 
	}

	// g)
	public static boolean erSortert(int[] tabell) {

		for(int i = 0; i < tabell.length-1; i++){
			if(tabell[i] > tabell[i+1]){
				return false; 
			}
		}
		return true;
	}

	// h)
	public static int[] settSammen(int[] tabell1, int[] tabell2) {

		int[]samletTabell = new int[tabell1.length+tabell2.length];
		int count = 0;

		for(int i = 0; i < tabell1.length; i++) { 
			samletTabell[i] = tabell1[i];
			count++;
		} 

		for(int j = 0; j < tabell2.length;j++) { 
			samletTabell[count++] = tabell2[j];
		} 
		
		return samletTabell;
	}
}
