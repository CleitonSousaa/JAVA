package ECS;

import java.awt.FlowLayout;
import javax.swing.*;

public class ParOuImpar {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Verificar Par ou Ímpar");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Digite um número:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Verificar");
        JLabel resultLabel = new JLabel();
        
        panel.setLayout(new FlowLayout());

        panel.add(label);
        panel.add(textField);
        panel.add(button);
        panel.add(resultLabel);

        frame.add(panel);

        button.addActionListener(e -> {
            try {
                int numero = Integer.parseInt(textField.getText());

                if (numero % 2 == 0) {
                    resultLabel.setText("O número " + numero + " é par.");
                } else {
                    resultLabel.setText("O número " + numero + " é ímpar.");
                }
            } catch (NumberFormatException ex) {
                resultLabel.setText("Por favor, insira um número válido.");
            }
        });

        frame.setVisible(true);
    }
}

