package View;

import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controller.ControladorConversor;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class WelcomeGui extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	ImagenPanel fondo = new ImagenPanel();

	/**
	 * Launch the application.
	 */
	/*
	 * public static void main(String[] args) { EventQueue.invokeLater(new
	 * Runnable() { public void run() { try { WelcomeGui frame = new WelcomeGui();
	 * frame.setVisible(true); } catch (Exception e) { e.printStackTrace(); } } });
	 * }
	 */

	/**
	 * Create the frame.
	 */
	public WelcomeGui() {
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setFont(new Font("Roboto Black", Font.PLAIN, 14));
		setTitle("AluraONE 5 William Sandoval Rosas");
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\col.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(90, 140, 1170, 500);
		
		
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 102));
		panel.setBounds(-2, 23, 1156, 37);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblConversorNumerico = new JLabel("Will IAm Tools");
		lblConversorNumerico.setFont(new Font("Roboto Black", Font.PLAIN, 18));
		lblConversorNumerico.setForeground(new Color(255, 255, 255));
		lblConversorNumerico.setBounds(529, 0, 117, 37);
		panel.add(lblConversorNumerico);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1154, 22);
		contentPane.add(menuBar);
		
		JMenu mnInicio = new JMenu("Inicio");
		menuBar.add(mnInicio);
		
		JMenu mnEconomia = new JMenu("Economía");
		menuBar.add(mnEconomia);
		
		JMenuItem CalDivisas = new JMenuItem("Conversor Divisas");
		CalDivisas.addMouseListener(new MouseAdapter() {
		
			@Override
			public void mouseReleased(MouseEvent e) {
				ControladorConversor.showGuiConversor();
			}
		});
		
		CalDivisas.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\reducidas\\col.png"));
		mnEconomia.add(CalDivisas);
		
		
		
		JMenu mnMatematicas = new JMenu("Matemáticas");
		menuBar.add(mnMatematicas);
		JMenuItem mntmNumeros = new JMenuItem("Sistemas Numéricos");
		mnMatematicas.add(mntmNumeros);
		
		JMenu mnEstadistica = new JMenu("Estadística");
		menuBar.add(mnEstadistica);
		
		JMenuItem mntmTbFrecuencias = new JMenuItem("Tabla de Frecuencias");
		mnEstadistica.add(mntmTbFrecuencias);
		
		JMenu mnFisica = new JMenu("Física");
		menuBar.add(mnFisica);
		
		JMenu mnElectricidad = new JMenu("Electricidad");
		menuBar.add(mnElectricidad);
		
		JMenuItem mntmOhm = new JMenuItem("LeyOhm/Watt");
		mntmOhm.setBackground(new Color(153, 204, 204));
		mntmOhm.setForeground(new Color(0, 0, 102));
		mntmOhm.setFont(new Font("Roboto Medium", Font.PLAIN, 12));
		mnElectricidad.add(mntmOhm);
		
		JMenuItem mntmResistencias = new JMenuItem("Código Resistencias");
		mnElectricidad.add(mntmResistencias);
		
		JMenu mnNetwork = new JMenu("Redes de datos");
		menuBar.add(mnNetwork);
		
		JMenuItem mntmSubneting = new JMenuItem("Calculo de redes");
		mnNetwork.add(mntmSubneting);
		
		JLabel lblLabel = new JLabel("");
		lblLabel.setBounds(106, 171, 201, 162);
		lblLabel.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\divisas1.JPG"));
		contentPane.add(lblLabel);
		
		JLabel lblLabel1 = new JLabel("");
		lblLabel1.setBounds(429, 171, 238, 163);
		lblLabel1.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\icono.png"));
		contentPane.add(lblLabel1);
		
		JLabel lblLabel2 = new JLabel("New label");
		lblLabel2.setBounds(791, 171, 274, 162);
		lblLabel2.setIcon(new ImageIcon("C:\\Users\\Developer\\eclipse-workspace\\PrimerConversor\\src\\images\\euler1.jpg"));
		contentPane.add(lblLabel2);
		
		JTextArea txtrByWillIam = new JTextArea();
		txtrByWillIam.setEditable(false);
		txtrByWillIam.setText("By William Sandoval Rosas - 2023- Bogotá-Colombia");
		txtrByWillIam.setOpaque(false);
		txtrByWillIam.setForeground(new Color(0, 0, 102));
		txtrByWillIam.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		txtrByWillIam.setBounds(376, 420, 364, 30);
		contentPane.add(txtrByWillIam);
		
		JTextArea txtrPresentacion = new JTextArea();
		txtrPresentacion.setOpaque(false);
		txtrPresentacion.setEditable(false);
		txtrPresentacion.setText("Este software esta diseñado para agilizar tareas en algunas disciplinas, puede elegir accediento al menú.");
		txtrPresentacion.setForeground(new Color(0, 0, 102));
		txtrPresentacion.setFont(new Font("Roboto Medium", Font.PLAIN, 14));
		txtrPresentacion.setBounds(106, 99, 923, 61);
		contentPane.add(txtrPresentacion);
		
		
		
		
		
		
		
	}
}
