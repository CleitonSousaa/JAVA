package ss;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSoma extends JFrame {

    private static final long serialVersionUID = 1L;
    private JTextField textFieldNumero1;
    private JTextField textFieldNumero2;
    private JTextField textFieldResultado;

    public CalculadoraSoma() {
    	
        setTitle("Calculadora de Soma");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));

        JLabel labelNumero1 = new JLabel("Número 1:");
        textFieldNumero1 = new JTextField();
        JLabel labelNumero2 = new JLabel("Número 2:");
        textFieldNumero2 = new JTextField();
        JButton btnCalcular = new JButton("Calcular");
        JLabel labelResultado = new JLabel("Resultado:");
        textFieldResultado = new JTextField();
        textFieldResultado.setEditable(false);

        add(Box.createVerticalGlue());
        add(labelNumero1);
        add(textFieldNumero1);
        add(labelNumero2);
        add(textFieldNumero2);
        add(btnCalcular);
        add(labelResultado);
        add(textFieldResultado);
        add(Box.createVerticalGlue());

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularSoma();
            }
        });
    }

    private void calcularSoma() {
        try {
            double num1 = Double.parseDouble(textFieldNumero1.getText());
            double num2 = Double.parseDouble(textFieldNumero2.getText());

            double resultado = num1 + num2;

            textFieldResultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, insira números válidos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraSoma().setVisible(true);
            }
        });
    }
}
