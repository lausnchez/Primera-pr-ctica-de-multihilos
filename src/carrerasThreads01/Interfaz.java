package carrerasThreads01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class Interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	static Corredor corredor1 = new Corredor("Gato1", 10);
	static Corredor corredor2 = new Corredor("Gato2", 10);
	static Corredor corredor3 = new Corredor("Gato3", 10);
	static Corredor corredor4 = new Corredor("Gato4", 10);
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfaz frame = new Interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		// Inicializamos a los corredores
		//----------------------------------------
		corredor1.start();
		corredor2.start();
		corredor3.start();
		corredor4.start();
		
	}

	/**
	 * Create the frame.
	 */
	public Interfaz() {
		setTitle("MierdiGatos");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 956, 614);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 127, 80));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		// Corredores
		//------------------------------------------------------------------------------------------------------------------------
		JLabel lbl_corredor1 = new JLabel("");
		lbl_corredor1.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lbl_corredor1.setBounds(10, 17, 100, 100);
		lbl_corredor1.setIcon(new ImageIcon("C:\\Users\\Laura Sánchez\\eclipse-workspace\\carrerasThreads01\\src\\gato1.gif"));
		contentPane.add(lbl_corredor1);
		
		JLabel lbl_corredor2 = new JLabel("");
		lbl_corredor2.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lbl_corredor2.setBounds(10, 128, 100, 100);
		lbl_corredor2.setIcon(new ImageIcon("C:\\Users\\Laura Sánchez\\eclipse-workspace\\carrerasThreads01\\src\\gato2.gif"));
		contentPane.add(lbl_corredor2);
		
		JLabel lbl_corredor3 = new JLabel("");
		lbl_corredor3.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lbl_corredor3.setBounds(10, 239, 100, 100);
		lbl_corredor3.setIcon(new ImageIcon("C:\\Users\\Laura Sánchez\\eclipse-workspace\\carrerasThreads01\\src\\gato3.gif"));
		contentPane.add(lbl_corredor3);
		
		JLabel lbl_corredor4 = new JLabel("");
		lbl_corredor4.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
		lbl_corredor4.setBounds(10, 350, 100, 100);
		lbl_corredor4.setIcon(new ImageIcon("C:\\Users\\Laura Sánchez\\eclipse-workspace\\carrerasThreads01\\src\\gato4.gif"));
		contentPane.add(lbl_corredor4);
		
		// Elementos restantes
		JPanel meta = new JPanel();
		meta.setBounds(789, 10, 1, 500);
		contentPane.add(meta);
		
		JButton btn_correr = new JButton("Empezar Carrera");
		btn_correr.setBounds(711, 521, 199, 43);
		contentPane.add(btn_correr);
		
		JLabel lbl_resultado = new JLabel("");
		lbl_resultado.setForeground(new Color(255, 255, 255));
		lbl_resultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lbl_resultado.setBounds(43, 528, 556, 22);
		contentPane.add(lbl_resultado);
	}

	
}
