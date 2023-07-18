

import java.util.Scanner;

import javax.swing.JOptionPane;
public class Conversor {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double cantidadMonedaLocal, divisa,tasaCambio, miDouble;
		String monedaLocal, monedaCambio, prueba;
		
		System.out.println("Ingrese moneda a la que desea cambiar: ");
		monedaCambio = scan.nextLine();
		
		System.out.println("Ingrese moneda que desea cambiar: ");
		monedaLocal = scan.nextLine();
		
		System.out.println("Ingrese cantidad de moneda a cambiar: ");
		cantidadMonedaLocal = scan.nextDouble();
		
		
		
		System.out.println("Ingrese valor de 1 "+monedaCambio+ " en "+monedaLocal);
		tasaCambio = scan.nextDouble();
		
		divisa = cantidadMonedaLocal/tasaCambio;
		
		scan.close();
		
		System.out.println(cantidadMonedaLocal +" "+monedaLocal+" Equivale a "+divisa+" "+monedaCambio);
		
		prueba = JOptionPane.showInputDialog("Ingrese un valor");
		
		miDouble = Double.parseDouble(prueba);
		
		miDouble = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un valor Real"));
		
		JOptionPane.showMessageDialog(null,"miDouble es "+miDouble);
		
		String menu = (JOptionPane.showInputDialog(null, "elige una opcion","menu",
				 JOptionPane.PLAIN_MESSAGE,null,new Object[]
				 {"conversor moneda","temperatura"}, "menu").toString());
				 JOptionPane.showMessageDialog(null, "elegiste : " + menu + "menu");
		

	}

}
