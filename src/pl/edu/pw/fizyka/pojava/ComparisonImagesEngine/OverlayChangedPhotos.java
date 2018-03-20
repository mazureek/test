package pl.edu.pw.fizyka.pojava.ComparisonImagesEngine;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class OverlayChangedPhotos extends JFrame {

	JButton end;
	JButton add;
	JPanel optionsPanel=new JPanel();
	JPanel photoPanel=new JPanel();
	JFrame overlayChangedPhotos;
	MainWindow window;
	
	WindowListener overlayChangedPhotosListener = new WindowListener() {

		@Override
		public void windowActivated(WindowEvent arg0) {}
		@Override
		public void windowClosed(WindowEvent arg0) {		}
		@Override
		public void windowClosing(WindowEvent arg0) {
			
			overlayChangedPhotos = null;
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

	 public OverlayChangedPhotos() {
		
		setSize(900, 900);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(overlayChangedPhotosListener);
	}

	ActionListener showOverlayChangedPhotosListener = new ActionListener() {// wyświetla okienko z pomocą

		@Override
		public void actionPerformed(ActionEvent arg0) {

		
				overlayChangedPhotos = new OverlayOriginalPhotos();
				
				overlayChangedPhotos.setTitle(window.language.languageStrings[window.languageValue][7]);// JEZYK
			
				end=new JButton(window.language.languageStrings[window.languageValue][16]);
				add=new JButton(window.language.languageStrings[window.languageValue][18]);
				end.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						overlayChangedPhotos.setVisible(false);
						window.overlayOriginalPhotos.overlayOriginalPhotosFrame.setVisible(false);
					
					}
				});
				optionsPanel.setLayout(new FlowLayout());
				optionsPanel.add(end);
				optionsPanel.add(add);
				overlayChangedPhotos.setLayout(new BorderLayout());
				photoPanel.setPreferredSize(new Dimension(900, 850));
				overlayChangedPhotos.add(photoPanel, BorderLayout.CENTER);
				overlayChangedPhotos.add(optionsPanel, BorderLayout.PAGE_END);
				overlayChangedPhotos.setVisible(true);
				overlayChangedPhotos.setLocationRelativeTo(null);
				
				
				
	
		}

	};
	
	

}
