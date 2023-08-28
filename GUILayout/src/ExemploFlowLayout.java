import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout {
    // atributos
    int cont;

    // construtor
    public ExemploFlowLayout() {
        // criei o frame GridLayout
        JFrame janela1 = new JFrame("Janela 1");
        // modificar o layoutt do Frame
        FlowLayout flow = new FlowLayout();
        janela1.setLayout(flow);

        // Criando componentes
        JLabel texto1 = new JLabel("Informe o n° de botões: ");
        JTextField painel1 = new JTextField("Insira n°", 25);
        JButton botao1 = new JButton("Enviar");
        // add os componentes
        janela1.add(texto1);
        janela1.add(painel1);
        janela1.add(botao1);

        // set Frame
        janela1.setDefaultCloseOperation(2);
        janela1.pack(); // compacta do tamanho correto para visualização
        janela1.setVisible(true);

        // funções

        botao1.addActionListener(e -> {
            int ndigit;
            ndigit = Integer.parseInt(painel1.getText());
            for (int i = 0; i < ndigit; i++) {
                JButton botoes = new JButton("botao" + cont);
                janela1.pack();

                janela1.add(botoes);

                cont++;
            }
        });

    }
}
