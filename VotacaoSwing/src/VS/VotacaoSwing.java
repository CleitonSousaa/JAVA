package VS;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VotacaoSwing extends JFrame {

	private static final long serialVersionUID = 1L;

	public VotacaoSwing() {
        setTitle("Verificador de Voto");
        setSize(600, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        JLabel labelAnoNascimento = new JLabel("Ano de Nascimento:");
        JTextField textFieldAnoNascimento = new JTextField();
        JButton buttonVerificar = new JButton("Verificar");
        JLabel labelResultado = new JLabel();

        buttonVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int anoNascimento = Integer.parseInt(textFieldAnoNascimento.getText());
                    int idade = calcularIdade(anoNascimento);

                    if (idade < 16) {
                        labelResultado.setText("Menor de 16 anos, não pode votar.");
                    } else if (idade > 70) {
                        labelResultado.setText("Maior de 70 anos, voto opcional.");
                    } else {
                        labelResultado.setText("Pode votar.");
                    }
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Digite um ano de nascimento válido.");
                }
            }
        });

        panel.add(labelAnoNascimento);
        panel.add(textFieldAnoNascimento);
        panel.add(new JLabel());
        panel.add(buttonVerificar);
        panel.add(new JLabel());
        panel.add(labelResultado);

        add(panel);

        setVisible(true);
    }

    private int calcularIdade(int anoNascimento) {
        int anoAtual = java.util.Calendar.getInstance().get(java.util.Calendar.YEAR);
        return anoAtual - anoNascimento;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new VotacaoSwing();
            }
        });
    }
}

