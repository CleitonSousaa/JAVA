package olamundo;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class OlaMundoSwing {
	public static void main(String[] args) {
		
		JFrame janela = new JFrame("Janela com Botão");
	    JButton botao = new JButton("Clique Aqui");
	    
	    
	    botao.addActionListener(e -> exibirMensagem());
	    janela.getContentPane().add(botao);
	    janela.setSize(300, 200);
	    janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    janela.setVisible(true);
	    
	    
	   
	}
	
	private static void exibirMensagem() {
		JOptionPane.showMessageDialog(null, "Olá Mundo!");
	}
}
