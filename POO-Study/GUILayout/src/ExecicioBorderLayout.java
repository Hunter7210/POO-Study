import javax.swing.*;
import java.awt.*;

public class ExecicioBorderLayout extends JFrame {
    public ExecicioBorderLayout() {
        super("CALCULADORA COM VISOR");

        JPanel painel = new JPanel(new BorderLayout());
        this.add(painel);

        // ADD OS COMPONENTES
        painel.add(new JTextPane(), BorderLayout.NORTH);

        JPanel painel2 = new JPanel(new GridLayout());

        painel.add(painel2);


        
    }
}
