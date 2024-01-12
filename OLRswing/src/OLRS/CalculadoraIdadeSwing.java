package OLRS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

public class CalculadoraIdadeSwing {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> criarJanela());
    }

    private static void criarJanela() {
        JFrame frame = new JFrame("Calculadora de Idade");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel painel = new JPanel();
        JLabel labelAnoNascimento = new JLabel("Ano de Nascimento:");
        JTextField campoAnoNascimento = new JTextField(4);
        JButton botaoCalcularIdade = new JButton("Calcular Idade");
        JLabel labelResultado = new JLabel();

        botaoCalcularIdade.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int anoNascimento = Integer.parseInt(campoAnoNascimento.getText());
                    int idade = LocalDate.now().getYear() - anoNascimento;

                    String resultado = "Idade: " + idade + " anos. " + ((idade >= 18) ? "Maior de idade" : "Menor de idade");

                    labelResultado.setText(resultado);
                } catch (NumberFormatException ex) {
                    labelResultado.setText("Por favor, insira um ano válido.");
                }
            }
        });

        painel.add(labelAnoNascimento);
        painel.add(campoAnoNascimento);
        painel.add(botaoCalcularIdade);
        painel.add(labelResultado);

        frame.getContentPane().add(painel);
        frame.setSize(300, 150);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
