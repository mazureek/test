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

import pl.edu.pw.fizyka.pojava.ComparisonImagesEngine.MainWindow.Help;

public class OverlayOriginalPhotos extends JFrame {
	JButton cancel;
	JButton next;
	JPanel optionsPanel=new JPanel();
	JPanel photoPanel=new JPanel();
	JFrame overlayOriginalPhotosFrame;
	MainWindow window;
	
	WindowListener overlayOriginalPhotosListener = new WindowListener() {

		@Override
		public void windowActivated(WindowEvent arg0) {}
		@Override
		public void windowClosed(WindowEvent arg0) {		}
		@Override
		public void windowClosing(WindowEvent arg0) {
			
			overlayOriginalPhotosFrame = null;
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

	public OverlayOriginalPhotos() {
		
		setSize(900, 900);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		addWindowListener(overlayOriginalPhotosListener);
		/*cancel=new JButton(window.language.languageStrings[window.languageValue][3]);
		next=new JButton(window.language.languageStrings[window.languageValue][3]);
		cancel.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				overlayOriginalPhotosFrame.setVisible(false);
				
				
			}
		});
		next.addActionListener(window.overlayChangedPhotos.showOverlayChangedPhotosListener);
		optionsPanel.setLayout(new FlowLayout());
		optionsPanel.add(cancel);
		optionsPanel.add(next);
		setLayout(new BorderLayout());
		photoPanel.setPreferredSize(new Dimension(900, 850));
		add(photoPanel, BorderLayout.CENTER);
		add(optionsPanel, BorderLayout.PAGE_END);*/
		
		
		
	}

	ActionListener showOverlayOriginalPhotosListener = new ActionListener() {// wyświetla okienko z pomocą

		@Override
		public void actionPerformed(ActionEvent arg0) {

		
				overlayOriginalPhotosFrame = new OverlayOriginalPhotos();
				
				overlayOriginalPhotosFrame.setTitle(window.language.languageStrings[window.languageValue][7]);// JEZYK
			
				cancel=new JButton(window.language.languageStrings[window.languageValue][19]);
				next=new JButton(window.language.languageStrings[window.languageValue][17]);
				cancel.addActionListener(new ActionListener() {
					
					@Override
					public void actionPerformed(ActionEvent e) {
						overlayOriginalPhotosFrame.setVisible(false);
						
						
					}
				});
				next.addActionListener(window.overlayChangedPhotos.showOverlayChangedPhotosListener);
				optionsPanel.setLayout(new FlowLayout());
				optionsPanel.add(cancel);
				optionsPanel.add(next);
				overlayOriginalPhotosFrame.setLayout(new BorderLayout());
				photoPanel.setPreferredSize(new Dimension(900, 850));
				overlayOriginalPhotosFrame.add(photoPanel, BorderLayout.CENTER);
				overlayOriginalPhotosFrame.add(optionsPanel, BorderLayout.PAGE_END);
				
				overlayOriginalPhotosFrame.setVisible(true);
				overlayOriginalPhotosFrame.setLocationRelativeTo(null);
				
				
				
	
		}

	};
	
	

	

}
