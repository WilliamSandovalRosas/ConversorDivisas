package View;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import java.awt.List;
import java.awt.Toolkit;
import java.util.Hashtable;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EmptyBorder;
import java.awt.Cursor;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.text.DecimalFormat;

import javax.swing.border.TitledBorder;


//public class GuiConversor extends JFrame implements ItemListener, FocusListener{
public class GuiConversor extends JFrame implements FocusListener{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtCantidad;
	private JTextField textCambio;
	//private JTextArea txtAreaResultado;
	Hashtable<Object, ImageIcon> myDivisas;
	int width=40;
	int heigth=40;
	ComboBoxRender myComboBox;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GuiConversor frame = new GuiConversor();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

//Create the frame
	
	
	/**
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked", "deprecation" })
	public GuiConversor() {
		
		JTextArea txtAreaResultado = new JTextArea("\t\r\n132.358,65 Dólares canadienses");
		ImageIcon col,mex,bra,pan,suiza,EU,UE;
		
		setFont(new Font("Roboto Black", Font.PLAIN, 14));
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\col.png"));
		setFont(new Font("Roboto Black", Font.PLAIN, 18));
		setTitle("AluraONE 5 William Sandoval Rosas");
		setForeground(new Color(0,0,102));
		setBackground(new Color(99, 210, 45));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 140, 1170, 500);
		getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setToolTipText("");
		panel.setForeground(new Color(204, 204, 204));
		panel.setBounds(0, 0, 1160, 461);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setToolTipText("");
		panel_1.setBackground(new Color(0, 0, 102));
		panel_1.setBounds(0, 0, 1156, 37);
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblConversorDeMoneda = new JLabel("Conversor de moneda");
		lblConversorDeMoneda.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblConversorDeMoneda.setForeground(new Color(255, 255, 255));
		lblConversorDeMoneda.setBackground(new Color(0, 0, 102));
		panel_1.add(lblConversorDeMoneda);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(20, 66, 1103, 109);
		panel.add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Importe");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel.setBounds(96, 11, 180, 35);
		panel_2.add(lblNewLabel);
		
		JLabel lblMoneda = new JLabel("Moneda");
		lblMoneda.setHorizontalAlignment(SwingConstants.CENTER);
		lblMoneda.setForeground(new Color(0, 0, 102));
		lblMoneda.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblMoneda.setBounds(353, 11, 180, 35);
		panel_2.add(lblMoneda);
		
		JLabel lblNewLabel_1_2 = new JLabel("Tasa de Cambio");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(0, 0, 102));
		lblNewLabel_1_2.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel_1_2.setBounds(604, 11, 180, 35);
		panel_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_1 = new JLabel("Divisa");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1_1.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(861, 11, 180, 35);
		panel_2.add(lblNewLabel_1_1);
		
		txtCantidad = new JTextField();
		txtCantidad.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				char key = e.getKeyChar();
				if((key<'0'||key>'9') && (key<'.'||key>'.')) e.consume();
			}
		});
		
		txtCantidad.setToolTipText("Ingrese la cantidad de dinero");
		txtCantidad.setBorder(null);
		txtCantidad.setHorizontalAlignment(SwingConstants.CENTER);
		txtCantidad.setFont(new Font("Roboto Light", Font.BOLD, 15));
		txtCantidad.setForeground(new Color(204, 204, 204));
		txtCantidad.setText("Cantidad");
		txtCantidad.setBounds(96, 57, 180, 41);
		txtCantidad.setColumns(20);
		txtCantidad.addFocusListener(this);
		panel_2.add(txtCantidad);
		
		col  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\col.png");
		mex  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\Mex.png");
		bra  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\Br.png");
		pan  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\panama.png");
		suiza  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\suiza.png");
		EU  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\EU.png");
		UE  = new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\UE.png");
		
		
		/////////////////////////////////////////////////
		myComboBox = new ComboBoxRender();
		/*myDivisas = new Hashtable<>();Se puede llenar el combo box desde la clase o de esta manera
		myComboBox.myDivisas.put("COP", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\col.png"));
		myComboBox.myDivisas.put("MXN", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\Mex.png"));
		myComboBox.myDivisas.put("PEN", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\peru.png"));
		myComboBox.myDivisas.put("ARS", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\argentina.png"));
		myComboBox.myDivisas.put("BRL", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\Br.png"));
		myComboBox.myDivisas.put("USD", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\EU.png"));
		myComboBox.myDivisas.put("CAD", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\canada.png"));
		myComboBox.myDivisas.put("UE", new ImageIcon(System.getProperty("user.dir")+"\\src\\images\\reducidas\\UE.png"));
	
		 * 
		 */
		
		
		//myComboBox.setForeground("blue");
		//JComboBox comboBox = new JComboBox<ImageIcon>();//<ImageIcon> se agrega en caso de agregar un arreglo de íconos
		JComboBox comboBox = new JComboBox();
		comboBox.setToolTipText("Ingrese tipo de moneda que desea cambiar");
		comboBox.setBackground(new Color(255, 255, 255));
		comboBox.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox.setBorder(new EmptyBorder(0, 0, 0, 0));
		//comboBox.setModel(new DefaultComboBoxModel(new ImageIcon[] {col,mex,bra,pan,suiza,EU,UE}));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"COP", "MXN", "PEN", "ARS", "BRL", "USD", "CAD", "UE"}));
		comboBox.setRenderer(myComboBox);
		comboBox.setFont(new Font("Roboto Light", Font.BOLD, 18));
		comboBox.setBounds(353, 57, 170, 41);
		panel_2.add(comboBox);
				
		
		
		textCambio = new JTextField();
		textCambio.setToolTipText("Ingrese valor de la tasa de cambio");
		textCambio.setBorder(null);
		textCambio.setBounds(600, 57, 180, 41);
		panel_2.add(textCambio);
		textCambio.setText("Tasa de Cambio");
		textCambio.setHorizontalAlignment(SwingConstants.CENTER);
		textCambio.setForeground(new Color(204, 204, 204));
		textCambio.setFont(new Font("Roboto Light", Font.BOLD, 15));
		textCambio.setColumns(10);
		textCambio.addFocusListener(this);
		textCambio.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(java.awt.event.KeyEvent e) {
				char key = e.getKeyChar();
				if((key<'0'||key>'9') && (key<'.'||key>'.')) e.consume();
			}
		});
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(860, 36, 229, 69);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		JPanel panel_4 = new JPanel();
		panel_4.setForeground(new Color(0, 0, 102));
		panel_4.setFont(new Font("Roboto Black", Font.PLAIN, 14));
		panel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		panel_4.setBounds(0, 0, 229, 69);
		panel_3.add(panel_4);
		panel_4.setLayout(null);
		
		//////////////////////////////////////////////////////////////////////
		
		
		
		
		/////////////////////////////////////////////////////////////////////////
		
		
		JComboBox comboBox_1 = new JComboBox();//La opción setEditable debe ser false para que aparezca el ícono y el país (string)
		comboBox_1.setToolTipText("Ingrese moneda a la que desea cambiar");
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					txtAreaResultado.getText();
					double num1 = Double.parseDouble(txtCantidad.getText());
					double num2 = Double.parseDouble(textCambio.getText());
					//https://programandoointentandolo.com/2017/11/limitar-numero-decimales-double-float-java.html
					DecimalFormat myformat = new DecimalFormat("#.#####");
					double divisa = num1/num2;
					
					txtAreaResultado.setText("\t\r\n132.358,65 Dólares canadienses");
					//JOptionPane.showMessageDialog(rootPane,contenido);
					txtAreaResultado.setText("\t\r\n"+myformat.format(divisa)+" "+comboBox_1.getSelectedItem());
					
				}
				catch (Exception e1) {
					// TODO: handle exception
					JOptionPane.showMessageDialog(rootPane, "Por favor ingrese los valores solicitados! "+e1);
				}		
			}
		});
		comboBox_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		comboBox_1.setBackground(new Color(255, 255, 255));
		comboBox_1.setForeground(new Color(0, 0, 102));
		comboBox_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		comboBox_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"COP", "MXN", "PEN", "ARS", "BRL", "USD", "CAD", "UE"}));
		comboBox_1.setRenderer(myComboBox);
		comboBox_1.setFont(new Font("Roboto Light", Font.BOLD, 18));
		comboBox_1.setBounds(6, 16, 170, 41);
		//comboBox_1.getSelectedItem();
		panel_4.add(comboBox_1);
		
		/*
		 *
		
		//comboBox.setModel(new DefaultComboBoxModel(new ImageIcon[] {col,mex,bra,pan,suiza,EU,UE}));
		
		
		
		 */
		
		
		
		List list = new List();
		list.setBounds(6, 16, 217, 47);
		//panel_4.add(list);
		list.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		list.setForeground(new Color(0, 0, 102));
		
		list.add("Colombia");
		list.add("EE.UU");
		list.add("Colombia");
		list.add("EE.UU");
		list.setBackground(new Color(255, 255, 255));
		list.setMultipleSelections(false);
		list.setFont(new Font("Roboto Medium", Font.PLAIN, 13));
		
		
		
		
		txtAreaResultado.setEditable(false);
		txtAreaResultado.setLineWrap(true);
		txtAreaResultado.setToolTipText("");
		txtAreaResultado.setForeground(new Color(0, 0, 102));
		txtAreaResultado.setFont(new Font("Roboto Black", Font.PLAIN, 28));
		//txtAreaResultado.setText("\t\r\n132.358,65 Dólares canadienses");
		txtAreaResultado.setBackground(new Color(240, 240, 240));
		txtAreaResultado.setBounds(20, 199, 602, 135);
		panel.add(txtAreaResultado);
		
		JTextArea txtrUsamosLaTasa = new JTextArea();
		txtrUsamosLaTasa.setEditable(false);
		txtrUsamosLaTasa.setWrapStyleWord(true);
		txtrUsamosLaTasa.setColumns(50);
		txtrUsamosLaTasa.setForeground(new Color(0, 0, 102));
		txtrUsamosLaTasa.setRows(3);
		txtrUsamosLaTasa.setFont(new Font("Roboto Light", Font.PLAIN, 11));
		txtrUsamosLaTasa.setText("Usamos la tasa del mercado medio para nuestro conversor. Esto solo tiene\r\nfines informativos. No recibirás esta tasa cuando envíes dinero.\r\nConsulta las tasas de envío.");
		txtrUsamosLaTasa.setBackground(UIManager.getColor("Button.background"));
		txtrUsamosLaTasa.setBounds(20, 346, 437, 80);
		panel.add(txtrUsamosLaTasa);
		
		JTextArea txtrVerCotizacinDe = new JTextArea();
		txtrVerCotizacinDe.setEditable(false);
		txtrVerCotizacinDe.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtrVerCotizacinDe.setForeground(new Color(0, 0, 102));
		txtrVerCotizacinDe.setText("Ver cotización de transferencia\r\nConversión de Dólar estadounidense a Dólar canadiense — Última actualización: 2 jul 2023, 3:35 UTC");
		txtrVerCotizacinDe.setBackground(UIManager.getColor("Button.background"));
		txtrVerCotizacinDe.setBounds(568, 391, 635, 37);
		panel.add(txtrVerCotizacinDe);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\Conversor.JPG"));
		lblNewLabel_1.setBounds(808, 167, 219, 178);
		panel.add(lblNewLabel_1);
		
		/*
		 * 	lblUsuario.setIcon(iconolbl);
			lblUsuario.setIconTextGap(1);
			lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
			lblUsuario.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
			lblUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
			lblUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
		 */
		
		JLabel lblCOP = new JLabel("COP");
		lblCOP.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\alemania(1).png"));
		//lblCOP.setBounds(647, 275, 144, 46);
		//panel.add(lblCOP);
		
		
				
		//col,mex,bra,pan,suiza,EU,UE
		
		
		/*
		 * JButton btnNewButton = new JButton("New button");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(rootPane, comboBox_1.getSelectedItem());
				txtCantidad.setText("");
	            txtCantidad.setText("Mi select"+comboBox_1.getSelectedItem());
			}
		});
		btnNewButton.setBounds(681, 283, 89, 23);
		panel.add(btnNewButton);
		JLabel jpBra= new JLabel();
		JLabel jpPan= new JLabel();
		JLabel jpSui= new JLabel();
		JLabel jpEU= new JLabel();
		JLabel jpUE= new JLabel();
		
		comboBox_1.setModel(new DefaultComboBoxModel(new JLabel[]{jpCol,jpMex,jpBra,jpPan,jpSui,jpEU,jpUE}));*/
		
		
		
	}
	


	/**
	 *@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(myComboBox)) {
			final String seleccionado = myComboBox.getText();
			
		}
	}
	 */
	

	@Override
	public void focusGained(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JTextField) {
			JTextField campo = (JTextField) e.getSource();
			campo.setBackground(Color.lightGray);
			campo.setText("");
			campo.setForeground(Color.BLUE);
		}
	}

	@Override
	public void focusLost(FocusEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() instanceof JTextField) {
			JTextField campo = (JTextField) e.getSource();
			campo.setBackground(Color.white);
		}
	}
	
}
