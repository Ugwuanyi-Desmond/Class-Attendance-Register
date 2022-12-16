package ClassReg;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ClassRegister {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblMNo1;
	private JLabel lblMNo2;
	private JLabel lblMNo3;
	private JLabel lblMNo4;
	private JLabel lblMNo5;
	private JLabel lblMNo6;
	private JLabel lblMNo7;
	private JLabel lblMNo8;
	private JLabel lblMNo9;
	private JLabel lblMNo10;
	private JLabel lblMNo11;

	
	
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;

	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ClassRegister window = new ClassRegister();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ClassRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				double MNo;
				MNo = 3628;
				
				String MNo1 = String.format("%.0f", MNo + 100);
				lblMNo1.setText(MNo1);
				
				String MNo2 = String.format("%.0f", MNo + 200);
				lblMNo2.setText(MNo2);				
				String MNo3 = String.format("%.0f", MNo + 300);
				lblMNo3.setText(MNo1);				
				String MNo4 = String.format("%.0f", MNo + 400);
				lblMNo4.setText(MNo4);				
				String MNo5 = String.format("%.0f", MNo + 500);
				lblMNo5.setText(MNo5);				
				String MNo6 = String.format("%.0f", MNo + 600);
				lblMNo6.setText(MNo6);				
				String MNo7 = String.format("%.0f", MNo + 700);
				lblMNo7.setText(MNo7);				
				String MNo8 = String.format("%.0f", MNo + 800);
				lblMNo8.setText(MNo8);				
				String MNo9 = String.format("%.0f", MNo + 900);
				lblMNo9.setText(MNo1);				
				String MNo10 = String.format("%.0f", MNo + 1000);
				lblMNo10.setText(MNo1);				
				String MNo11 = String.format("%.0f", MNo + 1100);
				lblMNo11.setText(MNo11);
			}
			@Override
			public void windowOpened(WindowEvent e) {
			}
		});
		frame.getContentPane().setBackground(new Color(245, 245, 245));
		frame.setBounds(0, 0, 1360, 760);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(250, 240, 230));
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));
		panel.setBounds(10, 10, 1340, 740);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(139, 69, 19));
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1.setBounds(62, 11, 3, 702);
		panel.add(panel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1_1.setBackground(new Color(139, 69, 19));
		panel_1_1.setBounds(207, 11, 3, 702);
		panel.add(panel_1_1);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1_2.setBackground(new Color(139, 69, 19));
		panel_1_2.setBounds(433, 11, 3, 702);
		panel.add(panel_1_2);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1_3.setBackground(new Color(139, 69, 19));
		panel_1_3.setBounds(591, 11, 3, 702);
		panel.add(panel_1_3);
		
		JPanel panel_1_4 = new JPanel();
		panel_1_4.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1_4.setBackground(new Color(139, 69, 19));
		panel_1_4.setBounds(10, 50, 1320, 3);
		panel.add(panel_1_4);
		
		JPanel panel_1_5 = new JPanel();
		panel_1_5.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(0, 0, 128), null, null, null));
		panel_1_5.setBackground(new Color(255, 228, 181));
		panel_1_5.setBounds(795, 11, 6, 702);
		panel.add(panel_1_5);
		
		JLabel lblNewLabel = new JLabel("S/N");
		lblNewLabel.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel.setBounds(10, 20, 42, 22);
		panel.add(lblNewLabel);
		
		JLabel lblStudentNo = new JLabel("Matric No.");
		lblStudentNo.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblStudentNo.setBounds(78, 20, 119, 22);
		panel.add(lblStudentNo);
		
		JLabel lblStudentName = new JLabel("Student Name");
		lblStudentName.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblStudentName.setBounds(231, 20, 161, 22);
		panel.add(lblStudentName);
		
		JLabel lblCourseCode = new JLabel("Course Code");
		lblCourseCode.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblCourseCode.setBounds(449, 20, 132, 22);
		panel.add(lblCourseCode);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.setFocusable(false);
		btnNewButton.setBackground(new Color(255, 245, 238));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\BBMS ICON\\Dec.png"));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(comboBox.getSelectedIndex() == 1) 
				{
					comboBox_1.setSelectedItem("0 -- Absent");
					comboBox_2.setSelectedItem("0 -- Absent");
					comboBox_3.setSelectedItem("0 -- Absent");
					comboBox_4.setSelectedItem("0 -- Absent");
					comboBox_5.setSelectedItem("0 -- Absent");
					comboBox_6.setSelectedItem("0 -- Absent");
					comboBox_7.setSelectedItem("0 -- Absent");
					comboBox_8.setSelectedItem("0 -- Absent");
					comboBox_9.setSelectedItem("0 -- Absent");
					comboBox_10.setSelectedItem("0 -- Absent");
					comboBox_11.setSelectedItem("0 -- Absent");

				}else if(comboBox.getSelectedIndex() == 0) 
				{
					comboBox_1.setSelectedItem("/ -- Present");
					comboBox_2.setSelectedItem("/ -- Present");
					comboBox_3.setSelectedItem("/ -- Present");
					comboBox_4.setSelectedItem("/ -- Present");
					comboBox_5.setSelectedItem("/ -- Present");
					comboBox_6.setSelectedItem("/ -- Present");
					comboBox_7.setSelectedItem("/ -- Present");
					comboBox_8.setSelectedItem("/ -- Present");
					comboBox_9.setSelectedItem("/ -- Present");
					comboBox_10.setSelectedItem("/ -- Present");
					comboBox_11.setSelectedItem("/ -- Present");

				}else if(comboBox.getSelectedIndex() == 2) 
				{
					comboBox_1.setSelectedItem("S -- Sick");
					comboBox_2.setSelectedItem("S -- Sick");
					comboBox_3.setSelectedItem("S -- Sick");
					comboBox_4.setSelectedItem("S -- Sick");
					comboBox_5.setSelectedItem("S -- Sick");
					comboBox_6.setSelectedItem("S -- Sick");
					comboBox_7.setSelectedItem("S -- Sick");
					comboBox_8.setSelectedItem("S -- Sick");
					comboBox_9.setSelectedItem("S -- Sick");
					comboBox_10.setSelectedItem("S -- Sick");
					comboBox_11.setSelectedItem("S -- Sick");

				}else if(comboBox.getSelectedIndex() == 3) 
				{
					comboBox_1.setSelectedIndex(3);
					comboBox_2.setSelectedIndex(3);
					comboBox_3.setSelectedIndex(3);
					comboBox_4.setSelectedIndex(3);
					comboBox_5.setSelectedIndex(3);
					comboBox_6.setSelectedIndex(3);
					comboBox_7.setSelectedIndex(3);
					comboBox_8.setSelectedIndex(3);
					comboBox_9.setSelectedIndex(3);
					comboBox_10.setSelectedIndex(3);
					comboBox_11.setSelectedIndex(3);


				}else if(comboBox.getSelectedIndex() == 4) 
				{
					comboBox_1.setSelectedIndex(4);
					comboBox_2.setSelectedIndex(4);
					comboBox_3.setSelectedIndex(4);
					comboBox_4.setSelectedIndex(4);
					comboBox_5.setSelectedIndex(4);
					comboBox_6.setSelectedIndex(4);
					comboBox_7.setSelectedIndex(4);
					comboBox_8.setSelectedIndex(4);
					comboBox_9.setSelectedIndex(4);
					comboBox_10.setSelectedIndex(4);
					comboBox_11.setSelectedIndex(4);


				}
				
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		btnNewButton.setBounds(755, 11, 30, 30);
		panel.add(btnNewButton);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"/", "0", "S", "A", "L"}));
		comboBox.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox.setBackground(new Color(255, 245, 238));
		comboBox.setBounds(607, 17, 138, 25);
		panel.add(comboBox);
		
		JLabel lblUniversityOfNigeria = new JLabel("University of Nigeria, Nsukka");
		lblUniversityOfNigeria.setHorizontalAlignment(SwingConstants.CENTER);
		lblUniversityOfNigeria.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblUniversityOfNigeria.setBounds(999, 11, 331, 31);
		panel.add(lblUniversityOfNigeria);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Mezico\\Pictures\\UnnGate.jpeg"));
		lblNewLabel_1.setBounds(821, 108, 509, 445);
		panel.add(lblNewLabel_1);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(128, 0, 0));
		separator_1.setBounds(10, 110, 791, 6);
		panel.add(separator_1);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(128, 0, 0));
		separator_3.setBounds(10, 170, 791, 6);
		panel.add(separator_3);
		
		JSeparator separator_5 = new JSeparator();
		separator_5.setBackground(new Color(128, 0, 0));
		separator_5.setBounds(10, 230, 791, 6);
		panel.add(separator_5);
		
		JSeparator separator_6 = new JSeparator();
		separator_6.setBackground(new Color(128, 0, 0));
		separator_6.setBounds(10, 290, 791, 6);
		panel.add(separator_6);
		
		JSeparator separator_8 = new JSeparator();
		separator_8.setBackground(new Color(128, 0, 0));
		separator_8.setBounds(10, 350, 791, 6);
		panel.add(separator_8);
		
		JSeparator separator_10 = new JSeparator();
		separator_10.setBackground(new Color(128, 0, 0));
		separator_10.setBounds(10, 410, 791, 6);
		panel.add(separator_10);
		
		JSeparator separator_13 = new JSeparator();
		separator_13.setBackground(new Color(128, 0, 0));
		separator_13.setBounds(10, 470, 791, 6);
		panel.add(separator_13);
		
		JSeparator separator_15 = new JSeparator();
		separator_15.setBackground(new Color(128, 0, 0));
		separator_15.setBounds(10, 530, 791, 6);
		panel.add(separator_15);
		
		JSeparator separator_17 = new JSeparator();
		separator_17.setBackground(new Color(128, 0, 0));
		separator_17.setBounds(10, 590, 791, 6);
		panel.add(separator_17);
		
		JSeparator separator_19 = new JSeparator();
		separator_19.setBackground(new Color(128, 0, 0));
		separator_19.setBounds(10, 650, 791, 6);
		panel.add(separator_19);
		
		JSeparator separator_20 = new JSeparator();
		separator_20.setBackground(new Color(128, 0, 0));
		separator_20.setBounds(10, 710, 791, 6);
		panel.add(separator_20);
		
		JLabel lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2.setBounds(10, 67, 42, 32);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("2");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1.setBounds(10, 129, 42, 30);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("3");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_1.setBounds(10, 189, 42, 30);
		panel.add(lblNewLabel_2_1_1);
		
		JLabel lblNewLabel_2_1_2 = new JLabel("4");
		lblNewLabel_2_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_2.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_2.setBounds(10, 249, 42, 30);
		panel.add(lblNewLabel_2_1_2);
		
		JLabel lblNewLabel_2_1_3 = new JLabel("5");
		lblNewLabel_2_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_3.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_3.setBounds(10, 309, 42, 30);
		panel.add(lblNewLabel_2_1_3);
		
		JLabel lblNewLabel_2_1_4 = new JLabel("6");
		lblNewLabel_2_1_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_4.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_4.setBounds(10, 369, 42, 30);
		panel.add(lblNewLabel_2_1_4);
		
		JLabel lblNewLabel_2_1_5 = new JLabel("7");
		lblNewLabel_2_1_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_5.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_5.setBounds(10, 429, 42, 30);
		panel.add(lblNewLabel_2_1_5);
		
		JLabel lblNewLabel_2_1_6 = new JLabel("8");
		lblNewLabel_2_1_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_6.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_6.setBounds(10, 489, 42, 30);
		panel.add(lblNewLabel_2_1_6);
		
		JLabel lblNewLabel_2_1_7 = new JLabel("9");
		lblNewLabel_2_1_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_7.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_7.setBounds(10, 549, 42, 30);
		panel.add(lblNewLabel_2_1_7);
		
		JLabel lblNewLabel_2_1_8 = new JLabel("10");
		lblNewLabel_2_1_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_8.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_8.setBounds(10, 609, 42, 30);
		panel.add(lblNewLabel_2_1_8);
		
		JLabel lblNewLabel_2_1_9 = new JLabel("11");
		lblNewLabel_2_1_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_9.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_2_1_9.setBounds(10, 669, 42, 30);
		panel.add(lblNewLabel_2_1_9);
		
		JLabel lblNewLabel_3 = new JLabel("ECE 671");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3.setBounds(449, 71, 132, 28);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("ECE 671");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_1.setBounds(449, 131, 132, 28);
		panel.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_3_2 = new JLabel("ECE 671");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_2.setBounds(449, 191, 132, 28);
		panel.add(lblNewLabel_3_2);
		
		JLabel lblNewLabel_3_3 = new JLabel("ECE 671");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_3.setBounds(449, 251, 132, 28);
		panel.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_3_4 = new JLabel("ECE 671");
		lblNewLabel_3_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_4.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_4.setBounds(449, 311, 132, 28);
		panel.add(lblNewLabel_3_4);
		
		JLabel lblNewLabel_3_5 = new JLabel("ECE 671");
		lblNewLabel_3_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_5.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_5.setBounds(449, 371, 132, 28);
		panel.add(lblNewLabel_3_5);
		
		JLabel lblNewLabel_3_6 = new JLabel("ECE 671");
		lblNewLabel_3_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_6.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_6.setBounds(449, 431, 132, 28);
		panel.add(lblNewLabel_3_6);
		
		JLabel lblNewLabel_3_7 = new JLabel("ECE 671");
		lblNewLabel_3_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_7.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_7.setBounds(449, 487, 132, 28);
		panel.add(lblNewLabel_3_7);
		
		JLabel lblNewLabel_3_8 = new JLabel("ECE 671");
		lblNewLabel_3_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_8.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_8.setBounds(449, 551, 132, 28);
		panel.add(lblNewLabel_3_8);
		
		JLabel lblNewLabel_3_9 = new JLabel("ECE 671");
		lblNewLabel_3_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_9.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_9.setBounds(449, 611, 132, 28);
		panel.add(lblNewLabel_3_9);
		
		JLabel lblNewLabel_3_10 = new JLabel("ECE 671");
		lblNewLabel_3_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_10.setFont(new Font("Arial Narrow", Font.BOLD, 25));
		lblNewLabel_3_10.setBounds(449, 671, 132, 28);
		panel.add(lblNewLabel_3_10);
		
		comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_1.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_1.setBackground(new Color(255, 245, 238));
		comboBox_1.setBounds(607, 74, 178, 25);
		panel.add(comboBox_1);
		
		comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_2.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_2.setBackground(new Color(255, 245, 238));
		comboBox_2.setBounds(607, 134, 178, 25);
		panel.add(comboBox_2);
		
		comboBox_3 = new JComboBox();
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_3.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_3.setBackground(new Color(255, 245, 238));
		comboBox_3.setBounds(607, 194, 178, 25);
		panel.add(comboBox_3);
		
		comboBox_4 = new JComboBox();
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_4.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_4.setBackground(new Color(255, 245, 238));
		comboBox_4.setBounds(607, 254, 178, 25);
		panel.add(comboBox_4);
		
		comboBox_5 = new JComboBox();
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_5.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_5.setBackground(new Color(255, 245, 238));
		comboBox_5.setBounds(607, 314, 178, 25);
		panel.add(comboBox_5);
		
		comboBox_6 = new JComboBox();
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_6.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_6.setBackground(new Color(255, 245, 238));
		comboBox_6.setBounds(607, 374, 178, 25);
		panel.add(comboBox_6);
		
		comboBox_7 = new JComboBox();
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_7.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_7.setBackground(new Color(255, 245, 238));
		comboBox_7.setBounds(607, 434, 178, 25);
		panel.add(comboBox_7);
		
		comboBox_8 = new JComboBox();
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_8.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_8.setBackground(new Color(255, 245, 238));
		comboBox_8.setBounds(607, 490, 178, 25);
		panel.add(comboBox_8);
		
		comboBox_9 = new JComboBox();
		comboBox_9.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_9.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_9.setBackground(new Color(255, 245, 238));
		comboBox_9.setBounds(607, 554, 178, 25);
		panel.add(comboBox_9);
		
		comboBox_10 = new JComboBox();
		comboBox_10.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_10.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_10.setBackground(new Color(255, 245, 238));
		comboBox_10.setBounds(607, 614, 178, 25);
		panel.add(comboBox_10);
		
		comboBox_11 = new JComboBox();
		comboBox_11.setModel(new DefaultComboBoxModel(new String[] {"/ -- Present", "0 -- Absent", "S -- Sick", "A -- Authorised", "L -- Late"}));
		comboBox_11.setFont(new Font("Arial Narrow", Font.BOLD, 18));
		comboBox_11.setBackground(new Color(255, 245, 238));
		comboBox_11.setBounds(607, 674, 178, 25);
		panel.add(comboBox_11);
		
		JLabel lblNewLabel_4 = new JLabel("John Odo");
		lblNewLabel_4.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4.setBounds(223, 67, 200, 32);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Clint Ugwu");
		lblNewLabel_4_1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_1.setBounds(223, 127, 200, 32);
		panel.add(lblNewLabel_4_1);
		
		JLabel lblNewLabel_4_2 = new JLabel("Destiny Walters");
		lblNewLabel_4_2.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_2.setBounds(223, 187, 200, 32);
		panel.add(lblNewLabel_4_2);
		
		JLabel lblNewLabel_4_3 = new JLabel("Chiamaka Eze");
		lblNewLabel_4_3.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_3.setBounds(223, 247, 200, 32);
		panel.add(lblNewLabel_4_3);
		
		JLabel lblNewLabel_4_4 = new JLabel("Chukwuebuka Onah");
		lblNewLabel_4_4.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_4.setBounds(223, 307, 200, 32);
		panel.add(lblNewLabel_4_4);
		
		JLabel lblNewLabel_4_5 = new JLabel("Yvonne Chukwu");
		lblNewLabel_4_5.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_5.setBounds(223, 367, 200, 32);
		panel.add(lblNewLabel_4_5);
		
		JLabel lblNewLabel_4_6 = new JLabel("Uchechi Okoli");
		lblNewLabel_4_6.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_6.setBounds(223, 427, 200, 32);
		panel.add(lblNewLabel_4_6);
		
		JLabel lblNewLabel_4_7 = new JLabel("Bassey Ikot");
		lblNewLabel_4_7.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_7.setBounds(223, 487, 200, 32);
		panel.add(lblNewLabel_4_7);
		
		JLabel lblNewLabel_4_8 = new JLabel("Mezico Nelson");
		lblNewLabel_4_8.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_8.setBounds(223, 547, 200, 32);
		panel.add(lblNewLabel_4_8);
		
		JLabel lblNewLabel_4_9 = new JLabel("Olagoke Fikunayomi");
		lblNewLabel_4_9.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_9.setBounds(223, 607, 200, 32);
		panel.add(lblNewLabel_4_9);
		
		JLabel lblNewLabel_4_10 = new JLabel("Oyindamola Saliu");
		lblNewLabel_4_10.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_10.setBounds(223, 667, 200, 32);
		panel.add(lblNewLabel_4_10);
		
		lblMNo1 = new JLabel("Matric No");
		lblMNo1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		lblMNo1.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo1.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo1.setBounds(75, 67, 122, 32);
		panel.add(lblMNo1);
		
		lblMNo2 = new JLabel("Matric No");
		lblMNo2.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo2.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo2.setBounds(75, 127, 122, 32);
		panel.add(lblMNo2);
		
		lblMNo3 = new JLabel("Matric No");
		lblMNo3.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo3.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo3.setBounds(75, 187, 122, 32);
		panel.add(lblMNo3);
		
		lblMNo4 = new JLabel("Matric No");
		lblMNo4.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo4.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo4.setBounds(75, 247, 122, 32);
		panel.add(lblMNo4);
		
		lblMNo5 = new JLabel("Matric No");
		lblMNo5.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo5.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo5.setBounds(75, 307, 122, 32);
		panel.add(lblMNo5);
		
		lblMNo6 = new JLabel("Matric No");
		lblMNo6.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo6.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo6.setBounds(75, 367, 122, 32);
		panel.add(lblMNo6);
		
		lblMNo7 = new JLabel("Matric No");
		lblMNo7.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo7.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo7.setBounds(75, 427, 122, 32);
		panel.add(lblMNo7);
		
		lblMNo8 = new JLabel("Matric No");
		lblMNo8.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo8.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo8.setBounds(75, 483, 122, 32);
		panel.add(lblMNo8);
		
		lblMNo9 = new JLabel("Matric No");
		lblMNo9.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo9.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo9.setBounds(75, 547, 122, 32);
		panel.add(lblMNo9);
		
		lblMNo10 = new JLabel("Matric No");
		lblMNo10.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo10.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo10.setBounds(75, 607, 122, 32);
		panel.add(lblMNo10);
		
		lblMNo11 = new JLabel("Matric No");
		lblMNo11.setHorizontalAlignment(SwingConstants.CENTER);
		lblMNo11.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblMNo11.setBounds(75, 667, 122, 32);
		panel.add(lblMNo11);
		
		JLabel lblNewLabel_4_11_11 = new JLabel("Lecturer's Name");
		lblNewLabel_4_11_11.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_11_11.setBounds(859, 67, 172, 30);
		panel.add(lblNewLabel_4_11_11);
		
		textField = new JTextField();
		textField.setBackground(new Color(255, 245, 238));
		textField.setBounds(1089, 67, 161, 30);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_4_11_12 = new JLabel("Overall Attendance %");
		lblNewLabel_4_11_12.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_11_12.setBounds(821, 634, 172, 32);
		panel.add(lblNewLabel_4_11_12);
		
		textField_1 = new JTextField();
		textField_1.setBackground(new Color(255, 245, 238));
		textField_1.setColumns(10);
		textField_1.setBounds(1077, 638, 161, 30);
		panel.add(textField_1);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBorder(new BevelBorder(BevelBorder.LOWERED, new Color(128, 0, 0), null, null, null));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = JOptionPane.showConfirmDialog(null, "Are You Sure You Want to Exit?", "Class Attendance", JOptionPane.WARNING_MESSAGE);
				if(i == 0) {
					System.exit(0);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Arial Narrow", Font.BOLD, 15));
		btnNewButton_1.setBackground(new Color(255, 245, 238));
		btnNewButton_1.setBounds(1149, 686, 89, 30);
		panel.add(btnNewButton_1);
		
		JLabel lblNewLabel_4_11_12_2 = new JLabel("CR/1348");
		lblNewLabel_4_11_12_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_11_12_2.setFont(new Font("Arial Narrow", Font.BOLD, 20));
		lblNewLabel_4_11_12_2.setBounds(811, 11, 144, 32);
		panel.add(lblNewLabel_4_11_12_2);
	}
}
