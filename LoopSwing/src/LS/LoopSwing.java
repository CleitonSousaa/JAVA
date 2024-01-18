package LS;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoopSwing {

    private int contador = 0;
    private JLabel labelContador;

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(() -> {
            new LoopSwing().createAndShowGUI();
        });
    }

    private void createAndShowGUI() {
        JFrame frame = new JFrame("Contador Swing Iterativo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();

        labelContador = new JLabel("Contador: " + contador);

        JButton botaoIncrementar = new JButton("Incrementar");
        botaoIncrementar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                incrementarContadorIterativo();
            }
        });

        panel.add(labelContador);
        panel.add(botaoIncrementar);

        frame.getContentPane().add(panel);

        frame.setSize(300, 150);

        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }

    private void incrementarContadorIterativo() {
        for (int i = 0; i < 5; i++) {
            contador++;
            labelContador.setText("Contador: " + contador);
            delay(100);
        }
    }

    private void delay(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
