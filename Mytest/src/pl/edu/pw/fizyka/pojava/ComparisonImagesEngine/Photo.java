package pl.edu.pw.fizyka.pojava.ComparisonImagesEngine;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import com.sun.glass.events.KeyEvent;

import pl.edu.pw.fizyka.pojava.ComparisonImagesEngine.MainWindow.Help;

public class Photo extends JFrame {

	JFrame photoFrame;
	MainWindow window;
	WindowListener photoWindowListener = new WindowListener() {

		@Override
		public void windowActivated(WindowEvent arg0) {}
		@Override
		public void windowClosed(WindowEvent arg0) {}
		@Override
		public void windowClosing(WindowEvent arg0) {
			
			photoFrame = null;
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

	public Photo() {

		setSize(700, 310);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(photoWindowListener);
	}


ItemListener showPhotoItemListener =new ItemListener() {
	
	@Override
	
	public void itemStateChanged(ItemEvent e) {
		for(int i=0; i<window.patientsList.getComponentCount(); i++) {
		if(e.getItem()==window.patientsList.getItemAt(i) ) {
			photoFrame = new Photo();
			photoFrame.setVisible(true);
			photoFrame.setLocationRelativeTo(null);
			photoFrame.setTitle(window.language.languageStrings[window.languageValue][1]);
			}
		
		}
		
	}	
};
ActionListener showPhotoActionListener=new ActionListener() {
	
	@Override
	public void actionPerformed(ActionEvent e) {
		for(int i=0; i<2 ; i++) {
	
		if(window.patientsList.getComponent(i).toString().equals(window.patientsTextField.getText())) {
			photoFrame = new Photo();
			photoFrame.setVisible(true);
			photoFrame.setLocationRelativeTo(null);
			photoFrame.setTitle(window.language.languageStrings[window.languageValue][1]);
			}
		}
	}
};

}

