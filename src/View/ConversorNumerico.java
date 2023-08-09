package View;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Toolkit;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Cursor;

public class ConversorNumerico extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNumberInput;
	private JTextField textBaseInput;
	private JTextField textResultado1;
	private JTextField textDecimalInput;
	private JTextField textField;
	private JTextField textHexadecimal;
	private JTextField textBinario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConversorNumerico frame = new ConversorNumerico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ConversorNumerico() {
		setFont(new Font("Roboto Black", Font.PLAIN, 14));
		setTitle("AluraONE 5 William Sandoval Rosas");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\col.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 140, 1170, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		JPanel panel1 = new JPanel();
		panel1.setBounds(0, 0, 1160, 461);
		contentPane.add(panel1);
		panel1.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(0, 0, 1156, 37);
		panel1.add(panel);
		panel.setLayout(null);
		
		JLabel lblConversorNumerico = new JLabel("Conversor Numérico");
		lblConversorNumerico.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblConversorNumerico.setForeground(new Color(255, 255, 255));
		lblConversorNumerico.setBounds(519, 0, 174, 37);
		panel.add(lblConversorNumerico);
		
		JPanel panel_toDecimal = new JPanel();
		panel_toDecimal.setBounds(0, 38, 578, 423);
		panel1.add(panel_toDecimal);
		panel_toDecimal.setLayout(null);
		
		JPanel panelSubtitle1 = new JPanel();
		panelSubtitle1.setForeground(new Color(255, 255, 255));
		panelSubtitle1.setBackground(new Color(0, 0, 102));
		panelSubtitle1.setBounds(10, 11, 558, 40);
		panel_toDecimal.add(panelSubtitle1);
		panelSubtitle1.setLayout(null);
		
		JLabel lbltoDecimal = new JLabel("Convertir a Sistema Decimal de sistema:");
		lbltoDecimal.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lbltoDecimal.setForeground(new Color(255, 255, 255));
		lbltoDecimal.setBounds(99, 0, 352, 40);
		panelSubtitle1.add(lbltoDecimal);
		
		JTextArea textDescription1 = new JTextArea();
		textDescription1.setBackground(new Color(240, 240, 240));
		textDescription1.setEditable(false);
		textDescription1.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		textDescription1.setBounds(43, 73, 501, 45);
		textDescription1.setText("Ingrese el valor deseado e indique la base de su sistema Numérico.\nEl resultado indicará su equivalencia en sistema decimal.");
		panel_toDecimal.add(textDescription1);
		
		JLabel lblNumberInput = new JLabel("Ingrese el número");
		lblNumberInput.setForeground(new Color(0, 0, 102));
		lblNumberInput.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lblNumberInput.setBounds(143, 168, 125, 29);
		panel_toDecimal.add(lblNumberInput);
		
		textNumberInput = new JTextField();
		textNumberInput.setBorder(null);
		textNumberInput.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textNumberInput.setBounds(278, 168, 165, 28);
		panel_toDecimal.add(textNumberInput);
		textNumberInput.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Ingrese la base");
		lblNewLabel.setForeground(new Color(0, 0, 102));
		lblNewLabel.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lblNewLabel.setBounds(143, 240, 125, 25);
		panel_toDecimal.add(lblNewLabel);
		
		textBaseInput = new JTextField();
		textBaseInput.setBorder(null);
		textBaseInput.setForeground(new Color(0, 0, 102));
		textBaseInput.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textBaseInput.setBounds(278, 234, 62, 29);
		panel_toDecimal.add(textBaseInput);
		textBaseInput.setColumns(10);
		
		textResultado1 = new JTextField();
		textResultado1.setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		textResultado1.setBorder(null);
		textResultado1.setBackground(new Color(240, 240, 240));
		textResultado1.setHorizontalAlignment(SwingConstants.LEFT);
		textResultado1.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textResultado1.setForeground(new Color(0, 0, 102));
		textResultado1.setText("Respuesta");
		textResultado1.setBounds(43, 306, 501, 54);
		panel_toDecimal.add(textResultado1);
		textResultado1.setColumns(10);
		
		JButton btnToDecimal = new JButton("Calculate");
		btnToDecimal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnToDecimal.setForeground(new Color(0, 0, 102));
		btnToDecimal.setBorder(null);
		btnToDecimal.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnToDecimal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnToDecimal.setBounds(354, 232, 89, 31);
		panel_toDecimal.add(btnToDecimal);
		
		JTextArea textCreditos = new JTextArea();
		textCreditos.setBackground(new Color(240, 240, 240));
		textCreditos.setForeground(new Color(0, 0, 153));
		textCreditos.setFont(new Font("Roboto Light", Font.PLAIN, 12));
		textCreditos.setText("By William Sandoval Rosas, Bogotá-Colombia.");
		textCreditos.setBounds(43, 372, 400, 22);
		panel_toDecimal.add(textCreditos);
		
		JPanel panel_fromDecimal = new JPanel();
		panel_fromDecimal.setBounds(578, 38, 572, 423);
		panel1.add(panel_fromDecimal);
		panel_fromDecimal.setLayout(null);
		
		JPanel panel_Subtitle2 = new JPanel();
		panel_Subtitle2.setBackground(new Color(0, 0, 102));
		panel_Subtitle2.setBounds(10, 11, 552, 40);
		panel_fromDecimal.add(panel_Subtitle2);
		panel_Subtitle2.setLayout(null);
		
		JLabel lblfromDecimal = new JLabel("Convertir de Sistema Decimal a:");
		lblfromDecimal.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblfromDecimal.setForeground(new Color(255, 255, 255));
		lblfromDecimal.setBounds(143, 0, 271, 38);
		panel_Subtitle2.add(lblfromDecimal);
		
		JTextArea textDescription2 = new JTextArea();
		textDescription2.setBackground(new Color(240, 240, 240));
		textDescription2.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		textDescription2.setBounds(63, 67, 451, 38);
		textDescription2.setText("Ingrese un número en base 10, el sistema mostrará su equivalencia en\nbase 2, 5 , 8,... 16, según indique.");
		panel_fromDecimal.add(textDescription2);
		
		JLabel lblInputDecimal = new JLabel("Ingrese el número");
		lblInputDecimal.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lblInputDecimal.setForeground(new Color(0, 0, 102));
		lblInputDecimal.setBounds(120, 133, 133, 28);
		panel_fromDecimal.add(lblInputDecimal);
		
		textDecimalInput = new JTextField();
		textDecimalInput.setBorder(null);
		textDecimalInput.setForeground(new Color(0, 0, 102));
		textDecimalInput.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textDecimalInput.setBounds(263, 134, 162, 28);
		panel_fromDecimal.add(textDecimalInput);
		textDecimalInput.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Ingrese la base");
		lblNewLabel_1.setFont(new Font("Roboto Black", Font.PLAIN, 15));
		lblNewLabel_1.setForeground(new Color(0, 0, 102));
		lblNewLabel_1.setBounds(120, 186, 121, 28);
		panel_fromDecimal.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBorder(null);
		textField.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textField.setForeground(new Color(0, 0, 102));
		textField.setBounds(263, 183, 61, 28);
		panel_fromDecimal.add(textField);
		textField.setColumns(10);
		
		JButton btnFromDecimal = new JButton("Calculate");
		btnFromDecimal.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnFromDecimal.setForeground(new Color(0, 0, 102));
		btnFromDecimal.setBorder(null);
		btnFromDecimal.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		btnFromDecimal.setBounds(334, 183, 89, 28);
		panel_fromDecimal.add(btnFromDecimal);
		
		JTextArea textResultado2 = new JTextArea();
		textResultado2.setBackground(new Color(240, 240, 240));
		textResultado2.setForeground(new Color(0, 0, 102));
		textResultado2.setFont(new Font("Roboto Medium", Font.PLAIN, 16));
		textResultado2.setEditable(false);
		textResultado2.setText("Respuesta");
		textResultado2.setBorder(null);
		textResultado2.setBounds(63, 241, 458, 45);
		panel_fromDecimal.add(textResultado2);
		
		JLabel lblHexadecimal = new JLabel("Hexadecimal");
		lblHexadecimal.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		lblHexadecimal.setForeground(new Color(0, 0, 102));
		lblHexadecimal.setBounds(63, 307, 78, 19);
		panel_fromDecimal.add(lblHexadecimal);
		
		textHexadecimal = new JTextField();
		textHexadecimal.setBackground(new Color(240, 240, 240));
		textHexadecimal.setBorder(null);
		textHexadecimal.setForeground(new Color(0, 0, 102));
		textHexadecimal.setFont(new Font("Roboto Black", Font.PLAIN, 13));
		textHexadecimal.setBounds(155, 299, 219, 28);
		panel_fromDecimal.add(textHexadecimal);
		textHexadecimal.setColumns(10);
		
		JLabel lblBinario = new JLabel("Binario");
		lblBinario.setFont(new Font("Roboto Black", Font.PLAIN, 12));
		lblBinario.setForeground(new Color(0, 0, 102));
		lblBinario.setBounds(63, 351, 78, 19);
		panel_fromDecimal.add(lblBinario);
		
		textBinario = new JTextField();
		textBinario.setBackground(new Color(240, 240, 240));
		textBinario.setFont(new Font("Roboto Black", Font.PLAIN, 13));
		textBinario.setForeground(new Color(0, 0, 102));
		textBinario.setBorder(null);
		textBinario.setBounds(155, 343, 219, 28);
		panel_fromDecimal.add(textBinario);
		textBinario.setColumns(10);
	}
}
