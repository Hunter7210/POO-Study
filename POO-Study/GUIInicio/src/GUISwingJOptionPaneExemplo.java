import javax.swing.JOptionPane;

public class GUISwingJOptionPaneExemplo extends JOptionPane {
    String informacao = "Minha primeira Dialog";

    public GUISwingJOptionPaneExemplo() {
        super();

        this.showMessageDialog(getComponentPopupMenu(), informacao, informacao, 1, icon); //PopupMenu() para funciona como popup
    }
}
