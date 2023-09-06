import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcNormal extends JFrame{
    public CalcNormal() {
        super("Calculadora normal");
       
        // add Jpanel
        JPanel painel = new JPanel();
        this.add(painel);

        GridLayout grid = new GridLayout(4, 4);
        painel.setLayout(grid);

        String valores[] = { "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "/", "0", ".", "+" };

        for (int i = 0; i < valores.length; i++) {
            painel.add(new JButton(valores[i]));

        }
        
    }
}
