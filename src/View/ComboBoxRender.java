package View;

import java.awt.Color;
import java.awt.Component;
import java.util.EnumMap;
import java.util.Hashtable;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

public class ComboBoxRender extends JLabel implements ListCellRenderer{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Hashtable<Object, ImageIcon> myDivisas=null;
	
	//ImageIcon defaultImage = new ImageIcon(this.getClass().getResource("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\monedas3.png"));
	
	ImageIcon defaultImage = new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\monedas3.png");

	public ComboBoxRender(){
		//super();			COP,MEX,PER,ARG,BRA,EU;
												
		myDivisas = new Hashtable<Object, ImageIcon>();
		myDivisas.put("COP", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\col.png"));
		myDivisas.put("MXN", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\Mex.png"));
		myDivisas.put("PEN", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\peru.png"));
		myDivisas.put("ARS", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\argentina.png"));
		myDivisas.put("BRL", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\Br.png"));
		myDivisas.put("USD", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\EU.png"));
		myDivisas.put("CAD", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\canada.png"));
		myDivisas.put("UE", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\UE.png"));
		
		//myDivisas.put("ARG", new ImageIcon(getClass().getResource("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\argentina.png")));
		//myDivisas.put("BRA", new ImageIcon(getClass().getResource("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\Br.png")));
		//myDivisas.put("EU", new ImageIcon(getClass().getResource("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\EU.png")));
	}

	

	@Override
	public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected,
			boolean cellHasFocus) {
		
		if(myDivisas.get(value)!=null) {
			setIcon(myDivisas.get(value));
			setText(value.toString());
			
			
			
		}
		else {
			setIcon(defaultImage);
		}
		
		//setText(value.toString());
		return this;
	}

}
