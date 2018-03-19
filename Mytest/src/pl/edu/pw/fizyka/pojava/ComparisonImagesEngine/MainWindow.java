package pl.edu.pw.fizyka.pojava.ComparisonImagesEngine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class MainWindow extends JFrame {

	int fontSize=12;//rozmiar czcionki patientsTextField
	Photo photo;
	JFrame helpFrame;
	JLabel helpDescription;
	Languages language=new Languages();
	JPanel plotPanel=new JPanel();
	JPanel optionsPanel=new JPanel();
	JPanel loadingFilesPanel=new JPanel();
	JPanel errorAnalysisPanel=new JPanel();
	JPanel statisticalAnalysisPanel=new JPanel();
	JPanel patientsPanel1=new JPanel();
	JPanel patientsPanel2=new JPanel();
	JPanel helpPanel=new JPanel();
	JPanel exitPanel=new JPanel();
	JButton loadingFilesButton;
	JButton errorAnalysisButton;
	JButton statisticalAnalysisButton;
	JTextField patientsTextField;
	JComboBox<String> patientsList;
	JButton helpButton;
	JButton exitButton;
	int languageValue;

	
	
	
	
	
	class Help extends JFrame {// Klasa zainteresowana przetwarzaniem zdarzenia okna implementuje ten interfejs (i wszystkie zawarte w nim metody) 

		WindowListener helpWindowListener = new WindowListener() {

			@Override
			public void windowActivated(WindowEvent arg0) {}
			@Override
			public void windowClosed(WindowEvent arg0) {}
			@Override
			public void windowClosing(WindowEvent arg0) {//Wywoływane, gdy użytkownik próbuje zamknąć okno z menu systemu okna.
				
				helpFrame = null;
			}

			@Override
			public void windowDeactivated(WindowEvent arg0) {}
			@Override
			public void windowDeiconified(WindowEvent arg0) {}
			@Override
			public void windowIconified(WindowEvent arg0) {}
			@Override
			public void windowOpened(WindowEvent arg0) {}
		};

		public Help() {

			setSize(700, 310);
			setDefaultCloseOperation(DISPOSE_ON_CLOSE);
			helpDescription = new JLabel(language.languageStrings[languageValue][6]);
			add(helpDescription);
			addWindowListener(helpWindowListener);//obiekt detektora utworzony na podstawie tej klasy jest następnie rejestrowany za pomocą okna za pomocą metody addWindowListener okna.
		}
	}
	
	ActionListener showHelpListener = new ActionListener() {// wyświetla okienko z pomocą

		@Override
		public void actionPerformed(ActionEvent arg0) {

			if (helpFrame == null) {
				helpFrame = new Help();
				helpFrame.setVisible(true);
				helpFrame.setLocationRelativeTo(null);
				helpFrame.setTitle(language.languageStrings[languageValue][9]);
			}
		}

	};
	
	
	
	
	

	public MainWindow(int languageValue) throws HeadlessException {
		photo=new Photo();
		photo.window=this;
		setSize(1000, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		this.languageValue = languageValue;
		this.setTitle(language.languageStrings[languageValue][8]);
		
		
		loadingFilesButton=new JButton(language.languageStrings[languageValue][0]);
		errorAnalysisButton=new JButton(language.languageStrings[languageValue][1]);
		statisticalAnalysisButton=new JButton(language.languageStrings[languageValue][2]);
		patientsTextField=new JTextField(language.languageStrings[languageValue][3]);
		patientsTextField.setFont(new Font(language.languageStrings[languageValue][3], Font.ITALIC, 18));
		patientsTextField.setHorizontalAlignment(SwingConstants.CENTER);
		patientsList=new JComboBox<>();
		patientsList.addItem("Joanna Gajewska");
		patientsList.addItem("Adam Kowalczyk");
		patientsList.addItem("Jan Kowalski");
		patientsList.addItemListener(photo.showPhotoItemListener);
		patientsTextField.addActionListener(photo.showPhotoActionListener);
		patientsList.setPreferredSize(new Dimension(140, 30));
	
		helpButton=new JButton(language.languageStrings[languageValue][4]);
		exitButton=new JButton(language.languageStrings[languageValue][5]);
		exitButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				
				System.exit(0);
			}
		});
		helpButton.addActionListener(showHelpListener);
		loadingFilesPanel.setLayout(new FlowLayout());
		loadingFilesPanel.add(loadingFilesButton);
		errorAnalysisPanel.setLayout(new FlowLayout());
		errorAnalysisPanel.add(errorAnalysisButton);
		statisticalAnalysisPanel.setLayout(new FlowLayout());
		statisticalAnalysisPanel.add(statisticalAnalysisButton);
		
		patientsPanel1.setLayout(new BorderLayout());
		patientsPanel1.add(patientsTextField, BorderLayout.PAGE_END );
		patientsPanel2.setLayout(new FlowLayout());
		patientsPanel2.add(patientsList);
		
		helpPanel.setLayout(new FlowLayout());
		helpPanel.add(helpButton);
		exitPanel.setLayout(new FlowLayout());
		exitPanel.add(exitButton);
		optionsPanel.setLayout(new GridLayout(7, 1));
		optionsPanel.add(loadingFilesPanel);
		optionsPanel.add(errorAnalysisPanel);
		optionsPanel.add(statisticalAnalysisPanel);
		optionsPanel.add(patientsPanel1);
		optionsPanel.add(patientsPanel2);
		optionsPanel.add(helpPanel);
		optionsPanel.add(exitPanel);
		plotPanel.setBackground(Color.cyan);
		optionsPanel.setBorder(BorderFactory.createBevelBorder(0));// wypukły panel
		setLocationRelativeTo(null);//ustawia na środek ekranu
		this.add(optionsPanel, BorderLayout.WEST);
		this.add(plotPanel, BorderLayout.CENTER);
		
		
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	

	public MainWindow(GraphicsConfiguration gc) {
		super(gc);
		// TODO Auto-generated constructor stub
	}

	public MainWindow(String title) throws HeadlessException {
		super(title);
		// TODO Auto-generated constructor stub
	}

	public MainWindow(String title, GraphicsConfiguration gc) {
		super(title, gc);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		MainWindow mainFrame = null;
		@SuppressWarnings("unused")
		LanguageFrame startFrame = new LanguageFrame(mainFrame);

	}

}
