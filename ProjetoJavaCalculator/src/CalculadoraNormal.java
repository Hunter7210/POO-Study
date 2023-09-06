import java.awt.*;
import java.util.jar.JarEntry;

import javax.swing.*;

public class CalculadoraNormal extends JFrame {

    public CalculadoraNormal() {
        super();

        JFrame janela1 = new JFrame("calculadora");

        janela1.setLayout(new GridLayout());
        janela1.setLayout(new BorderLayout());

        JPanel painelPirinc = new JPanel();

        JPanel painel1 = new JPanel();
        JPanel painel2 = new JPanel();
        JPanel painel3 = new JPanel();
        JPanel painel4 = new JPanel();

        painel1.setBackground(Color.red);

        // Criando componentes
        JLabel texto = new JLabel("Calculadora");
        JButton n1 = new JButton("1");
        JButton n2 = new JButton("2");
        JButton n3 = new JButton("3");
        JButton n4 = new JButton("4");
        JButton n5 = new JButton("5");
        JButton n6 = new JButton("6");
        JButton n7 = new JButton("7");
        JButton n8 = new JButton("8");
        JButton n9 = new JButton("9");
        JButton operAD = new JButton("+");
        JButton operSUB = new JButton("-");
        JButton operMULT = new JButton("*");
        JButton operDIV = new JButton("/");
        JButton Rodar = new JButton("Rodar");

        // add os componentes
        painel1.add(texto);

        painel2.add(n1);
        painel2.add(n2);
        painel2.add(n3);
        painel2.add(n4);
        painel2.add(operAD);

        painel3.add(n5);
        painel3.add(n6);
        painel3.add(n7);
        painel3.add(n8);
        painel3.add(operSUB);

        painel4.add(operMULT);
        painel4.add(n9);
        painel4.add(operDIV);
        painel4.add(Rodar);

        // set Frame
        painelPirinc.setVisible(true);
        /* painel1.setSize(500, 500); */

        janela1.setDefaultCloseOperation(2);
        janela1.pack(); // compacta do tamanho correto para visualização
        janela1.setVisible(true);
        janela1.setBounds(12, 10, 500, 500);

        janela1.add(painelPirinc, BorderLayout.CENTER);

        painelPirinc.add(painel1, BorderLayout.NORTH);
        painelPirinc.add(painel2, BorderLayout.CENTER);
        painelPirinc.add(painel3, BorderLayout.CENTER);
        painelPirinc.add(painel4, BorderLayout.CENTER);

        janela1.add(painelPirinc);
    }
}
