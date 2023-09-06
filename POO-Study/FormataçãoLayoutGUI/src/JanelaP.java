import javax.swing.JFrame;

public class JanelaP extends JFrame{
    public JanelaP() {
        super("Projeto");

        this.add(new JanelasAbas());

        this.setDefaultCloseOperation(2);
        this.pack(); // Compacta os elementos, ele redimensiona
        this.setVisible(true);

    }
}
