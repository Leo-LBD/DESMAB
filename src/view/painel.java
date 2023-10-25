package view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import view.Menu;

public class painel extends JFrame{
	public painel() {
		
		JFrame painel = new JFrame();
		painel.setTitle("Painel");
		painel.setSize(800, 600);
		painel.setLocationRelativeTo(null);
		painel.setResizable(false);
		painel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		painel.setLayout(null);
		
		setVisible(true);

	}

}