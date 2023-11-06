package view;
import java.awt.EventQueue;

import Controller.controller;
import DAO.DataBaseAcess;
import DAO.Dao;
import view.menuFrame;

public class TesteApp {

	public static void main(String[] args) {
		DataBaseAcess.valConexao();
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menuFrame menuFrame = new menuFrame();
					menuFrame.setVisible(true);
					Dao model = new DataBaseAcess();
					new controller(model, menuFrame).init();
					
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
