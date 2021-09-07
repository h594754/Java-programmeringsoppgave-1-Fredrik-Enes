package karakterskala;

import javax.swing.JOptionPane;

public class Karakterskala {

	public static void main(String[] args) {
		int i = 11;
		for (int n = 1; n <=10 ;n++) {
			i = i-1;
		
		String karakterboks = JOptionPane.showInputDialog("Hvilke poengsum fikk du?" + " Du har " + i + " forsøk igjen.");
		
		
			
		int karakter = Integer.parseInt(karakterboks);
		if (karakter >= 90 && karakter <=100) {
			System.out.println ("A");
			} else if (karakter >= 80 && karakter <=89) {
				System.out.println("B");
				
			} else if (karakter >= 60 && karakter <=79) {
				System.out.println("C");
				
			} else if (karakter >= 50 && karakter <=59) {
				System.out.println("D");
				
			} else if (karakter >= 40 && karakter <=49) {
				System.out.println("E");
				
			} else if (karakter >= 39 && karakter <=0) {
				System.out.println("F");
				
			} 
			
			else {
				System.out.println("Ugyldig verdi");
			} 
		}

	}

}
