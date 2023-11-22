package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controller.logic_view_run;

import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class view_run extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public lienzo pn_lienzo; //Declarar al JPanel como lienzo
	public JLabel lbl_min;
	public JLabel lbl_seg;
	public JButton btn_start;
	public JButton btn_pause;
	public JButton btn_resume;
	private logic_view_run lvr; //Declaro la clase logic_view_run del controller

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					view_run frame = new view_run();
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
	public view_run() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Juego Carreras");
		setBounds(100, 100, 709, 408);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 255, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		pn_lienzo = new lienzo();
		pn_lienzo.setBounds(0, 65, 697, 256);
		pn_lienzo.setBackground(Color.white);
		contentPane.add(pn_lienzo);
		
		JPanel pn_control = new JPanel();
		pn_control.setBounds(0, 332, 697, 41);
		pn_control.setBackground(new Color(240, 248, 255));
		contentPane.add(pn_control);
		pn_control.setLayout(null);
		
		btn_start = new JButton("Start");
		btn_start.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_start.setForeground(new Color(0, 0, 0));
		btn_start.setBounds(77, 11, 89, 23);
		pn_control.add(btn_start);
		
		btn_pause = new JButton("Pause");
		btn_pause.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_pause.setBounds(309, 11, 89, 23);
		pn_control.add(btn_pause);
		
		btn_resume = new JButton("Resume");
		btn_resume.setFont(new Font("Tahoma", Font.BOLD, 15));
		btn_resume.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_resume.setBounds(513, 11, 109, 23);
		pn_control.add(btn_resume);
		
		JPanel pn_time = new JPanel();
		pn_time.setBackground(new Color(211, 211, 211));
		pn_time.setBounds(0, 0, 697, 65);
		contentPane.add(pn_time);
		pn_time.setLayout(null);
		
		lbl_min = new JLabel("00");
		lbl_min.setForeground(new Color(0, 0, 128));
		lbl_min.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_min.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lbl_min.setBounds(551, 11, 63, 43);
		pn_time.add(lbl_min);
		
		lbl_seg = new JLabel("00");
		lbl_seg.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_seg.setForeground(new Color(0, 0, 128));
		lbl_seg.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lbl_seg.setBounds(634, 11, 63, 43);
		pn_time.add(lbl_seg);
		
		JLabel lbl_sig = new JLabel(":");
		lbl_sig.setHorizontalAlignment(SwingConstants.CENTER);
		lbl_sig.setForeground(new Color(0, 0, 128));
		lbl_sig.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
		lbl_sig.setBounds(604, 11, 33, 43);
		pn_time.add(lbl_sig);
		//Instancia
		lvr = new logic_view_run(this);
	}
}
