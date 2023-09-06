import java.awt.*;
import javax.swing.*;

/**
 * ExemploBordeLayout
 */
public class ExemploBordeLayout extends JFrame {
    public ExemploBordeLayout() {
        super("EXEMPLO COM BORDER LAYOUT");

        /* criando um painel, ja com o layout do border */
        JPanel painel = new JPanel(new BorderLayout()); /* CRIA-SE O PAINEL JA ATRIBUINDO O BORDER LAYOUT */
        /*
         * EVITANDO TODOS OS PASSOS QUE DEVERIAM SER REALIZADOS COMO:
         * BorderLayout border = new BorderLayout(ALLBITS, ABORT);
         * painel.setLayout(border);
         */
        this.add(painel);

        // add componentes
        painel.add(new JButton("South"), BorderLayout.SOUTH);
        painel.add(new JTextField(25), BorderLayout.NORTH);
        painel.add(new JButton("West"), BorderLayout.WEST);
        painel.add(new JButton("East"), BorderLayout.EAST);
        painel.add(new JButton("Center"), BorderLayout.CENTER);

        // CONFIG A JANELA/ O FRAME
        this.setDefaultCloseOperation(2);
        this.pack(); // Compacta os elementos, ele redimensiona
        this.setVisible(true);
    }
}