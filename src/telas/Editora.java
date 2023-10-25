package telas;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Editora extends JFrame {
	public void Editora() {

		JTextField textField = new JTextField(40);
		
		JFrame PEditora = new JFrame();
		setTitle("Editora");
		setSize(800, 600);
		setLocationRelativeTo(null);
		setResizable(false);
		setLayout(null);

		
		
		setVisible(true);

	}
	
	public static void main(String[] args) {
		new Editora().Editora();
	}
}

