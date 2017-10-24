package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JScrollPane;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.ListSelectionModel;
import javax.swing.JCheckBox;

public class Neu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Neu frame = new Neu();
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
	public Neu() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 974, 560);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setResizeWeight(0.3);
		contentPane.add(splitPane);
		
		JScrollPane scrollPane = new JScrollPane();
		splitPane.setLeftComponent(scrollPane);
		
		JTextArea txtrInfo = new JTextArea();
		txtrInfo.setLineWrap(true);
		txtrInfo.setEditable(false);
		txtrInfo.setBackground(SystemColor.menu);
		scrollPane.setViewportView(txtrInfo);
		
		JSplitPane splitPane_1 = new JSplitPane();
		splitPane_1.setResizeWeight(0.8);
		splitPane_1.setOrientation(JSplitPane.VERTICAL_SPLIT);
		splitPane.setRightComponent(splitPane_1);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.LEFT);
		splitPane_1.setLeftComponent(tabbedPane);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Einstellungen", null, panel_2, null);
		tabbedPane.setEnabledAt(0, true);
		GridBagLayout gbl_panel_2 = new GridBagLayout();
		gbl_panel_2.columnWidths = new int[]{0, 20, 300, 0, 0};
		gbl_panel_2.rowHeights = new int[]{40, 0, 20, 0, 0, 0, 0};
		gbl_panel_2.columnWeights = new double[]{1.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		gbl_panel_2.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 1.0, Double.MIN_VALUE};
		panel_2.setLayout(gbl_panel_2);
		
		JLabel lblNewLabel = new JLabel("Erfahrungsstufe:");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 1;
		panel_2.add(lblNewLabel, gbc_lblNewLabel);
		
		JComboBox cBErfahrung = new JComboBox();
		cBErfahrung.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int index = cBErfahrung.getSelectedIndex();
				switch (index) {
				case 0: txtrInfo.setText("Unerfahren\r\n\r\nAP-Konto:  900\r\nH\u00F6chstwert Eigenschaft:  12\r\nH\u00F6chstwert Fertigkeit:  10\r\nH\u00F6chstwert Kampftechnik:  8\r\nmax. Eigenschaftenpunkte:  95\r\nmax. Zauber/Liurgien (Fremdzauber):  8 (0)");
				txtrInfo.setCaretPosition(0);
				break;
				case 1: txtrInfo.setText("Durschnittlich\r\n\r\nAP-Konto:  1.000\r\nH\u00F6chstwert Eigenschaft:  13\r\nH\u00F6chstwert Fertigkeit:  10\r\nH\u00F6chstwert Kampftechnik:  10\r\nmax. Eigenschaftenpunkte:  98\r\nmax. Zauber/Liurgien (Fremdzauber):  10 (1)");
				txtrInfo.setCaretPosition(0);
				break;
				case 2: txtrInfo.setText("Erfahren\r\n\r\nAP-Konto:  1.100\r\nH\u00F6chstwert Eigenschaft:  14\r\nH\u00F6chstwert Fertigkeit:  10\r\nH\u00F6chstwert Kampftechnik:  12\r\nmax. Eigenschaftenpunkte:  100\r\nmax. Zauber/Liurgien (Fremdzauber):  12 (2)");
				txtrInfo.setCaretPosition(0);
				break;
				case 3: txtrInfo.setText("Kompetent\r\n\r\nAP-Konto:  1.200\r\nH\u00F6chstwert Eigenschaft:  15\r\nH\u00F6chstwert Fertigkeit:  13\r\nH\u00F6chstwert Kampftechnik:  14\r\nmax. Eigenschaftenpunkte:  102\r\nmax. Zauber/Liurgien (Fremdzauber):  14 (3)");
				txtrInfo.setCaretPosition(0);
				break;
				case 4: txtrInfo.setText("Meisterlich\r\n\r\nAP-Konto:  1.400\r\nH\u00F6chstwert Eigenschaft:  16\r\nH\u00F6chstwert Fertigkeit:  16\r\nH\u00F6chstwert Kampftechnik:  16\r\nmax. Eigenschaftenpunkte:  105\r\nmax. Zauber/Liurgien (Fremdzauber):  16 (4)");
				txtrInfo.setCaretPosition(0);
				break;
				case 5: txtrInfo.setText("Brillant\r\n\r\nAP-Konto:  1.700\r\nH\u00F6chstwert Eigenschaft:  17\r\nH\u00F6chstwert Fertigkeit:  19\r\nH\u00F6chstwert Kampftechnik:  18\r\nmax. Eigenschaftenpunkte:  109\r\nmax. Zauber/Liurgien (Fremdzauber):  18 (5)");
				txtrInfo.setCaretPosition(0);
				break;
				case 6: txtrInfo.setText("Legendär\r\n\r\nAP-Konto:  2.100\r\nH\u00F6chstwert Eigenschaft:  18\r\nH\u00F6chstwert Fertigkeit:  20\r\nH\u00F6chstwert Kampftechnik:  20\r\nmax. Eigenschaftenpunkte:  114\r\nmax. Zauber/Liurgien (Fremdzauber):  20 (6)");
				txtrInfo.setCaretPosition(0);
				}
			}
		});
		cBErfahrung.setModel(new DefaultComboBoxModel(new String[] {"Unerfahren (900)", "Durchschnuttlich (1000)", "Erfahren (1100)", "Kompetent (1200)", "Meisterlich (1400)", "Brillant (1700)", "Legend\u00E4r (2100)"}));
		cBErfahrung.setSelectedIndex(2);
		GridBagConstraints gbc_cBErfahrung = new GridBagConstraints();
		gbc_cBErfahrung.insets = new Insets(0, 0, 5, 5);
		gbc_cBErfahrung.fill = GridBagConstraints.HORIZONTAL;
		gbc_cBErfahrung.gridx = 2;
		gbc_cBErfahrung.gridy = 1;
		panel_2.add(cBErfahrung, gbc_cBErfahrung);
		
		JRadioButton rdbtnMnnlich = new JRadioButton("m\u00E4nnlich");
		rdbtnMnnlich.setSelected(true);
		GridBagConstraints gbc_rdbtnMnnlich = new GridBagConstraints();
		gbc_rdbtnMnnlich.anchor = GridBagConstraints.WEST;
		gbc_rdbtnMnnlich.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnMnnlich.gridx = 2;
		gbc_rdbtnMnnlich.gridy = 3;
		panel_2.add(rdbtnMnnlich, gbc_rdbtnMnnlich);
		
		JRadioButton rdbtnWeiblich = new JRadioButton("weiblich");
		GridBagConstraints gbc_rdbtnWeiblich = new GridBagConstraints();
		gbc_rdbtnWeiblich.anchor = GridBagConstraints.WEST;
		gbc_rdbtnWeiblich.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnWeiblich.gridx = 2;
		gbc_rdbtnWeiblich.gridy = 4;
		panel_2.add(rdbtnWeiblich, gbc_rdbtnWeiblich);
		
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnWeiblich);
		group.add(rdbtnMnnlich);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Rasse", null, panel_3, null);
		tabbedPane.setEnabledAt(1, false);
		panel_3.setLayout(new BorderLayout(0, 0));
		
		JList lRasse = new JList();
		lRasse.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		lRasse.setModel(new AbstractListModel() {
			String[] values = new String[] {"Elf (18 AP)", "Halbelf (0 AP)", "Mensch [Mittell\u00E4nder] (0 AP)", "Mensch [Nivesen] (0 AP)", "Mensch [Norbaden] (0 AP)", "Mensch [Thorwaler] (0 AP)", "Mensch [Tulamiden] (0 AP)", "Mensch [Waldmenschen] (0 AP)", "Mensch [Utulus] (0 AP)", "Zwerg(61 AP)"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		panel_3.add(lRasse, BorderLayout.CENTER);
		
		JPanel panel_4 = new JPanel();
		panel_4.setVisible(false);
		panel_3.add(panel_4, BorderLayout.EAST);
		GridBagLayout gbl_panel_4 = new GridBagLayout();
		gbl_panel_4.columnWidths = new int[]{0, 0};
		gbl_panel_4.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_panel_4.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_panel_4.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		panel_4.setLayout(gbl_panel_4);
		
		JRadioButton rdbtn1 = new JRadioButton("+ 1 MU");
		rdbtn1.setSelected(true);
		GridBagConstraints gbc_rdbtn1 = new GridBagConstraints();
		gbc_rdbtn1.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn1.anchor = GridBagConstraints.NORTHWEST;
		gbc_rdbtn1.gridx = 0;
		gbc_rdbtn1.gridy = 0;
		panel_4.add(rdbtn1, gbc_rdbtn1);
		
		JRadioButton rdbtn2 = new JRadioButton("+ 1 KL");
		GridBagConstraints gbc_rdbtn2 = new GridBagConstraints();
		gbc_rdbtn2.anchor = GridBagConstraints.WEST;
		gbc_rdbtn2.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn2.gridx = 0;
		gbc_rdbtn2.gridy = 1;
		panel_4.add(rdbtn2, gbc_rdbtn2);
		
		JRadioButton rdbtn3 = new JRadioButton("+ 1 IN");
		GridBagConstraints gbc_rdbtn3 = new GridBagConstraints();
		gbc_rdbtn3.anchor = GridBagConstraints.WEST;
		gbc_rdbtn3.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn3.gridx = 0;
		gbc_rdbtn3.gridy = 2;
		panel_4.add(rdbtn3, gbc_rdbtn3);
		
		JRadioButton rdbtn4 = new JRadioButton("+ 1 CH");
		GridBagConstraints gbc_rdbtn4 = new GridBagConstraints();
		gbc_rdbtn4.anchor = GridBagConstraints.WEST;
		gbc_rdbtn4.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn4.gridx = 0;
		gbc_rdbtn4.gridy = 3;
		panel_4.add(rdbtn4, gbc_rdbtn4);
		
		JRadioButton rdbtn5 = new JRadioButton("+ 1 FF");
		GridBagConstraints gbc_rdbtn5 = new GridBagConstraints();
		gbc_rdbtn5.anchor = GridBagConstraints.WEST;
		gbc_rdbtn5.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn5.gridx = 0;
		gbc_rdbtn5.gridy = 4;
		panel_4.add(rdbtn5, gbc_rdbtn5);
		
		JRadioButton rdbtn6 = new JRadioButton("+ 1 GE");
		GridBagConstraints gbc_rdbtn6 = new GridBagConstraints();
		gbc_rdbtn6.anchor = GridBagConstraints.WEST;
		gbc_rdbtn6.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn6.gridx = 0;
		gbc_rdbtn6.gridy = 5;
		panel_4.add(rdbtn6, gbc_rdbtn6);
		
		JRadioButton rdbtn7 = new JRadioButton("+ 1 KO");
		GridBagConstraints gbc_rdbtn7 = new GridBagConstraints();
		gbc_rdbtn7.anchor = GridBagConstraints.WEST;
		gbc_rdbtn7.insets = new Insets(0, 0, 5, 0);
		gbc_rdbtn7.gridx = 0;
		gbc_rdbtn7.gridy = 6;
		panel_4.add(rdbtn7, gbc_rdbtn7);
		
		JRadioButton rdbtn8 = new JRadioButton("+ 1 KK");
		GridBagConstraints gbc_rdbtn8 = new GridBagConstraints();
		gbc_rdbtn8.anchor = GridBagConstraints.WEST;
		gbc_rdbtn8.gridx = 0;
		gbc_rdbtn8.gridy = 7;
		panel_4.add(rdbtn8, gbc_rdbtn8);
		
		ButtonGroup group1 = new ButtonGroup();
		group1.add(rdbtn1);
		group1.add(rdbtn2);
		group1.add(rdbtn3);
		group1.add(rdbtn4);
		group1.add(rdbtn5);
		group1.add(rdbtn6);
		group1.add(rdbtn7);
		group1.add(rdbtn8);
		
		JPanel panel_5 = new JPanel();
		tabbedPane.addTab("Kultur", null, panel_5, null);
		panel_5.setLayout(new BorderLayout(0, 0));
		
		JList lKultur = new JList();
		lKultur.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		panel_5.add(lKultur, BorderLayout.CENTER);
		
		JPanel panel = new JPanel();
		panel.setVisible(false);
		panel_5.add(panel, BorderLayout.EAST);
		
		JCheckBox chckbxKulturpaket = new JCheckBox("Kulturpaket");
		chckbxKulturpaket.setSelected(true);
		panel.add(chckbxKulturpaket);
		tabbedPane.setEnabledAt(2, false);
		
		JScrollPane scrollPane_3 = new JScrollPane();
		tabbedPane.addTab("Profession", null, scrollPane_3, null);
		
		JTree tProfession = new JTree();
		tProfession.setRootVisible(false);
		tProfession.setModel(new DefaultTreeModel(
			new DefaultMutableTreeNode("Profession") {
				/**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
					DefaultMutableTreeNode node_1;
					node_1 = new DefaultMutableTreeNode("Barde (150 AP)");
						node_1.add(new DefaultMutableTreeNode("Geschichtenerz\u00E4hler (144 AP)"));
						node_1.add(new DefaultMutableTreeNode("Skalde (162 AP)"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Gardist (246 AP)");
						node_1.add(new DefaultMutableTreeNode("Aufseher (235 AP)"));
						node_1.add(new DefaultMutableTreeNode("Kerkermeister (240 AP)"));
						node_1.add(new DefaultMutableTreeNode("Z\u00F6llner (257 AP)"));
					add(node_1);
					node_1 = new DefaultMutableTreeNode("Gaukler (160 AP)");
						node_1.add(new DefaultMutableTreeNode("Akrobat (173 AP)"));
						node_1.add(new DefaultMutableTreeNode("Domteur (171 AP)"));
						node_1.add(new DefaultMutableTreeNode("Messerwerfer (160 AP)"));
						node_1.add(new DefaultMutableTreeNode("Possenrei\u00DFer (154 AP)"));
						node_1.add(new DefaultMutableTreeNode("Wahrsager (146 AP)"));
					add(node_1);
				}
			}
		));
		scrollPane_3.setViewportView(tProfession);
		tabbedPane.setEnabledAt(3, false);
		
		JPanel panel_1 = new JPanel();
		splitPane_1.setRightComponent(panel_1);
		GridBagLayout gbl_panel_1 = new GridBagLayout();
		gbl_panel_1.columnWidths = new int[]{0, 100, 0, 100, 0, 0};
		gbl_panel_1.rowHeights = new int[]{0, 25, 0, 0};
		gbl_panel_1.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_panel_1.rowWeights = new double[]{1.0, 1.0, 1.0, Double.MIN_VALUE};
		panel_1.setLayout(gbl_panel_1);
		
		JButton btnZurueck = new JButton("Zur\u00FCck");
		btnZurueck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		GridBagConstraints gbc_btnZurueck = new GridBagConstraints();
		gbc_btnZurueck.fill = GridBagConstraints.BOTH;
		gbc_btnZurueck.insets = new Insets(0, 0, 5, 5);
		gbc_btnZurueck.gridx = 1;
		gbc_btnZurueck.gridy = 1;
		panel_1.add(btnZurueck, gbc_btnZurueck);
		
		JButton btnWeiter = new JButton("Weiter");
		btnWeiter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int n = tabbedPane.getSelectedIndex();
				if (n+1 < tabbedPane.getTabCount()) {
					tabbedPane.setEnabledAt(n, false);
					tabbedPane.setEnabledAt(n+1, true);
					tabbedPane.setSelectedIndex(n+1);
					txtrInfo.setText(null);
					if (1 <= tabbedPane.getSelectedIndex()) {
						btnWeiter.setEnabled(false);
					}
					if (2 == tabbedPane.getSelectedIndex()) {
						int i = lRasse.getSelectedIndex();
						switch (i) {
						case 0: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Auelfen (43 AP)", "Firnelfen (55 AP)", "Waldelfen (47 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 1: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Andergast (20 AP)", "Auelfen (43 AP)", "Bornländer (18 AP)", "Firnelfen (55 AP)", "Horasier (27 AP)", "Mittelreicher (12 AP)", "Nivesen (37 AP)", "Nordaventurier (25 AP)", "Nostrier (15 AP)", "Svellttaler (21 AP)", "Thorwaler (24 AP)", "Waldelfen (47 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 2: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Andergast (20 AP)", "Bornländer (18 AP)", "Horasier (27 AP)", "Maraskaner (26 AP)", "Mittelreicher (12 AP)", "Nordaventurier (25 AP)", "Nostrier (15 AP)", "Südaventurier (26 AP)", "Svellttaler (21 AP)", "Zyklopäer (16 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 3: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Bornländer (18 AP)", "Nivesen (37 AP)", "Nordaventurier (25 AP)", "Svellttaler (21 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 4: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Bornländer (18 AP)", "Norbaden (18 AP)", "Nordaventurier (25 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 5: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Fjarninger (33 AP)", "Nordaventurier (25 AP)", "Thorwaler (24 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 6: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Aranier (26 AP)", "Maraskaner (26 AP)", "Mhanadistani (28 AP)", "Novadis (25 AP)", "Südaventurier (26 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 7: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Aranier (26 AP)", "Mhanadistani (28 AP)", "Mohas (38 AP)", "Novadis (25 AP)", "Südaventurier (26 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 8: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Aranier (26 AP)", "Mhanadistani (28 AP)", "Mohas (38 AP)", "Novadis (25 AP)", "Südaventurier (26 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						case 9: lKultur.setModel(new AbstractListModel() {
						String[] values = new String[] {"Ambosszwerge (31 AP)", "Brillantzwerge (29 AP)", "Erzzwerge (34 AP)", "Hügelzwerge (13 AP)"};
						public int getSize() {
							return values.length;
						}
						public Object getElementAt(int index) {
							return values[index];
							}
						});
						break;
						}
					}
					if (3 == tabbedPane.getSelectedIndex()) {
						
					}
				}
			}
		});
		GridBagConstraints gbc_btnWeiter = new GridBagConstraints();
		gbc_btnWeiter.fill = GridBagConstraints.BOTH;
		gbc_btnWeiter.insets = new Insets(0, 0, 5, 5);
		gbc_btnWeiter.gridx = 3;
		gbc_btnWeiter.gridy = 1;
		panel_1.add(btnWeiter, gbc_btnWeiter);
		
		lKultur.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				Map<String, String> infoKultur = new HashMap<String, String>();
				infoKultur.put("Andergast (20 AP)", "ANDERGASTER\r\n\r\n\r\n\r\nSprache: Garethi (Andergastisch)\r\n\r\nSchrift: Kusliker Zeichen (2 AP)\r\n\r\nOrtskenntnis: (z.\u2009B. Andergast-Stadt, Joborn)\r\n\r\nSozialstatus: Adel, Unfrei\r\n\r\n\u00DCbliche Professionen:\r\n\r\n#Weltliche Profession: alle au\u00DFer Gladiator und Stammeskrieger\r\n\r\n#Zaubererprofession: Hexe, Magier\r\n\r\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\r\n\r\nTypische Vorteile: Richtungssinn, Z\u00E4her Hund\r\n\r\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Nostrier und Frauen, Weltfremd \u2013 vor allem gegen\u00FCber Fortschritt, Welt au\u00DFerhalb des K\u00F6nigreichs), Schlechte Eigenschaften (Aberglaube)\r\n\r\nUntypische Vorteile: Soziale Anpassungsf\u00E4higkeit\r\n\r\nUntypische Nachteile: Krankheitsanf\u00E4llig\r\n\r\nTypische Talente: Holzbearbeitung, Orientierung, Pflanzenkunde, Sagen & Legenden, Tierkunde, Wildnisleben\r\n\r\nUntypische Talente: Fliegen, Geographie, Geschichtswissen, G\u00F6tter & Kulte, Mechanik, Rechnen, Rechtskunde\r\n\r\n\r\nKulturpaket Andergaster (20 AP)\r\n\r\nHolzbearbeitung +2, Orientierung +1, Pflanzenkunde +1, Sagen & Legenden +1, Tierkunde +1, Wildnisleben +2\r\n\r\n\r\n\r\nPublikation: Regelwerk Seite 96");
				infoKultur.put("Aranier (26 AP)", "ARANIER\n\n\n\nSprache: Tulamidya (Aranisch) oder Garethi (Aretya)\n\nSchrift: Tulamidya oder Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Baburin, Elburum, Llanka, Palmyrabad, Zorgan)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Ritter, Gladiator und Stammeskrieger\n\n#Zaubererprofession: Hexe (vor allem Katzenhexen), Magier (selten)\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Begabung in Gesellschaftstalenten, Entfernungssinn\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit, Vorurteile \u2013 vor allem gegen Novadis und Magier), Schlechte Eigenschaften (Aberglaube), Zerbrechlich\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Blutrausch\n\nTypische Talente: Bet\u00F6ren, Brett- & Gl\u00FCcksspiel, Gassenwissen, Handel, Malen & Zeichnen, Menschenkenntnis, Rechnen, Rechtskunde, Reiten, Sagen & Legenden, Sternkunde, Stoffbearbeitung, Taschendiebstahl, \u00DCberreden\n\nUntypische Talente: Einsch\u00FCchtern, F\u00E4hrtensuchen, Wildnisleben\n\n\nKulturpaket Aranier (26 AP)\n\nBet\u00F6ren +1, Brett- & Gl\u00FCcksspiel +1, Gassenwissen +2, Handel +2, Menschenkenntnis +1, Rechnen +1, Sagen & Legenden +1, Stoffbearbeitung +1, \u00DCberreden +2\n\n\n\nPublikation: Regelwerk Seite 98");
				infoKultur.put("Bornländer (18 AP)", "BORNL\u00C4NDER\n\n\n\nSprache: Garethi (Bornl\u00E4ndisch)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Festum, Norburg, Notmark, Ouvenmas, Rodebrannt)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator und Stammeskrieger\n\n#Zaubererprofession: Hexe (vor allem Kr\u00F6ten- und Rabenhexen), Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: K\u00E4lteresistenz, Richtungssinn, Z\u00E4her Hund\n\nTypische Nachteile: Hitzeempfindlich, Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Orks, Goblins, Al\u2019Anfaner und Norbarden), Schlechte Eigenschaften (Aberglaube)\n\nUntypische Vorteile: Hitzeresistenz\n\nUntypische Nachteile: keine\n\nTypische Talente: F\u00E4hrtensuchen, Holzbearbeitung, Lebensmittelbearbeitung, Orientierung, Pflanzenkunde, Wildnisleben, Zechen\n\nUntypische Talente: Fliegen, Gassenwissen\n\n\nKulturpaket Bornl\u00E4nder (18 AP)\n\nF\u00E4hrtensuchen +1, Holzbearbeitung +2, Lebensmittelbearbeitung +1, Orientierung +1, Pflanzenkunde +1, Wildnisleben +1, Zechen +2\n\n\n\nPublikation: Regelwerk Seite 99");
				infoKultur.put("Fjarninger (33 AP)", "FJARNINGER\n\n\n\nSprache: Fjarningsch (je nach Stamm)\n\nSchrift: keine\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Dorf und angrenzendes Gebiet)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: H\u00E4ndler (vor allem Tauschh\u00E4ndler), Heiler, J\u00E4ger, S\u00F6ldner, Stammeskrieger\n\n#Zaubererprofession: \u2013\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Entfernungssinn, K\u00E4lteresistenz, Richtungssinn, Verbesserte Regeneration (Lebensenergie), Z\u00E4her Hund\n\nTypische Nachteile: Angst vor \u2026 (dem Meer), Blutrausch, Hitzeempfindlich, Schlechte Eigenschaften (Aberglaube, J\u00E4hzorn), Unf\u00E4hig in Gesellschaftstalenten\n\nUntypische Vorteile: Hitzeresistenz, Soziale Anpassungsf\u00E4higkeit, Unscheinbar\n\nUntypische Nachteile: Angst vor \u2026 (Dunkelheit, engen R\u00E4umen oder H\u00F6he), Fettleibig, K\u00E4lteempfindlich, Krankheitsanf\u00E4llig, Nachtblind, Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit), Zerbrechlich\n\nTypische Talente: Einsch\u00FCchtern, F\u00E4hrtensuchen, Holzbearbeitung, Klettern, K\u00F6rperbeherrschung, Kraftakt, Metallbearbeitung, Orientierung, Selbstbeherrschung, Steinbearbeitung, Tierkunde, Wildnisleben\n\nUntypische Talente: Bet\u00F6ren, Boote & Schiffe, Etikette, Fahrzeuge, Fliegen, Gassenwissen, Reiten, Schl\u00F6sserknacken\n\n\nKulturpaket Fjarninger (33 AP)\n\nEinsch\u00FCchtern +2, F\u00E4hrtensuchen +1, K\u00F6rperbeherrschung +1, Kraftakt +2, Metallbearbeitung +1, Orientierung +2, Selbstbeherrschung +1, Steinbearbeitung +1, Wildnisleben +2\n\n \n\nPublikation: Regelwerk Seite 100");
				infoKultur.put("Horasier (27 AP)", "HORASIER\n\n\n\nSprache: Garethi (Horathi)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Belhanka, Bethana, Grangor, Kuslik, Methumis, Neetha, Vinsalt)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Eitelkeit, Vorurteile \u2013 vor allem gegen Nichthorasier)\n\nUntypische Vorteile: Begabung in Naturtalenten\n\nUntypische Nachteile: Angst vor \u2026 (engen R\u00E4umen)\n\nTypische Talente: Bet\u00F6ren, Boote & Schiffe, Etikette, Fahrzeuge, Gassenwissen, Geographie, Geschichtswissen, Handel, Magiekunde, Mechanik, Rechnen, Rechtskunde, Tanzen\n\nUntypische Talente: F\u00E4hrtensuchen, Fliegen, Pflanzenkunde, Tierkunde, Wildnisleben\n\n\nKulturpaket Horasier (27 AP)\n\nBet\u00F6ren +1, Boote & Schiffe +1, Etikette +2, Gassenwissen +2, Geographie +1, Geschichtswissen +1, Handel +1, Mechanik +1, Rechnen +2, Rechtskunde +2, Tanzen +1\n\n \n\nPublikation: Regelwerk Seite 101");
				infoKultur.put("Maraskaner (26 AP)", "MARASKANER\n\n\n\nSprache: Garethi (Maraskani) oder Tulamidya (Maraskani-Tulamidya)\n\nSchrift: Kusliker Zeichen oder Tulamidya (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Boran, Jergan, Sinoda, Tuzak)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Giftresistenz, Hitzeresistenz, Krankheitsresistenz, Richtungssinn, Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Mittelreicher), Schlechte Eigenschaften (Neugier)\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Angst vor \u2026 (Insekten), Farbenblind, Schlechte Eigenschaften (J\u00E4hzorn)\n\nTypische Talente: G\u00F6tter & Kulte, Heilkunde Gift, Orientierung, Pflanzenkunde, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente: Fahrzeuge, Fliegen\n\n\nKulturpaket Maraskaner (26 AP)\n\nG\u00F6tter & Kulte +1, Heilkunde Gift +2, Orientierung +1, Pflanzenkunde +2, Tierkunde +2, Verbergen +1, Wildnisleben +1\n\n \n\nPublikation: Regelwerk Seite 102");
				infoKultur.put("Mhanadistani (28 AP)", "MHANADISTANI\n\n\n\nSprache: Tulamidya (Mhanadisch-Balashidisch)\n\nSchrift: Tulamidya (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Fasar, Khunchom, Rashdul, Thalusa)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe (vor allem Katzenhexen), Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Gl\u00FCck, Hitzeresistenz, Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit, Vorurteile \u2013 vor allem gegen Novadis, Mittelreicher, Aranier, Frauen und Maraskaner), Schlechte Eigenschaften (Aberglaube, Goldgier, Neugier)\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Angst vor \u2026 (engen R\u00E4umen, Menschenmassen)\n\nTypische Talente: Brett- & Gl\u00FCcksspiel, Gassenwissen, Geschichtswissen, G\u00F6tter & Kulte, Handel, Magiekunde, Reiten, Sagen & Legenden, Sternkunde, Taschendiebstahl, \u00DCberreden\n\nUntypische Talente: Fahrzeuge\n\n\nKulturpaket Mhanadistani (28 AP)\n\nBrett- & Gl\u00FCcksspiel +2, Gassenwissen +2, Geschichtswissen +1, G\u00F6tter & Kulte +2, Handel +2, Magiekunde +1, Sagen & Legenden +2, \u00DCberreden +1\n\n \n\nPublikation: Regelwerk Seite 103");
				infoKultur.put("Mittelreicher (12 AP)", "MITTELREICHER\n\n\n\nSprache: Garethi (je nach Provinz)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Angbar, Elenvina, Gareth, Greifenfurt, Havena, Punin)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Stammeskrieger, Gladiator sehr selten\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Gl\u00FCck\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Andersgl\u00E4ubige, Elfen, Orks, Goblins und Nichtmittelreicher), Schlechte Eigenschaften (Aberglaube)\n\nUntypische Vorteile: Hitzeresistenz, K\u00E4lteresistenz\n\nUntypische Nachteile: keine\n\nTypische Talente: Holzbearbeitung, Metallbearbeitung, Pflanzenkunde, Stoffbearbeitung, Tierkunde\n\nUntypische Talente: Fliegen\n\n\nKulturpaket Mittelreich (12 AP)\n\nHolzbearbeitung +1, Metallbearbeitung +1, Pflanzenkunde +1, Stoffbearbeitung +1, Tierkunde +1\n\n \n\nPublikation: Regelwerk Seite 105");
				infoKultur.put("Mohas (38 AP)", "MOHAS\n\n\n\nSprache: Mohisch (je nach Stamm)\n\nSchrift: keine\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Dorf und angrenzendes Gebiet)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: H\u00E4ndler (vor allem Tauschh\u00E4ndler), Heiler, J\u00E4ger (vor allem Stammesj\u00E4ger), S\u00F6ldner, Stammeskrieger\n\n#Zaubererprofession: \u2013\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Giftresistenz, Gl\u00FCck, Gutaussehend, Hitzeresistenz, Richtungssinn, Schlangenmensch\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen, dem Meer und Toten und Untoten), K\u00E4lteempfindlich, Niedrige Seelenkraft, Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Nichtmohas), Schlechte Eigenschaften (Aberglaube, Neugier)\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Angst vor \u2026 (H\u00F6he, Insekten, Reptilien oder Spinnen), Krankheitsanf\u00E4llig, Nachtblind, Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit), Schlechte Eigenschaften (Goldgier), Unf\u00E4hig in Naturtalenten\n\nTypische Talente: F\u00E4hrtensuchen, Heilkunde Gift, Heilkunde Krankheiten, Klettern, K\u00F6rperbeherrschung, Orientierung, Pflanzenkunde, Sagen & Legenden, Sinnessch\u00E4rfe, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente: Etikette, Fahrzeuge, Fliegen, Gassenwissen, Geographie, Geschichtswissen, Metallbearbeitung, Reiten, Schl\u00F6sserknacken, Zechen\n\n\nKulturpaket Mohas (38 AP)\n\nF\u00E4hrtensuchen +1, Heilkunde Gift +1, K\u00F6rperbeherrschung +1, Orientierung +1, Pflanzenkunde +2, Sagen & Legenden +1, Sinnessch\u00E4rfe +1, Tierkunde +2, Verbergen +1, Wildnisleben +2\n\n \n\nPublikation: Regelwerk Seite 107");
				infoKultur.put("Nivesen (37 AP)", "NIVESEN\n\n\n\nSprache: Nujuka (je nach Stamm)\n\nSchrift: keine\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Wegstrecke)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: H\u00E4ndler (vor allem Tauschh\u00E4ndler), Heiler, J\u00E4ger (vor allem Stammesj\u00E4ger), S\u00F6ldner, Stammeskrieger\n\n#Zaubererprofession: \u2013\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: K\u00E4lteresistenz, Richtungssinn\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen, H\u00F6he und Toten und Untoten)\n\nUntypische Vorteile: Hitzeresistenz, Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Fettleibig, Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz), Schlechte Eigenschaften (Goldgier)\n\nTypische Talente: F\u00E4hrtensuchen, Fahrzeuge, K\u00F6rperbeherrschung, Orientierung, Pflanzenkunde, Sagen & Legenden, Sinnessch\u00E4rfe, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente: Boote & Schiffe, Einsch\u00FCchtern, Etikette, Fliegen, Gassenwissen, Geschichtswissen, Kriegskunst, Reiten, Schl\u00F6sserknacken\n\n\nKulturpaket Nivesen (37 AP)\n\nF\u00E4hrtensuchen +2, Fahrzeuge +1, Orientierung +2, Pflanzenkunde +1, Sagen & Legenden +2, Sinnessch\u00E4rfe +1, Tierkunde +2, Verbergen +1, Wildnisleben +2\n\n \n\nPublikation: Regelwerk Seite 108");
				infoKultur.put("Norbaden (18 AP)", "NORBARDEN\n\n\n\nSprache: Alaani (Gajka, Takellen)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Wegstrecke)\n\nSozialstatus: keine\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: H\u00E4ndler, Heiler, J\u00E4ger, S\u00F6ldner, Streuner\n\n#Zaubererprofession: Hexe, Magier (selten)\n\n#Geweihtenprofession: Hesindegeweihte, Phexgeweihte\n\nTypische Vorteile: K\u00E4lteresistenz, Richtungssinn\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen oder H\u00F6he), Schlechte Eigenschaften (Goldgier, Neugier), Verpflichtungen (gegen\u00FCber der Sippe)\n\nUntypische Vorteile: Hitzeresistenz\n\nUntypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz), Prinzipientreue (jeglicher Art)\n\nTypische Talente: Fahrzeuge, Geographie, Handel, Orientierung, \u00DCberreden, Wildnisleben\n\nUntypische Talente: Boote & Schiffe, Fliegen\n\n\nKulturpaket Norbarden (18 AP)\n\nFahrzeuge +2, Geographie +2, Handel +2, Orientierung +1, \u00DCberreden +1, Wildnisleben +1\n\n \n\nPublikation: Regelwerk Seite 109");
				infoKultur.put("Nordaventurier (25 AP)", "NORDAVENTURIER\n\n\n\nSprache: Alaani, Garethi, Nujuka oder Thorwalsch\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Enqui, Oblarasim, Paavi, Riva, Uhdenberg)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Entfernungssinn, Richtungssinn, Z\u00E4her Hund\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen), Schlechte Eigenschaften (Aberglaube)\n\nUntypische Vorteile: Hitzeresistenz\n\nUntypische Nachteile: Krankheitsanf\u00E4llig\n\nTypische Talente: F\u00E4hrtensuchen, Fischen & Angeln, Handel, Holzbearbeitung, Lederbearbeitung, Orientierung, Pflanzenkunde, Selbstbeherrschung, Steinbearbeitung, Sternkunde, Tierkunde, Verbergen, Wildnisleben, Zechen\n\nUntypische Talente: Bet\u00F6ren, Fliegen, Geschichtswissen, Magiekunde, Mechanik, Rechtskunde\n\n\nKulturpaket Nordaventurier (25 AP)\n\nF\u00E4hrtensuchen +1, Handel +1, Holzbearbeitung +1, Lederbearbeitung +1, Orientierung +1, Pflanzenkunde +1, Selbstbeherrschung +1, Tierkunde +1, Wildnisleben +1, Zechen +1\n\n \n\nPublikation: Regelwerk Seite 110");
				infoKultur.put("Nostrier (15 AP)", "NOSTRIER\n\n\n\nSprache: Garethi (Nostrisch)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Nostria-Stadt, Salza, Salzerhaven)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Richtungssinn, Z\u00E4her Hund\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Andergaster, Weltfremd \u2013 vor allem gegen\u00FCber Fortschritt, Welt au\u00DFerhalb des K\u00F6nigreiches), Schlechte Eigenschaften (Aberglaube)\n\nUntypische Vorteile: Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Krankheitsanf\u00E4llig\n\nTypische Talente: Fischen & Angeln, Orientierung, Pflanzenkunde, Sagen & Legenden, Tierkunde, Wildnisleben\n\nUntypische Talente: Fliegen, Geographie, Geschichtswissen, G\u00F6tter & Kulte, Mechanik, Rechnen, Rechtskunde\n\n\nKulturpaket Nostrier (15 AP)\n\nFischen & Angeln +2, Orientierung +1, Pflanzenkunde +1, Sagen & Legenden +1, Tierkunde +1, Wildnisleben +1\n\n \n\nPublikation: Regelwerk Seite 111");
				infoKultur.put("Novadis (25 AP)", "NOVADIS\n\n\n\nSprache: Tulamidya (Kh\u00F4m-Novadisch)\n\nSchrift: Heilige Glyphen von Unau (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Keft, Mherwed, Unau)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator und Ritter\n\n#Zaubererprofession: Magier (selten)\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Entfernungssinn, Hitzeresistenz, Richtungssinn, Schwer zu verzaubern, Z\u00E4her Hund\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen und dem Meer), Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Frauen und Ungl\u00E4ubige), Prinzipientreue (99 Gesetze), Schlechte Eigenschaften (J\u00E4hzorn, Rachsucht)\n\nUntypische Vorteile: Hitzeempfindlich, K\u00E4lteresistenz\n\nUntypische Nachteile: keine\n\nTypische Talente: Einsch\u00FCchtern, F\u00E4hrtensuchen, Kriegskunst, Orientierung, Pflanzenkunde, Rechtskunde, Reiten, Sinnessch\u00E4rfe, Tierkunde, Wildnisleben\n\nUntypische Talente: Fahrzeuge, Fischen & Angeln, Magiekunde\n\n\nKulturpaket Novadis (25 AP)\n\nEinsch\u00FCchtern +2, F\u00E4hrtensuchen +1, Orientierung +2, Rechtskunde +1, Reiten +2, Tierkunde +1, Wildnisleben +2\n\n\n\nPublikation: Regelwerk Seite 113");
				infoKultur.put("Südaventurier (26 AP)", "S\u00DCDAVENTURIER\n\n\n\nSprache: Garethi (Brabaci bei der Oberschicht, Charypto bei Bukaniern, Gatamo bei der Unterschicht)\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Hitzeresistenz, Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: K\u00E4lteempfindlich, Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Eitelkeit), Schlechte Eigenschaften (Aberglaube, Goldgier, J\u00E4hzorn, Neugier)\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Angst vor \u2026 (engen R\u00E4umen, Menschenmassen und Toten und Untoten)\n\nTypische Talente: Bet\u00F6ren, Boote & Schiffe, Fischen & Angeln, Gassenwissen, Handel, Heilkunde Gift, Menschenkenntnis, Orientierung, Pflanzenkunde, \u00DCberreden, Willenskraft, Zechen\n\nUntypische Talente: Fahrzeuge, Fliegen\n\n\nKulturpaket S\u00FCdaventurier (26 AP)\n\nBet\u00F6ren +1, Boote & Schiffe +1, Fischen & Angeln +1, Gassenwissen +2, Heilkunde Gift +1, Menschenkenntnis +2, \u00DCberreden +1, Willenskraft +1\n\n \n\nPublikation: Regelwerk Seite 114");
				infoKultur.put("Svellttaler (21 AP)", "SVELLTTALER\n\n\n\nSprache: Garethi\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Gashok, Lowangen, Tiefhusen, Tjolmar)\n\nSozialstatus: Adel, Unfrei\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Entfernungssinn, Richtungssinn, Z\u00E4her Hund\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen), Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Orks), Schlechte Eigenschaften (Aberglaube)\n\nUntypische Vorteile: Hitzeresistenz\n\nUntypische Nachteile: Krankheitsanf\u00E4llig\n\nTypische Talente: F\u00E4hrtensuchen, Fahrzeuge, Orientierung, Pflanzenkunde, Sagen & Legenden, Tierkunde, Wildnisleben\n\nUntypische Talente: Etikette, Fliegen, Geschichtswissen\n\n\nKulturpaket Svellttaler (21 AP)\n\nF\u00E4hrtensuchen +2, Fahrzeuge +2, Orientierung +1, Pflanzenkunde +1, Sagen & Legenden +1, Tierkunde +1, Wildnisleben +1\n\n \n\nPublikation: Regelwerk Seite 115");
				infoKultur.put("Thorwaler (24 AP)", "THORWALER\n\n\n\nSprache: Thorwalsch (Dialekt der Olportsteine, Olporter-Dialekt, Premer-Dialekt, Thorwal-Dialekt, Waskirer-Dialekt)\n\nSchrift: Thorwalsche Runen oder Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Olport, Prem, Thorwal-Stadt, Waskir)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Entfernungssinn, Gl\u00FCck, Richtungssinn, Verbesserte Regeneration (Lebensenergie), Z\u00E4her Hund\n\nTypische Nachteile: Blutrausch, Pers\u00F6nlichkeitsschw\u00E4chen (Vorurteile \u2013 vor allem gegen Al\u2019Anfaner, Echsenwesen, Horasier und Walf\u00E4nger), Schlechte Eigenschaften (Aberglaube, Neugier, Rachsucht)\n\nUntypische Vorteile: Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Angst vor \u2026 (dem Meer)\n\nTypische Talente: Boote & Schiffe, Einsch\u00FCchtern, Fischen & Angeln, Geographie, Holzbearbeitung, Kraftakt, Orientierung, Sagen & Legenden, Selbstbeherrschung, Steinbearbeitung, Sternkunde, Zechen\n\nUntypische Talente: Etikette, Fliegen, Lebensmittelbearbeitung\n\n\nKulturpaket Thorwaler (24 AP)\n\nBoote & Schiffe +2, Einsch\u00FCchtern +1, Fischen & Angeln +2, Geographie +1, Holzbearbeitung +2, Kraftakt +2, Orientierung +1, Sagen & Legenden +1, Zechen +2\n\n \n\nPublikation: Regelwerk Seite 116");
				infoKultur.put("Zyklopäer (16 AP)", "ZYKLOP\u00C4ER\n\n\n\nSprache: Garethi (Horathi) oder Zyklop\u00E4isch\n\nSchrift: Kusliker Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Rethis, Teremon)\n\nSozialstatus: Adel\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Ritter und Stammeskrieger\n\n#Zaubererprofession: Hexe, Magier\n\n#Geweihtenprofession: Borongeweihte, Hesindegeweihte, Perainegeweihte, Phexgeweihte, Praiosgeweihte, Rondrageweihte\n\nTypische Vorteile: Begabung in Schwimmen, Entfernungssinn, Gutaussehend, Richtungssinn, Wohlklang\n\nTypische Nachteile: Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Eitelkeit, Vorurteile \u2013 vor allem gegen Thorwaler)\n\nUntypische Vorteile: K\u00E4lteresistenz\n\nUntypische Nachteile: Angst vor \u2026 (dem Meer)\n\nTypische Talente: Boote & Schiffe, F\u00E4hrtensuchen, Fischen & Angeln, Geschichtswissen, G\u00F6tter & Kulte, Klettern, Mechanik, Musizieren, Orientierung, Pflanzenkunde, Rechnen, Rechtskunde, Sagen & Legenden, Sternkunde, Stoffbearbeitung, Tanzen, Tierkunde, Wildnisleben\n\nUntypische Talente: Fahrzeuge, Menschenkenntnis, Reiten\n\n\nKulturpaket Zyklop\u00E4er (16 AP)\n\nBoote & Schiffe +1, Fischen & Angeln +2, Geschichtswissen +1, G\u00F6tter & Kulte +2, Musizieren +1, Rechnen +1, Rechtskunde +1, Sagen & Legenden +1, Tanzen +1\n\n \n\nPublikation: Regelwerk Seite 117");			
				infoKultur.put("Auelfen (43 AP)", "AUELFEN\n\n\n\nSprache: Isdira (auelfischer Dialekt)\n\nSchrift: Isdira-Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Dorf und angrenzendes Gebiet)\n\nSozialstatus: keine\n\n\u00DCbliche Profession: Wildnisl\u00E4ufer, Zauberweber\n\nTypische Vorteile: Begabung in Handwerkstalenten (vor allem Boote & Schiffe), Magische Einstimmung (Wesen der Auen), Waffenbegabung (vor allem B\u00F6gen)\n\nTypische Nachteile: Artefaktgebunden (Instrument), Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Nichtelfen, Weltfremd \u2013 vor allem gegen\u00FCber Besitz, G\u00F6tter), Prinzipientreue (Elfische Weltsicht), Schlechte Eigenschaften (Neugier)\n\nUntypische Vorteile: Begabung in Wissenstalenten\n\nUntypische Nachteile: Schlechte Eigenschaften (Goldgier, Rachsucht), Unf\u00E4hig in K\u00F6rper- und Naturtalenten\n\nTypische Talente: Bet\u00F6ren, Boote & Schiffe, F\u00E4hrtensuchen, Fischen & Angeln, K\u00F6rperbeherrschung, Musizieren, Orientierung, Pflanzenkunde, Schwimmen, Singen, Sinnessch\u00E4rfe, Tanzen, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente: Alchimie, Brett- & Gl\u00FCcksspiel, Fahrzeuge, Rechtskunde, Schl\u00F6sserknacken, Zechen\n\n\nKulturpaket Auelfen (43 AP)\n\nBet\u00F6ren +1, Boote & Schiffe +1, F\u00E4hrtensuchen +1, Fischen & Angeln +2, K\u00F6rperbeherrschung +2, Musizieren +2, Orientierung +1, Pflanzenkunde +1, Schwimmen +2, Singen +2, Sinnessch\u00E4rfe +1, Tierkunde +1, Verbergen +1, Wildnisleben +1\n\n\n\nPublikation: Regelwerk Seite 118");
				infoKultur.put("Firnelfen (55 AP)", "FIRNELFEN\n\n\n\nSprache: Isdira (firnelfischer Dialekt)\n\nSchrift: Isdira-Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Dorf und angrenzendes Gebiet)\n\nSozialstatus: keine\n\n\u00DCbliche Profession: Wildnisl\u00E4ufer, Zauberweber\n\nTypische Vorteile: Begabung in K\u00F6rper- und Naturtalenten, K\u00E4lteresistenz, Magische Einstimmung (Wesen des Eises), Richtungssinn, Waffenbegabung\u00B4(vor allem B\u00F6gen und Wurfwaffen)\n\nTypische Nachteile: Artefaktgebunden (Instrument), Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Nichtelfen, Weltfremd \u2013 vor allem gegen\u00FCber Adel, Besitz, Geld, G\u00F6tter, Hierarchien, Religion), Prinzipientreue (Elfische Weltsicht), Unf\u00E4hig in Wissenstalenten\n\nUntypische Vorteile: Begabung in Wissenstalenten, Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Angst vor \u2026 (Dunkelheit, engen R\u00E4umen), K\u00E4lteempfindlich, Schlechte Eigenschaften (Goldgier, Rachsucht), Unf\u00E4hig in K\u00F6rper- und Naturtalenten\n\nTypische Talente: F\u00E4hrtensuchen, Fesseln, Fischen & Angeln, Klettern, K\u00F6rperbeherrschung, Musizieren, Orientierung, Pflanzenkunde, Selbstbeherrschung, Singen, Sinnessch\u00E4rfe, Tanzen, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente: Alchimie, Brett- & Gl\u00FCcksspiel, Fahrzeuge, Fliegen, Rechtskunde, Schl\u00F6sserknacken, Zechen\n\n\nKulturpaket Firnelfen (55 AP)\n\nF\u00E4hrtensuchen +2, Fischen & Angeln +1, Klettern +1, K\u00F6rperbeherrschung +2, Musizieren +2, Orientierung +2, Selbstbeherrschung +1, Singen +2, Sinnessch\u00E4rfe +2, Tierkunde +2, Verbergen +2, Wildnisleben +2\n\n\n\nPublikation: Regelwerk Seite 119");
				infoKultur.put("Waldelfen (47 AP)", "WALDELFEN\n\n\n\nSprache: Isdira (waldelfischer Dialekt)\n\nSchrift: Isdira-Zeichen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Dorf und angrenzendes Gebiet)\n\nSozialstatus: keine\n\n\u00DCbliche Profession: Wildnisl\u00E4ufer, Zauberweber\n\nTypische Vorteile: Begabung in K\u00F6rper- und Naturtalenten, Magische Einstimmung (Wesen des Waldes), Waffenbegabung (vor allem B\u00F6gen)\n\nTypische Nachteile: Angst vor \u2026 (engen R\u00E4umen), Artefaktgebunden (Instrument), K\u00F6rpergebundene Kraft, Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Nichtelfen, Weltfremd \u2013 vor allem gegen\u00FCber Adel, Besitz, Geld, G\u00F6tter, Hierarchien, Religion), Prinzipientreue (Elfische Weltsicht), Unf\u00E4hig in Wissenstalenten\n\nUntypische Vorteile: Begabung in Wissenstalenten, Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Schlechte Eigenschaften (Goldgier, J\u00E4hzorn, Rachsucht), Unf\u00E4hig in K\u00F6rper- und Naturtalenten\n\nTypische Talente: F\u00E4hrtensuchen, Klettern, K\u00F6rperbeherrschung, Magiekunde, Musizieren, Orientierung, Pflanzenkunde, Singen, Sinnessch\u00E4rfe, Tanzen, Tierkunde, Verbergen, Wildnisleben\n\nUntypische Talente Alchimie, Boote & Schiffe, Brett- & Gl\u00FCcksspiel, Fahrzeuge, Rechtskunde, Schl\u00F6sserknacken, Zechen\n\n\nKulturpaket Waldelfen (47 AP)\n\nF\u00E4hrtensuchen +2, Klettern +1, K\u00F6rperbeherrschung +2, Musizieren +2, Orientierung +1, Pflanzenkunde +2, Singen +2, Sinnessch\u00E4rfe +1, Tierkunde +2, Verbergen +2, Wildnisleben +1\n\n\n\nPublikation: Regelwerk Seite 120");
				infoKultur.put("Ambosszwerge (31 AP)", "AMBOSSZWERGE\n\n\n\nSprache: Rogolan (ambosszwergischer Dialekt)\n\nSchrift: Rogolan-Runen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Zwergenstadt und angrenzende Stollen)\n\nSozialstatus: keine\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Magier (sehr selten)\n\n#Geweihtenprofession: Rondrageweihter (selten)\n\nTypische Vorteile: Begabung in Handwerkstalenten (vor allem Metallbearbeitung und Steinbearbeitung), Verbesserte Regeneration (Lebensenergie), Waffenbegabung (vor allem Armbr\u00FCste, Hiebwaffen und Zweihandhiebwaffen), Z\u00E4her Hund\n\nTypische Nachteile: Angst vor \u2026 (dem Meer), Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Elfen und Echsen), Prinzipientreue (zwergischer Ehrenkodex), Schlechte Eigenschaften (Geiz, Goldgier)\n\nUntypische Vorteile: Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Angst vor \u2026 (Dunkelheit oder engen R\u00E4umen), Nachtblind, Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit)\n\nTypische Talente: Einsch\u00FCchtern, Geschichtswissen, Kraftakt, Kriegskunst, Mechanik, Metallbearbeitung, Orientierung, Rechnen, Sagen & Legenden, Selbstbeherrschung, Steinbearbeitung, Verbergen, Zechen\n\nUntypische Talente: Bet\u00F6ren, Boote & Schiffe, Fischen & Angeln, Fliegen, Reiten, Schwimmen, Sternkunde\n\n\nKulturpaket Ambosszwerge (31 AP)\n\nEinsch\u00FCchtern +1, Geschichtswissen +1, Kraftakt +2, Kriegskunst +2, Mechanik +1, Metallbearbeitung +2, Orientierung +1, Sagen & Legenden +1, Steinbearbeitung +2, Verbergen +1, Zechen +2\n\n\n\nPublikation: Regelwerk Seite 121");
				infoKultur.put("Brillantzwerge (29 AP)", "BRILLANTZWERGE\n\n\n\nSprache: Rogolan (brillantzwergischer Dialekt)\n\nSchrift: Rogolan-Runen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Zwergenstadt und angrenzende Stollen)\n\nSozialstatus: keine\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Magier (sehr selten)\n\n#Geweihtenprofession: Hesindegeweihter (selten), Phexgeweihter (selten), Rondrageweihter (selten)\n\nTypische Vorteile: Begabung in Handwerkstalenten (vor allem Metallbearbeitung und Steinbearbeitung), Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: Angst vor \u2026 (dem Meer), Pers\u00F6nlichkeitsschw\u00E4chen (Eitelkeit), Schlechte Eigenschaften (Geiz, Goldgier, Neugier)\n\nUntypische Vorteile: keine\n\nUntypische Nachteile: Angst vor \u2026 (engen R\u00E4umen), Blutrausch, Nachtblind\n\nTypische Talente: Bet\u00F6ren, Geographie, Geschichtswissen, Malen & Zeichnen, Mechanik, Metallbearbeitung,Musizieren, Orientierung, Rechnen, Sagen & Legenden, Schl\u00F6sserknacken, Steinbearbeitung, Tanzen, Tierkunde, Verbergen, Zechen\n\nUntypische Talente: Boote & Schiffe, Fliegen, Schwimmen\n\n\nKulturpaket Brillantzwerge (29 AP)\n\nBet\u00F6ren +1, Geographie +2, Geschichtswissen +1, Metallbearbeitung +1, Musizieren +1, Sagen & Legenden +1, Schl\u00F6sserknacken +2, Steinbearbeitung +1, Tanzen +1, Verbergen +2, Zechen +1\n\n\n\nPublikation: Regelwerk Seite 122");
				infoKultur.put("Erzzwerge (34 AP)", "ERZZWERGE\n\n\n\nSprache: Rogolan (erzzwergischer Dialekt)\n\nSchrift: Rogolan-Runen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Zwergenstadt und angrenzende Stollen)\n\nSozialstatus: keine\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Magier (sehr selten)\n\n#Geweihtenprofession: \u2013\n\nTypische Vorteile: Begabung in Wissens- oder Handwerkstalenten (vor allem Geschichtswissen, Rechtskunde, Metallbearbeitung und Steinbearbeitung)\n\nTypische Nachteile: Angst vor \u2026 (H\u00F6he oder dem Meer), Pers\u00F6nlichkeitsschw\u00E4chen (Arroganz, Vorurteile \u2013 vor allem gegen Nichtzwerge), Schlechte Eigenschaften (Geiz, Goldgier)\n\nUntypische Vorteile: Soziale Anpassungsf\u00E4higkeit\n\nUntypische Nachteile: Angst vor \u2026 (Dunkelheit, engen R\u00E4umen), Nachtblind, Schlechte Eigenschaften (Neugier)\n\nTypische Talente: Geschichtswissen, G\u00F6tter & Kulte, Mechanik, Metallbearbeitung, Orientierung, Rechnen, Rechtskunde, Sagen & Legenden, Selbstbeherrschung, Steinbearbeitung, Verbergen, Zechen\n\nUntypische Talente: Bet\u00F6ren, Boote & Schiffe, Fahrzeuge, Fischen & Angeln, Fliegen, Gaukeleien, Reiten, Schwimmen\n\n\nKulturpaket Erzzwerge (34 AP)\n\nGeschichtswissen +2, G\u00F6tter & Kulte +2, Mechanik +2, Metallbearbeitung +1, Rechnen +2, Rechtskunde +1, Sagen & Legenden +2, Selbstbeherrschung +1, Steinbearbeitung +1, Verbergen +2, Zechen +1\n\n\n\nPublikation: Regelwerk Seite 123");
				infoKultur.put("Hügelzwerge (13 AP)", "H\u00DCGELZWERGE\n\n\n\nSprache: Rogolan (h\u00FCgelzwergischer Dialekt)\n\nSchrift: Rogolan-Runen (2 AP)\n\nOrtskenntnis: je nach Heimatort (z.\u2009B. Angbar)\n\nSozialstatus: keine\n\n\u00DCbliche Professionen:\n\n#Weltliche Profession: alle au\u00DFer Gladiator, Ritter und Stammeskrieger\n\n#Zaubererprofession: Magier (selten)\n\n#Geweihtenprofession: Perainegeweihter (selten)\n\nTypische Vorteile: Begabung in Gesellschafts- und Handwerkstalenten (Lebensmittelbearbeitung), Soziale Anpassungsf\u00E4higkeit\n\nTypische Nachteile: Angst vor \u2026 (dem Meer), Schlechte Eigenschaften (Goldgier, Neugier)\n\nUntypische Vorteile: keine\n\nUntypische Nachteile: Angst vor \u2026 (Dunkelheit oder engen R\u00E4umen), Blutrausch, Nachtblind\n\nTypische Talente: Etikette, Fahrzeuge, Fischen & Angeln, Lebensmittelbearbeitung, Singen, Tanzen, Verbergen, Zechen\n\nUntypische Talente: Einsch\u00FCchtern, Fliegen, Reiten, Wildnisleben\n\n\nKulturpaket H\u00FCgelzwerge (13 AP)\n\nFahrzeuge +1, Fischen & Angeln +1, Lebensmittelbearbeitung +2, Singen +1, Tanzen +1, Verbergen +2, Zechen +1\n\n\n\nPublikation: Regelwerk Seite 125");
				txtrInfo.setText(infoKultur.get(lKultur.getSelectedValue()));
				txtrInfo.setCaretPosition(0);
				panel.setVisible(true);
				btnWeiter.setEnabled(true);
				if (lKultur.getSelectedIndex() == -1) {
					txtrInfo.setText(null);
					panel.setVisible(false);
					btnWeiter.setEnabled(false);
				}
			}
		});
		
		lRasse.addListSelectionListener(new ListSelectionListener() {
			public void valueChanged(ListSelectionEvent arg0) {
				int n = lRasse.getSelectedIndex();
				switch (n){
				case -1: txtrInfo.setText(null);
				panel_4.setVisible(false);
				btnWeiter.setEnabled(false);
				break;
				case 0: txtrInfo.setText("ELF\r\n\r\n\r\nAP-Wert: 18 Abenteuerpunkte\r\n\r\nLebensenergie-Grundwert: 2\r\n\r\nSeelenkraft-Grundwert: \u20134\r\n\r\nZ\u00E4higkeit-Grundwert: \u20136\r\n\r\nGeschwindigkeit-Grundwert: 8\r\n\r\nEigenschafts\u00E4nderungen: IN und GE +1; KL oder KK \u20132\r\n\r\n\u00DCbliche Kulturen: Auelfen, Firnelfen, Waldelfen\r\n\r\nAutomatischer Vorteil: Zauberer, Zweistimmiger Gesang\r\n\r\nDringend empfohlene Vor- und Nachteile: Altersresistenz, Dunkelsicht I, Nichtschl\u00E4fer, Sensibler Geruchssinn, Unf\u00E4hig (Zechen)\r\n\r\nVerbrauchte AP f\u00FCr Vorteile/Nachteile: Vorteile: 53 AP, Nachteile 11 AP\r\n\r\nTypische Vorteile: Begabung (Singen, Musizieren), Beidh\u00E4ndig, Dunkelsicht II, Flink, Giftresistenz, Gutaussehend, Herausragender Sinn (Geh\u00F6r oder Sicht), Immunit\u00E4t gegen (Schwarze Wut, Tollwut, Lykanthropie), Krankheitsresistenz, Richtungssinn, Schlangenmensch, Verbesserte Regeneration (Astralenergie), Wohlklang\r\n\r\nTypische Nachteile: K\u00F6rpergebundene Kraft, L\u00E4stige Mindergeister, Wahrer Name\r\n\r\nUntypische Vorteile: Hitzeresistenz, Schwer zu verzaubern, Zwergennase\r\n\r\nUntypische Nachteile: Blutrausch, Eingeschr\u00E4nkter Sinn, Fettleibig, Nachtblind\r\n\r\nAnmerkung: Als Wesen, dass automatisch \u00FCber den Vorteil Zauberer verf\u00FCgt, besitzt ein Elf 20 AsP.\r\n\r\n\r\n\r\nPublikation: Regelwerk Seite 90");
				txtrInfo.setCaretPosition(0);
				btnWeiter.setEnabled(true);
				rdbtn3.setVisible(false);
				rdbtn4.setVisible(false);
				rdbtn5.setVisible(false);
				rdbtn6.setVisible(false);
				rdbtn7.setVisible(false);
				rdbtn8.setVisible(false);
				rdbtn1.setText("- 2 KL");
				rdbtn2.setText("- 2 KK");
				panel_4.setVisible(true);
				break;
				case 1: txtrInfo.setText("HALBELF\r\n\r\n\r\nAP-Wert: 0 Abenteuerpunkte\r\n\r\nLebensenergie-Grundwert: 5\r\n\r\nSeelenkraft-Grundwert: \u20134\r\n\r\nZ\u00E4higkeit-Grundwert: \u20136\r\n\r\nGeschwindigkeit-Grundwert: 8\r\n\r\nEigenschafts\u00E4nderungen: eine beliebige Eigenschaft nach Wahl +1\r\n\r\n\u00DCbliche Kulturen: Andergaster, Auelfen, Bornl\u00E4nder, Firnelfen, Horasier, Mittelreicher, Nivesen, Nordaventurier, Nostrier, Svellttaler, Thorwaler, Waldelfen\r\n\r\nTypische Vorteile: Begabung (Singen, Musizieren), Beidh\u00E4ndig, Dunkelsicht I, Flink, Gutaussehend, Herausragender Sinn (Geh\u00F6r oder Sicht), Schlangenmensch, Wohlklang, Zauberer, Zweistimmiger Gesang\r\n\r\nTypische Nachteile: Sensibler Geruchssinn, Wahrer Name\r\n\r\nUntypische Vorteile: Schwer zu verzaubern, Zwergennase\r\n\r\nUntypische Nachteile: Blutrausch, Fettleibig, Krankheitsanf\u00E4llig\r\n\r\n\r\n\r\nPublikation: Regelwerk Seite 92");
				txtrInfo.setCaretPosition(0);
				btnWeiter.setEnabled(true);
				rdbtn3.setVisible(true);
				rdbtn4.setVisible(true);
				rdbtn5.setVisible(true);
				rdbtn6.setVisible(true);
				rdbtn7.setVisible(true);
				rdbtn8.setVisible(true);
				rdbtn1.setText("+ 1 MU");
				rdbtn2.setText("+ 1 KL");
				panel_4.setVisible(true);
				break;
				case 2:
				case 3:
				case 4:
				case 5:
				case 6:
				case 7:
				case 8: txtrInfo.setText("MENSCH\r\n\r\n\r\nAP-Wert: 0 Abenteuerpunkte\r\n\r\nLebensenergie-Grundwert: 5\r\n\r\nSeelenkraft-Grundwert: \u20135\r\n\r\nZ\u00E4higkeit-Grundwert: \u20135\r\n\r\nGeschwindigkeit-Grundwert: 8\r\n\r\nEigenschafts\u00E4nderungen: eine beliebige Eigenschaft nach Wahl +1\r\n\r\n\u00DCbliche Kulturen:\r\n\n#Mittell\u00E4nder: Andergaster, Bornl\u00E4nder, Horasier, Maraskaner, Mittelreicher, Nordaventurier, Nostrier, S\u00FCdaventurier, Svellttaler, Zyklop\u00E4er\r\n\n#Nivesen: Bornl\u00E4nder, Nivesen, Nordaventurier, Svellttaler\r\n\n#Norbarden: Bornl\u00E4nder, Norbarden, Nordaventurier\r\n\n#Thorwaler: Fjarninger, Nordaventurier, Thorwaler\r\n\n#Tulamiden: Aranier, Maraskaner, Mhanadistani, Novadis, S\u00FCdaventurier\r\n\n#Waldmenschen: Aranier, Mhanadistani, Mohas, Novadis, S\u00FCdaventurier\r\n\n#Utulus: Aranier, Mhanadistani, Mohas, Novadis, S\u00FCdaventurier\r\n\r\n\r\nTypische Vorteile:\r\n\n#Nivesen: Entfernungssinn, K\u00E4lteresistenz\r\n\n#Thorwaler: Hohe Z\u00E4higkeit, Z\u00E4her Hund\r\n\n#Tulamiden: Hitzeresistenz\r\n\n#Waldmenschen und Utulus: Angenehmer Geruch, Hitzeresistenz, Immunit\u00E4t gegen Wurara, Immunit\u00E4t gegen Flinken Difar und Brabaker Schwei\u00DF\r\n\r\nTypische Nachteile:\r\n\n#Nivesen: Hitzeempfindlich\r\n\n#Thorwaler: Blutrausch, Niedrige Seelenkraft\r\n\n#Tulamiden, Waldmenschen, Utulus: K\u00E4lteempfindlich\r\n\r\nUntypische Vorteile: keine\r\n\r\nUntypische Nachteile: keine\r\n\r\n\r\n\r\nPublikation: Regelwerk Seite 88");
				txtrInfo.setCaretPosition(0);
				btnWeiter.setEnabled(true);
				rdbtn3.setVisible(true);
				rdbtn4.setVisible(true);
				rdbtn5.setVisible(true);
				rdbtn6.setVisible(true);
				rdbtn7.setVisible(true);
				rdbtn8.setVisible(true);
				rdbtn1.setText("+ 1 MU");
				rdbtn2.setText("+ 1 KL");
				panel_4.setVisible(true);
				break;
				case 9: txtrInfo.setText("ZWERG\r\n\r\n\r\nAP-Wert: 61 Abenteuerpunkte\r\n\r\nLebensenergie-Grundwert: 8\r\n\r\nSeelenkraft-Grundwert: \u20134\r\n\r\nZ\u00E4higkeit-Grundwert: \u20134\r\n\r\nGeschwindigkeit-Grundwert: 6\r\n\r\nEigenschafts\u00E4nderungen: KO und KK +1; CH oder GE \u20132\r\n\r\nDringend empfohlene Vor- und Nachteile: Dunkelsicht I, Immunit\u00E4t gegen Tulmadron, Unf\u00E4hig (Schwimmen)\r\n\r\nVerbrauchte AP f\u00FCr Vorteile/Nachteile: Vorteile: 12 AP, Nachteile 2 AP\r\n\r\n\u00DCbliche Kulturen: Ambosszwerge, Brillantzwerge, Erzzwerge, H\u00FCgelzwerge\r\n\r\nTypische Vorteile: Dunkelsicht II, Hitzeresistenz, Hohe Z\u00E4higkeit, Krankheitsresistenz, Richtungssinn, Schwer zu verzaubern, Z\u00E4her Hund, Zwergennase\r\n\r\nTypische Nachteile: Blutrausch\r\n\r\nUntypische Vorteile: Schlangenmensch, Wohlklang, Zauberer\r\n\r\nUntypische Nachteile: Hitzeempfindlich, Nachtblind, Niedrige Seelenkraft, Niedrige Z\u00E4higkeit, Zerbrechlich\r\n\r\n\r\n\r\nPublikation: Regelwerk Seite 93");
				txtrInfo.setCaretPosition(0);
				btnWeiter.setEnabled(true);
				rdbtn3.setVisible(false);
				rdbtn4.setVisible(false);
				rdbtn5.setVisible(false);
				rdbtn6.setVisible(false);
				rdbtn7.setVisible(false);
				rdbtn8.setVisible(false);
				rdbtn1.setText("- 2 CH");
				rdbtn2.setText("- 2 GE");
				panel_4.setVisible(true);
				break;
				}
			}
		});
	}
}
