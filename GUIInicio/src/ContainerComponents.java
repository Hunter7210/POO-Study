
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ContainerComponents extends JFrame {
    // atributos
    int cont;

    public ContainerComponents() { // PARA CHAMAR ESSE COSNTRUTOR BASTA ESCREVER "CTOR"
        super("Janela Container");

        this.setBounds(500, 500, 500, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        // CRIAR UM OUTRO CONTAINER
        JPanel painel1 = new JPanel(); // JPANEL USA O GRID LAYOUT COMO PADRÃO
        this.add(painel1); // ESSE PAINEL JA É FLOW LAYOUD DE NATUREZA
        // TUDO A PARTIR DAQUI ja fica no painel1

        // adcionar um Jbutton e um Jlabel -> painel1
        // CRIAR DE FORMA DIFERENTE
        JButton botao1 = new JButton("Clique aqui");
        JLabel texto1 = new JLabel("N° DE CLIQUES");
        painel1.add(botao1);
        painel1.add(texto1);
        botao1.addActionListener(e -> {
            cont++;
            texto1.setText("N° de cliques é: " + cont);
            
            JButton botoes = new JButton("botao"+cont);
            painel1.add(botoes);

        });

        // criar uma alçao para o btn(addActionListener) e imprimir no J
        this.setVisible(true);
    }

}
