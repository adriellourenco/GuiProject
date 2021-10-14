package br.senai.sp.jandira.ui;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Tela {

	public void criarTela() {
		
		JFrame minhaTela = new JFrame();
		minhaTela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		minhaTela.setSize(600,600);
		minhaTela.setTitle("Minha Primeira Janela em Java");
		minhaTela.setLayout(null);
		
		//Criar os componentes da tela 
		
		//Criação da Label lblIDade
		JLabel lblIdade = new JLabel();	
		lblIdade.setText("Qual é a sua Idade?");
		lblIdade.setBounds(20, 20, 120, 30);
		
		//Crição de um TextField
		JTextField txtIdade = new JTextField();
		txtIdade.setText("23");
		txtIdade.setBounds(20, 50, 25, 30);
		
		//Crição de um Botão
		JButton btnVerificar = new JButton();
		btnVerificar.setText("Verificar");
		btnVerificar.setBounds(50, 50, 85, 30);
		
		//Criação da Label lblResultado
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setBounds(20, 85, 115, 30);
		
		//Adicionar Componentes no Content Pane
		minhaTela.getContentPane().add(lblIdade);
		minhaTela.getContentPane().add(btnVerificar);
		minhaTela.getContentPane().add(txtIdade);
		minhaTela.getContentPane().add(lblResultado);
	
		minhaTela.setVisible(true);
		
		// ******* Listeners de Eventos
		// ----- Mouse
		txtIdade.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				System.out.println("Soltei o Botão!");
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				System.out.println("Apertei o Botão!");
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				System.out.println("Sai no TextField!");
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Dentrei no TextField!");
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("Clicou!");
				
			}
		});
		
		txtIdade.addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				System.out.println(e.getKeyChar());
				System.out.println(e.getKeyCode());
			}
		});
		
	}
}
