package convertidor;

import javax.swing.JOptionPane;

public class Menu {
	public static void main(String[] args) {
		
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opci�n de conversi�n", "Men�",
			     JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de Moneda", "Conversor de Temperatura"},          	
			     "Selecciona")).toString();
		System.out.println(opciones);
		
	}
}
