package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JList;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import javax.swing.AbstractListModel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JFormattedTextField;
import javax.swing.table.DefaultTableModel;

public class Main extends JFrame {

	private JPanel contentPane;
	private JTextField tFName;
	private JTextField tFRasse;
	private JTextField tFKultur;
	private JTextField tFProfession;
	private JTextField tFPunkte;
	private JTextField tFGuthaben;
	private JTable tTalente;
	private JTable tSonder;
	private JTextField tFGeschlecht;
	private JTextField tFGeburt;
	private JTextField tFAlter;
	private JTextField tFHaar;
	private JTextField tFAugen;
	private JTextField tFSozial;
	private JTextField tFGroesse;
	private JTextField tFGewicht;
	private JTextField tFSchip;
	private JTable tVorteil;
	private JTextField tFLeben;
	private JTextField tFAstral;
	private JTextField tFKarma;
	private JTextField tFSeele;
	private JTextField tFZaehig;
	private JTextField tFAusweichen;
	private JTextField tFInitative;
	private JTextField tFGeschwind;
	private JTextField tFMut;
	private JTextField tFKlugheit;
	private JTextField tFIntuition;
	private JTextField tFCharisma;
	private JTextField tFGewandheit;
	private JTextField tFFinger;
	private JTextField tFKonstition;
	private JTextField tFKoerperkraft;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1227, 683);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JSplitPane splitPane = new JSplitPane();
		contentPane.add(splitPane, BorderLayout.CENTER);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(1.0);
		splitPane.setRightComponent(splitPane_1);
		
		JPanel panel_1 = new JPanel();
		splitPane_1.setRightComponent(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{5, 300, 5, 0};
		gbl_panel_1.rowHeights = new int[]{5, 0, 5, 0};
		gbl_panel_1.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JTextPane tPInfo = new JTextPane();
		tPInfo.setBackground(SystemColor.menu);
		tPInfo.setEditable(false);
		GridBagConstraints gbc_tPInfo = new GridBagConstraints();
		gbc_tPInfo.insets = new Insets(0, 0, 5, 5);
		gbc_tPInfo.fill = GridBagConstraints.BOTH;
		gbc_tPInfo.gridx = 1;
		gbc_tPInfo.gridy = 1;
		panel_1.add(tPInfo, gbc_tPInfo);
		
		JPanel panel_2 = new JPanel();
		splitPane_1.setLeftComponent(panel_2);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{7, 0, 0, 0, 0, 5, 0};
		gbl_panel_2.rowHeights = new int[]{5, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 5, 0};
		gbl_panel_2.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 1.0, 1.0, 1.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Name:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		tFName = new JTextField();
		GridBagConstraints gbc_tFName = new GridBagConstraints();
		gbc_tFName.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFName.gridwidth = 3;
		gbc_tFName.insets = new Insets(0, 0, 5, 5);
		gbc_tFName.gridx = 2;
		gbc_tFName.gridy = 1;
		panel_2.add(tFName, gbc_tFName);
		tFName.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Rasse:");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 2;
		panel_2.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		tFRasse = new JTextField();
		GridBagConstraints gbc_tFRasse = new GridBagConstraints();
		gbc_tFRasse.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFRasse.gridwidth = 3;
		gbc_tFRasse.insets = new Insets(0, 0, 5, 5);
		gbc_tFRasse.gridx = 2;
		gbc_tFRasse.gridy = 2;
		panel_2.add(tFRasse, gbc_tFRasse);
		tFRasse.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Kultur:");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 3;
		panel_2.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		tFKultur = new JTextField();
		GridBagConstraints gbc_tFKultur = new GridBagConstraints();
		gbc_tFKultur.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFKultur.gridwidth = 3;
		gbc_tFKultur.insets = new Insets(0, 0, 5, 5);
		gbc_tFKultur.gridx = 2;
		gbc_tFKultur.gridy = 3;
		panel_2.add(tFKultur, gbc_tFKultur);
		tFKultur.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Profession:");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 4;
		panel_2.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		tFProfession = new JTextField();
		GridBagConstraints gbc_tFProfession = new GridBagConstraints();
		gbc_tFProfession.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFProfession.gridwidth = 3;
		gbc_tFProfession.insets = new Insets(0, 0, 5, 5);
		gbc_tFProfession.gridx = 2;
		gbc_tFProfession.gridy = 4;
		panel_2.add(tFProfession, gbc_tFProfession);
		tFProfession.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Abenteuerpunkte:   ");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 1;
		gbc_lblNewLabel_4.gridy = 5;
		panel_2.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		tFPunkte = new JTextField();
		GridBagConstraints gbc_tFPunkte = new GridBagConstraints();
		gbc_tFPunkte.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFPunkte.insets = new Insets(0, 0, 5, 5);
		gbc_tFPunkte.gridx = 2;
		gbc_tFPunkte.gridy = 5;
		panel_2.add(tFPunkte, gbc_tFPunkte);
		tFPunkte.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("   AP Guthaben:   ");
		GridBagConstraints gbc_lblNewLabel_5 = new GridBagConstraints();
		gbc_lblNewLabel_5.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_5.gridx = 3;
		gbc_lblNewLabel_5.gridy = 5;
		panel_2.add(lblNewLabel_5, gbc_lblNewLabel_5);
		
		tFGuthaben = new JTextField();
		GridBagConstraints gbc_tFGuthaben = new GridBagConstraints();
		gbc_tFGuthaben.insets = new Insets(0, 0, 5, 5);
		gbc_tFGuthaben.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGuthaben.gridx = 4;
		gbc_tFGuthaben.gridy = 5;
		panel_2.add(tFGuthaben, gbc_tFGuthaben);
		tFGuthaben.setColumns(10);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		GridBagConstraints gbc_tabbedPane = new GridBagConstraints();
		gbc_tabbedPane.gridheight = 5;
		gbc_tabbedPane.gridwidth = 4;
		gbc_tabbedPane.insets = new Insets(0, 0, 5, 5);
		gbc_tabbedPane.fill = GridBagConstraints.BOTH;
		gbc_tabbedPane.gridx = 1;
		gbc_tabbedPane.gridy = 6;
		panel_2.add(tabbedPane, gbc_tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Allgemein", null, panel_3, null);
		GridBagLayout gbl_panel_3 = new GridBagLayout();
		gbl_panel_3.columnWidths = new int[]{5, 0, 0, 0, 0, 0, 0, 5, 0};
		gbl_panel_3.rowHeights = new int[]{5, 0, 0, 0, 0, 27, 5, 0};
		gbl_panel_3.columnWeights = new double[]{0.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_3.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		panel_3.setLayout(gbl_panel_3);
		
		JLabel lblNewLabel_6 = new JLabel("Geschlecht:");
		GridBagConstraints gbc_lblNewLabel_6 = new GridBagConstraints();
		gbc_lblNewLabel_6.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_6.gridx = 1;
		gbc_lblNewLabel_6.gridy = 1;
		panel_3.add(lblNewLabel_6, gbc_lblNewLabel_6);
		
		tFGeschlecht = new JTextField();
		GridBagConstraints gbc_tFGeschlecht = new GridBagConstraints();
		gbc_tFGeschlecht.insets = new Insets(0, 0, 5, 5);
		gbc_tFGeschlecht.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGeschlecht.gridx = 2;
		gbc_tFGeschlecht.gridy = 1;
		panel_3.add(tFGeschlecht, gbc_tFGeschlecht);
		tFGeschlecht.setColumns(10);
		
		JLabel lblNewLabel_9 = new JLabel("Haarfarbe:");
		GridBagConstraints gbc_lblNewLabel_9 = new GridBagConstraints();
		gbc_lblNewLabel_9.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_9.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_9.gridx = 3;
		gbc_lblNewLabel_9.gridy = 1;
		panel_3.add(lblNewLabel_9, gbc_lblNewLabel_9);
		
		tFHaar = new JTextField();
		GridBagConstraints gbc_tFHaar = new GridBagConstraints();
		gbc_tFHaar.insets = new Insets(0, 0, 5, 5);
		gbc_tFHaar.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFHaar.gridx = 4;
		gbc_tFHaar.gridy = 1;
		panel_3.add(tFHaar, gbc_tFHaar);
		tFHaar.setColumns(10);
		
		JLabel lblNewLabel_12 = new JLabel("Gr\u00F6\u00DFe:");
		GridBagConstraints gbc_lblNewLabel_12 = new GridBagConstraints();
		gbc_lblNewLabel_12.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_12.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_12.gridx = 5;
		gbc_lblNewLabel_12.gridy = 1;
		panel_3.add(lblNewLabel_12, gbc_lblNewLabel_12);
		
		tFGroesse = new JTextField();
		GridBagConstraints gbc_tFGroesse = new GridBagConstraints();
		gbc_tFGroesse.insets = new Insets(0, 0, 5, 5);
		gbc_tFGroesse.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGroesse.gridx = 6;
		gbc_tFGroesse.gridy = 1;
		panel_3.add(tFGroesse, gbc_tFGroesse);
		tFGroesse.setColumns(10);
		
		JLabel lblNewLabel_7 = new JLabel("Geburtstag:");
		GridBagConstraints gbc_lblNewLabel_7 = new GridBagConstraints();
		gbc_lblNewLabel_7.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_7.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_7.gridx = 1;
		gbc_lblNewLabel_7.gridy = 2;
		panel_3.add(lblNewLabel_7, gbc_lblNewLabel_7);
		
		tFGeburt = new JTextField();
		GridBagConstraints gbc_tFGeburt = new GridBagConstraints();
		gbc_tFGeburt.insets = new Insets(0, 0, 5, 5);
		gbc_tFGeburt.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGeburt.gridx = 2;
		gbc_tFGeburt.gridy = 2;
		panel_3.add(tFGeburt, gbc_tFGeburt);
		tFGeburt.setColumns(10);
		
		JLabel lblNewLabel_10 = new JLabel("Augenfarbe:");
		GridBagConstraints gbc_lblNewLabel_10 = new GridBagConstraints();
		gbc_lblNewLabel_10.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_10.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_10.gridx = 3;
		gbc_lblNewLabel_10.gridy = 2;
		panel_3.add(lblNewLabel_10, gbc_lblNewLabel_10);
		
		tFAugen = new JTextField();
		GridBagConstraints gbc_tFAugen = new GridBagConstraints();
		gbc_tFAugen.insets = new Insets(0, 0, 5, 5);
		gbc_tFAugen.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAugen.gridx = 4;
		gbc_tFAugen.gridy = 2;
		panel_3.add(tFAugen, gbc_tFAugen);
		tFAugen.setColumns(10);
		
		JLabel lblNewLabel_13 = new JLabel("Gewicht:");
		GridBagConstraints gbc_lblNewLabel_13 = new GridBagConstraints();
		gbc_lblNewLabel_13.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_13.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_13.gridx = 5;
		gbc_lblNewLabel_13.gridy = 2;
		panel_3.add(lblNewLabel_13, gbc_lblNewLabel_13);
		
		tFGewicht = new JTextField();
		GridBagConstraints gbc_tFGewicht = new GridBagConstraints();
		gbc_tFGewicht.insets = new Insets(0, 0, 5, 5);
		gbc_tFGewicht.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGewicht.gridx = 6;
		gbc_tFGewicht.gridy = 2;
		panel_3.add(tFGewicht, gbc_tFGewicht);
		tFGewicht.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Alter:");
		GridBagConstraints gbc_lblNewLabel_8 = new GridBagConstraints();
		gbc_lblNewLabel_8.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_8.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_8.gridx = 1;
		gbc_lblNewLabel_8.gridy = 3;
		panel_3.add(lblNewLabel_8, gbc_lblNewLabel_8);
		
		tFAlter = new JTextField();
		GridBagConstraints gbc_tFAlter = new GridBagConstraints();
		gbc_tFAlter.insets = new Insets(0, 0, 5, 5);
		gbc_tFAlter.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAlter.gridx = 2;
		gbc_tFAlter.gridy = 3;
		panel_3.add(tFAlter, gbc_tFAlter);
		tFAlter.setColumns(10);
		
		JLabel lblNewLabel_11 = new JLabel("Sozialstatus:");
		GridBagConstraints gbc_lblNewLabel_11 = new GridBagConstraints();
		gbc_lblNewLabel_11.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_11.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_11.gridx = 3;
		gbc_lblNewLabel_11.gridy = 3;
		panel_3.add(lblNewLabel_11, gbc_lblNewLabel_11);
		
		tFSozial = new JTextField();
		GridBagConstraints gbc_tFSozial = new GridBagConstraints();
		gbc_tFSozial.insets = new Insets(0, 0, 5, 5);
		gbc_tFSozial.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFSozial.gridx = 4;
		gbc_tFSozial.gridy = 3;
		panel_3.add(tFSozial, gbc_tFSozial);
		tFSozial.setColumns(10);
		
		JLabel lblNewLabel_14 = new JLabel("Schps:");
		GridBagConstraints gbc_lblNewLabel_14 = new GridBagConstraints();
		gbc_lblNewLabel_14.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_14.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_14.gridx = 5;
		gbc_lblNewLabel_14.gridy = 3;
		panel_3.add(lblNewLabel_14, gbc_lblNewLabel_14);
		
		tFSchip = new JTextField();
		GridBagConstraints gbc_tFSchip = new GridBagConstraints();
		gbc_tFSchip.insets = new Insets(0, 0, 5, 5);
		gbc_tFSchip.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFSchip.gridx = 6;
		gbc_tFSchip.gridy = 3;
		panel_3.add(tFSchip, gbc_tFSchip);
		tFSchip.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Vor- & Nachteile:");
		GridBagConstraints gbc_lblNewLabel_15 = new GridBagConstraints();
		gbc_lblNewLabel_15.fill = GridBagConstraints.HORIZONTAL;
		gbc_lblNewLabel_15.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_15.gridx = 1;
		gbc_lblNewLabel_15.gridy = 4;
		panel_3.add(lblNewLabel_15, gbc_lblNewLabel_15);
		
		JButton btnNotiz = new JButton("Notizen");
		GridBagConstraints gbc_btnNotiz = new GridBagConstraints();
		gbc_btnNotiz.gridwidth = 2;
		gbc_btnNotiz.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnNotiz.insets = new Insets(0, 0, 5, 5);
		gbc_btnNotiz.gridx = 5;
		gbc_btnNotiz.gridy = 4;
		panel_3.add(btnNotiz, gbc_btnNotiz);
		
		JScrollPane scrollPane_2 = new JScrollPane();
		GridBagConstraints gbc_scrollPane_2 = new GridBagConstraints();
		gbc_scrollPane_2.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane_2.gridwidth = 6;
		gbc_scrollPane_2.fill = GridBagConstraints.BOTH;
		gbc_scrollPane_2.gridx = 1;
		gbc_scrollPane_2.gridy = 5;
		panel_3.add(scrollPane_2, gbc_scrollPane_2);
		
		tVorteil = new JTable();
		tVorteil.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name"
			}
		));
		scrollPane_2.setViewportView(tVorteil);
		
		JPanel panel_4 = new JPanel();
		tabbedPane.addTab("Eigenschaften", null, panel_4, null);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 20, 0, 20, 0, 20, 0, 20, 0};
		gbl_panel_4.rowHeights = new int[]{40, 40, 40, 40, 40, 40, 40, 40, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, 0.0, 1.0, 0.0, 1.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JLabel lblNewLabel_16 = new JLabel("Mut:");
		GridBagConstraints gbc_lblNewLabel_16 = new GridBagConstraints();
		gbc_lblNewLabel_16.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_16.gridx = 0;
		gbc_lblNewLabel_16.gridy = 0;
		panel_4.add(lblNewLabel_16, gbc_lblNewLabel_16);
		
		tFMut = new JTextField();
		GridBagConstraints gbc_tFMut = new GridBagConstraints();
		gbc_tFMut.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFMut.insets = new Insets(0, 0, 5, 5);
		gbc_tFMut.gridx = 2;
		gbc_tFMut.gridy = 0;
		panel_4.add(tFMut, gbc_tFMut);
		tFMut.setColumns(10);
		
		JLabel lblNewLabel_24 = new JLabel("Lebensenergie:");
		GridBagConstraints gbc_lblNewLabel_24 = new GridBagConstraints();
		gbc_lblNewLabel_24.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_24.gridx = 4;
		gbc_lblNewLabel_24.gridy = 0;
		panel_4.add(lblNewLabel_24, gbc_lblNewLabel_24);
		
		tFLeben = new JTextField();
		GridBagConstraints gbc_tFLeben = new GridBagConstraints();
		gbc_tFLeben.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFLeben.insets = new Insets(0, 0, 5, 5);
		gbc_tFLeben.gridx = 6;
		gbc_tFLeben.gridy = 0;
		panel_4.add(tFLeben, gbc_tFLeben);
		tFLeben.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Klugheit:");
		GridBagConstraints gbc_lblNewLabel_17 = new GridBagConstraints();
		gbc_lblNewLabel_17.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_17.gridx = 0;
		gbc_lblNewLabel_17.gridy = 1;
		panel_4.add(lblNewLabel_17, gbc_lblNewLabel_17);
		
		tFKlugheit = new JTextField();
		GridBagConstraints gbc_tFKlugheit = new GridBagConstraints();
		gbc_tFKlugheit.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFKlugheit.insets = new Insets(0, 0, 5, 5);
		gbc_tFKlugheit.gridx = 2;
		gbc_tFKlugheit.gridy = 1;
		panel_4.add(tFKlugheit, gbc_tFKlugheit);
		tFKlugheit.setColumns(10);
		
		JLabel lblNewLabel_25 = new JLabel("Astralenergie:");
		GridBagConstraints gbc_lblNewLabel_25 = new GridBagConstraints();
		gbc_lblNewLabel_25.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_25.gridx = 4;
		gbc_lblNewLabel_25.gridy = 1;
		panel_4.add(lblNewLabel_25, gbc_lblNewLabel_25);
		
		tFAstral = new JTextField();
		GridBagConstraints gbc_tFAstral = new GridBagConstraints();
		gbc_tFAstral.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAstral.insets = new Insets(0, 0, 5, 5);
		gbc_tFAstral.gridx = 6;
		gbc_tFAstral.gridy = 1;
		panel_4.add(tFAstral, gbc_tFAstral);
		tFAstral.setColumns(10);
		
		JLabel lblNewLabel_18 = new JLabel("Intuition:");
		GridBagConstraints gbc_lblNewLabel_18 = new GridBagConstraints();
		gbc_lblNewLabel_18.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_18.gridx = 0;
		gbc_lblNewLabel_18.gridy = 2;
		panel_4.add(lblNewLabel_18, gbc_lblNewLabel_18);
		
		tFIntuition = new JTextField();
		GridBagConstraints gbc_tFIntuition = new GridBagConstraints();
		gbc_tFIntuition.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFIntuition.insets = new Insets(0, 0, 5, 5);
		gbc_tFIntuition.gridx = 2;
		gbc_tFIntuition.gridy = 2;
		panel_4.add(tFIntuition, gbc_tFIntuition);
		tFIntuition.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Karmaenergie:");
		GridBagConstraints gbc_lblNewLabel_26 = new GridBagConstraints();
		gbc_lblNewLabel_26.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_26.gridx = 4;
		gbc_lblNewLabel_26.gridy = 2;
		panel_4.add(lblNewLabel_26, gbc_lblNewLabel_26);
		
		tFKarma = new JTextField();
		GridBagConstraints gbc_tFKarma = new GridBagConstraints();
		gbc_tFKarma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFKarma.insets = new Insets(0, 0, 5, 5);
		gbc_tFKarma.gridx = 6;
		gbc_tFKarma.gridy = 2;
		panel_4.add(tFKarma, gbc_tFKarma);
		tFKarma.setColumns(10);
		
		JLabel lblNewLabel_19 = new JLabel("Charisma:");
		GridBagConstraints gbc_lblNewLabel_19 = new GridBagConstraints();
		gbc_lblNewLabel_19.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_19.gridx = 0;
		gbc_lblNewLabel_19.gridy = 3;
		panel_4.add(lblNewLabel_19, gbc_lblNewLabel_19);
		
		tFCharisma = new JTextField();
		GridBagConstraints gbc_tFCharisma = new GridBagConstraints();
		gbc_tFCharisma.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFCharisma.insets = new Insets(0, 0, 5, 5);
		gbc_tFCharisma.gridx = 2;
		gbc_tFCharisma.gridy = 3;
		panel_4.add(tFCharisma, gbc_tFCharisma);
		tFCharisma.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Seelenkraft:");
		GridBagConstraints gbc_lblNewLabel_27 = new GridBagConstraints();
		gbc_lblNewLabel_27.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_27.gridx = 4;
		gbc_lblNewLabel_27.gridy = 3;
		panel_4.add(lblNewLabel_27, gbc_lblNewLabel_27);
		
		tFSeele = new JTextField();
		GridBagConstraints gbc_tFSeele = new GridBagConstraints();
		gbc_tFSeele.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFSeele.insets = new Insets(0, 0, 5, 5);
		gbc_tFSeele.gridx = 6;
		gbc_tFSeele.gridy = 3;
		panel_4.add(tFSeele, gbc_tFSeele);
		tFSeele.setColumns(10);
		
		JLabel lblNewLabel_20 = new JLabel("Gewandheit:");
		GridBagConstraints gbc_lblNewLabel_20 = new GridBagConstraints();
		gbc_lblNewLabel_20.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_20.gridx = 0;
		gbc_lblNewLabel_20.gridy = 4;
		panel_4.add(lblNewLabel_20, gbc_lblNewLabel_20);
		
		tFGewandheit = new JTextField();
		GridBagConstraints gbc_tFGewandheit = new GridBagConstraints();
		gbc_tFGewandheit.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGewandheit.insets = new Insets(0, 0, 5, 5);
		gbc_tFGewandheit.gridx = 2;
		gbc_tFGewandheit.gridy = 4;
		panel_4.add(tFGewandheit, gbc_tFGewandheit);
		tFGewandheit.setColumns(10);
		
		JLabel lblNewLabel_28 = new JLabel("Z\u00E4higkeit:");
		GridBagConstraints gbc_lblNewLabel_28 = new GridBagConstraints();
		gbc_lblNewLabel_28.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_28.gridx = 4;
		gbc_lblNewLabel_28.gridy = 4;
		panel_4.add(lblNewLabel_28, gbc_lblNewLabel_28);
		
		tFZaehig = new JTextField();
		GridBagConstraints gbc_tFZaehig = new GridBagConstraints();
		gbc_tFZaehig.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFZaehig.insets = new Insets(0, 0, 5, 5);
		gbc_tFZaehig.gridx = 6;
		gbc_tFZaehig.gridy = 4;
		panel_4.add(tFZaehig, gbc_tFZaehig);
		tFZaehig.setColumns(10);
		
		JLabel lblNewLabel_21 = new JLabel("Fingerfertigkeit:");
		GridBagConstraints gbc_lblNewLabel_21 = new GridBagConstraints();
		gbc_lblNewLabel_21.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_21.gridx = 0;
		gbc_lblNewLabel_21.gridy = 5;
		panel_4.add(lblNewLabel_21, gbc_lblNewLabel_21);
		
		tFFinger = new JTextField();
		GridBagConstraints gbc_tFFinger = new GridBagConstraints();
		gbc_tFFinger.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFFinger.insets = new Insets(0, 0, 5, 5);
		gbc_tFFinger.gridx = 2;
		gbc_tFFinger.gridy = 5;
		panel_4.add(tFFinger, gbc_tFFinger);
		tFFinger.setColumns(10);
		
		JLabel lblNewLabel_29 = new JLabel("Ausweichen:");
		GridBagConstraints gbc_lblNewLabel_29 = new GridBagConstraints();
		gbc_lblNewLabel_29.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_29.gridx = 4;
		gbc_lblNewLabel_29.gridy = 5;
		panel_4.add(lblNewLabel_29, gbc_lblNewLabel_29);
		
		tFAusweichen = new JTextField();
		GridBagConstraints gbc_tFAusweichen = new GridBagConstraints();
		gbc_tFAusweichen.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFAusweichen.insets = new Insets(0, 0, 5, 5);
		gbc_tFAusweichen.gridx = 6;
		gbc_tFAusweichen.gridy = 5;
		panel_4.add(tFAusweichen, gbc_tFAusweichen);
		tFAusweichen.setColumns(10);
		
		JLabel lblNewLabel_22 = new JLabel("Konstitution:");
		GridBagConstraints gbc_lblNewLabel_22 = new GridBagConstraints();
		gbc_lblNewLabel_22.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_22.gridx = 0;
		gbc_lblNewLabel_22.gridy = 6;
		panel_4.add(lblNewLabel_22, gbc_lblNewLabel_22);
		
		tFKonstition = new JTextField();
		GridBagConstraints gbc_tFKonstition = new GridBagConstraints();
		gbc_tFKonstition.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFKonstition.insets = new Insets(0, 0, 5, 5);
		gbc_tFKonstition.gridx = 2;
		gbc_tFKonstition.gridy = 6;
		panel_4.add(tFKonstition, gbc_tFKonstition);
		tFKonstition.setColumns(10);
		
		JLabel lblNewLabel_30 = new JLabel("Initiative:");
		GridBagConstraints gbc_lblNewLabel_30 = new GridBagConstraints();
		gbc_lblNewLabel_30.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_30.gridx = 4;
		gbc_lblNewLabel_30.gridy = 6;
		panel_4.add(lblNewLabel_30, gbc_lblNewLabel_30);
		
		tFInitative = new JTextField();
		GridBagConstraints gbc_tFInitative = new GridBagConstraints();
		gbc_tFInitative.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFInitative.insets = new Insets(0, 0, 5, 5);
		gbc_tFInitative.gridx = 6;
		gbc_tFInitative.gridy = 6;
		panel_4.add(tFInitative, gbc_tFInitative);
		tFInitative.setColumns(10);
		
		JLabel lblNewLabel_23 = new JLabel("K\u00F6rperkraft:");
		GridBagConstraints gbc_lblNewLabel_23 = new GridBagConstraints();
		gbc_lblNewLabel_23.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_23.gridx = 0;
		gbc_lblNewLabel_23.gridy = 7;
		panel_4.add(lblNewLabel_23, gbc_lblNewLabel_23);
		
		tFKoerperkraft = new JTextField();
		GridBagConstraints gbc_tFKoerperkraft = new GridBagConstraints();
		gbc_tFKoerperkraft.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFKoerperkraft.insets = new Insets(0, 0, 5, 5);
		gbc_tFKoerperkraft.gridx = 2;
		gbc_tFKoerperkraft.gridy = 7;
		panel_4.add(tFKoerperkraft, gbc_tFKoerperkraft);
		tFKoerperkraft.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("Geschwindigkeit:");
		GridBagConstraints gbc_lblNewLabel_31 = new GridBagConstraints();
		gbc_lblNewLabel_31.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_31.gridx = 4;
		gbc_lblNewLabel_31.gridy = 7;
		panel_4.add(lblNewLabel_31, gbc_lblNewLabel_31);
		
		tFGeschwind = new JTextField();
		GridBagConstraints gbc_tFGeschwind = new GridBagConstraints();
		gbc_tFGeschwind.fill = GridBagConstraints.HORIZONTAL;
		gbc_tFGeschwind.insets = new Insets(0, 0, 5, 5);
		gbc_tFGeschwind.gridx = 6;
		gbc_tFGeschwind.gridy = 7;
		panel_4.add(tFGeschwind, gbc_tFGeschwind);
		tFGeschwind.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		tabbedPane.addTab("Talente", null, scrollPane, null);
		
		tTalente = new JTable();
		tTalente.setModel(new DefaultTableModel(
			new Object[][] {
				{null, "--K\u00D6RPER--", null},
				{"B", "Fliegen", null},
				{"A", "Gaukeleien", null},
				{"B", "Klettern", null},
				{"D", "K\u00F6rperbeherrschung", null},
				{"B", "Kraftakt", null},
				{"B", "Reiten", null},
				{"B", "Schwimmen", null},
				{"D", "Selbstbeherrschung", null},
				{"A", "Singen", null},
				{"D", "Sinnessch\u00E4rfe", null},
				{"A", "Tanzen", null},
				{"B", "Taschendiebstahl", null},
				{"C", "Verbergen", null},
				{"A", "Zechen", null},
				{null, "--GESELLSCHAFT--", null},
				{"B", "Bekehren & \u00DCberzeugen", null},
				{"B", "Bet\u00F6ren", null},
				{"B", "Einsch\u00FCchtern", null},
				{"B", "Etikette", null},
				{"C", "Gassenwissen", null},
				{"C", "Menschenkenntnis", null},
				{"C", "\u00DCberreden", null},
				{"B", "Verkleiden", null},
				{"D", "Willenskraft", null},
				{null, "--NATUR--", null},
				{"C", "F\u00E4hrtensuchen", null},
				{"A", "Fesseln", null},
				{"A", "Fischen & Angeln", null},
				{"B", "Orientierung", null},
				{"C", "Pflanzenkunde", null},
				{"C", "Tierkunde", null},
				{"C", "Wildnisleben", null},
				{null, "--WISSEN--", null},
				{"A", "Brett- & Gl\u00FCcksspiel", null},
				{"B", "Georaphie", null},
				{"B", "Geschichtswissen", null},
				{"B", "G\u00F6tter & Kulte", null},
				{"B", "Kriegskunst", null},
				{"C", "Magiekunde", null},
				{"B", "Mechanik", null},
				{"A", "Rechnen", null},
				{"A", "Rechtkunde", null},
				{"B", "Sagen & Legenden", null},
				{"B", "Sph\u00E4renkunde", null},
				{"A", "Sternenkunde", null},
				{null, "--HANDWERK--", null},
				{"C", "Alchimie", null},
				{"B", "Boote & Schiffe", null},
				{"A", "Fahrzeuge", null},
				{"B", "Handel", null},
				{"B", "Heilkunde Gift", null},
				{"B", "Heilkunde Krankheiten", null},
				{"B", "Heilkunde Seele", null},
				{"D", "Heilkunde Wunden", null},
				{"B", "Holzbearbeitung", null},
				{"A", "Lebensmittelbearbeitung", null},
				{"B", "Lederbearbeitung", null},
				{"A", "Malen & Zeichnen", null},
				{"C", "Metallbearbeitung", null},
				{"A", "Musizieren", null},
				{"C", "Schl\u00F6sserknacken", null},
				{"A", "Steinbearbeitung", null},
				{"A", "Stoffbearbeitung", null},
			},
			new String[] {
				"SF.", "Name", "Fw."
			}
		));
		tTalente.getColumnModel().getColumn(0).setPreferredWidth(35);
		tTalente.getColumnModel().getColumn(0).setMinWidth(35);
		tTalente.getColumnModel().getColumn(0).setMaxWidth(35);
		tTalente.getColumnModel().getColumn(2).setPreferredWidth(35);
		tTalente.getColumnModel().getColumn(2).setMinWidth(35);
		tTalente.getColumnModel().getColumn(2).setMaxWidth(35);
		scrollPane.setViewportView(tTalente);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		tabbedPane.addTab("Sonderfertigkeiten", null, scrollPane_1, null);
		
		tSonder = new JTable();
		tSonder.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Name"
			}
		));
		scrollPane_1.setViewportView(tSonder);
		
		JSplitPane splitPane_2 = new JSplitPane();
		splitPane_2.setResizeWeight(1.0);
		splitPane_2.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setLeftComponent(splitPane_2);
		
		JList lChar = new JList();
		lChar.setModel(new AbstractListModel() {
			String[] values = new String[] {};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		splitPane_2.setLeftComponent(lChar);
		
		JPanel panel = new JPanel();
		splitPane_2.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{20, 100, 20, 0};
		gbl_panel.rowHeights = new int[]{20, 0, 20, 0, 20, 0};
		gbl_panel.columnWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		JButton btnNeu = new JButton("Neu");
		GridBagConstraints gbc_btnNeu = new GridBagConstraints();
		gbc_btnNeu.fill = GridBagConstraints.BOTH;
		gbc_btnNeu.insets = new Insets(0, 0, 5, 5);
		gbc_btnNeu.gridx = 1;
		gbc_btnNeu.gridy = 1;
		panel.add(btnNeu, gbc_btnNeu);
		
		JButton btnLoeschen = new JButton("L\u00F6schen");
		GridBagConstraints gbc_btnLoeschen = new GridBagConstraints();
		gbc_btnLoeschen.fill = GridBagConstraints.BOTH;
		gbc_btnLoeschen.insets = new Insets(0, 0, 5, 5);
		gbc_btnLoeschen.gridx = 1;
		gbc_btnLoeschen.gridy = 3;
		panel.add(btnLoeschen, gbc_btnLoeschen);
	}
}
