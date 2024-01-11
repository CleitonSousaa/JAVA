package OS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraSwing extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	private JTextField numeradorField;
    private JTextField denominadorField;
    private JButton buttonCalcular;
    private JTextField resultadoQuociente;
    private JTextField resultadoResto;

    public CalculadoraSwing() {
    	
        setTitle("Divisão");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(7, 1));
        
        
        add(new JLabel("Numerador:"));
        numeradorField = new JTextField();
        add(numeradorField);

        add(new JLabel("Denominador:"));
        denominadorField = new JTextField();
        add(denominadorField);

        buttonCalcular = new JButton("Calcular");
        add(buttonCalcular);

        resultadoQuociente = new JTextField("Divisão: ");
        resultadoQuociente.setEditable(false);
        add(resultadoQuociente);

        resultadoResto = new JTextField("Resto: ");
        resultadoResto.setEditable(false);
        add(resultadoResto);


        buttonCalcular.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                try {
                    int numerador = Integer.parseInt(numeradorField.getText());
                    int denominador = Integer.parseInt(denominadorField.getText());

                    int divisao = numerador / denominador;
                    int resto = numerador % denominador;

                    resultadoQuociente.setText("Divisao: " + divisao);
                    resultadoResto.setText("Resto: " + resto);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Digite números válidos.");
                } catch (ArithmeticException ex) {
                    JOptionPane.showMessageDialog(null, "Não é possível dividir por zero.");
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CalculadoraSwing().setVisible(true);
            }
        });
    }
}


