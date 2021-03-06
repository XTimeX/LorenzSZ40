package me.lorenz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JOptionPane;

public class ButtonListener {

	LorenzGUI gui;

	public void setGUI(LorenzGUI gui) {
		this.gui = gui;
		gui.getBtnRandom().addActionListener(btnRandomLis);
		gui.getBtnAbout().addActionListener(btnAboutLis);
		gui.getBtnReset().addActionListener(btnResetLis);
	}
	
	ActionListener btnResetLis = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getActionCommand().equalsIgnoreCase("reset")) {
				gui.getKeysArea().setText(null);
				gui.getPins().setText(null);
				gui.getPlainText().setText(null);
				gui.getCipherText().setText(null);
				
				gui.getLblChi1C().setText("0");
				gui.getLblChi2C().setText("0");
				gui.getLblChi3C().setText("0");
				gui.getLblChi4C().setText("0");
				gui.getLblChi5C().setText("0");

				gui.getLblPsi1C().setText("0");
				gui.getLblPsi2C().setText("0");
				gui.getLblPsi3C().setText("0");
				gui.getLblPsi4C().setText("0");
				gui.getLblPsi5C().setText("0");
				
				gui.getLblMu1C().setText("0");
				gui.getLblMu2C().setText("0");
			}
			
		}
	};

	ActionListener btnRandomLis = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getActionCommand().equalsIgnoreCase("random")) {
				Random rnd = new Random();
				StringBuilder sb = new StringBuilder();
				for (int i = 0; i < 501; i++) {
					int bnd = rnd.nextInt(2);
					sb.append(bnd);
				}
				gui.getPins().setText(sb.toString());
			}

		}

	};
	
	ActionListener btnAboutLis = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (e.getActionCommand().equalsIgnoreCase("about")) {
				JOptionPane.showMessageDialog(null,
						"This project is a simulator of LorenzSZ40 machine licensed under GNU GPL v1 license. More info can be found in Lorenz.txt",
						"About", JOptionPane.INFORMATION_MESSAGE);
			}
			
		}
	};
	
}
