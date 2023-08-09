package View;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ImagenPanel extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Image imagen;
	
	@Override
	public void paint(Graphics g) {
		
	//imagen = new ImageIcon(getClass().getResource("scr\\images\\CapBrave.PNG")).getImage();
	imagen = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\Captura8.PNG").getImage();
	g.drawImage(imagen,getX(),getY(),getWidth(),getHeight(),this);
	setOpaque(false); 
	super.paint(g);
		
	}
	

}
