package trinnskatt;

import javax.swing.JOptionPane;

public class Trinnskatt {

	
	public static void main(String[] args) {
		String dialogboks = JOptionPane.showInputDialog("Hva er bruttoinntekten din?");
		
		
		int bint = Integer.parseInt(dialogboks);
		if (bint >= 0 && bint <= 164100) {
			System.out.println("Ingen trinnskatt");
		} else if (bint>= 164101 && bint <= 230950) {
			System.out.println("1,7% trinnskatt");
		
		} else if (bint >= 230951 && bint <= 580650) {
			System.out.println("4,0% trinnskatt");
			
		} else if (bint >= 580651 && bint <= 934050) {
			System.out.println("13,2% trinnskatt"); 
		} else {
			System.out.println("14,52% trinnskatt");
		}

	}

}
