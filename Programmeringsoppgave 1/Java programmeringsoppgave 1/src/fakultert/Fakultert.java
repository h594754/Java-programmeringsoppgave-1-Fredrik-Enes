package fakultert;

import javax.swing.JOptionPane;

public class Fakultert {

	public static void main(String[] args) {
		
		int fakultert = 1;
		
		String dialogboks = JOptionPane.showInputDialog("Hva vil du fakultere?");
		int y = Integer.parseInt(dialogboks);
		
		for(int i = y; i>0 ;i--) {
			fakultert = fakultert * i;
		}
		System.out.println(fakultert);

	}

}
