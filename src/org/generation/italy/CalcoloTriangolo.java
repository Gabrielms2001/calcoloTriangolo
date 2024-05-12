package org.generation.italy;

public class CalcoloTriangolo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stabilire le lunghezze dei lati
		int lato1 = 7;
		int lato2 = 3;
		int lato3 = 4;

		// Verificare che i lati siano maggiori di 0, altrimenti il triangolo non esiste
		if (lato1 <= 0 || lato2 <= 0 || lato3 <= 0) {
			System.out.println("Il triangolo non esiste.");
		} else {
			// Verificare la tipologia di triangolo
			if (lato1 == lato2 && lato2 == lato3) {
				System.out.println("Il triangolo è equilatero.");
			} else if (lato1 == lato2 || lato1 == lato3 || lato2 == lato3) {
				System.out.println("Il triangolo è isoscele.");
			} else {
				System.out.println("Il triangolo è scaleno.");
			}
		}
	}
}