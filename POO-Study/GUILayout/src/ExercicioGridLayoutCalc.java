import javax.swing.*;
import java.awt.*;

public class ExercicioGridLayoutCalc extends JFrame {
    public ExercicioGridLayoutCalc() {
        super("Caculadora");
        // add Jpanel
        JPanel painel = new JPanel();
        this.add(painel);

        GridLayout grid = new GridLayout(4, 4);
        painel.setLayout(grid);

        String valores[] = { "7", "8", "9", "*", "4", "5", "6", "-", "1", "2", "3", "+", "/", "0", ".", "+" };

        for (int i = 0; i < valores.length; i++) {
            painel.add(new JButton(valores[i]));

        }
        /*
         * painel.add(new JButton("7"));
         * painel.add(new JButton("8"));
         * painel.add(new JButton("9"));
         * painel.add(new JButton("*"));
         * painel.add(new JButton("4"));
         * painel.add(new JButton("5"));
         * painel.add(new JButton("6"));
         * painel.add(new JButton("-"));
         * painel.add(new JButton("1"));
         * painel.add(new JButton("2"));
         * painel.add(new JButton("3"));
         * painel.add(new JButton("+"));
         * painel.add(new JButton("/"));
         * painel.add(new JButton("0"));
         * painel.add(new JButton(","));
         * painel.add(new JButton("="));
         */

        this.setDefaultCloseOperation(2);
        this.pack(); // Compacta os elementos, ele redimensiona
        this.setVisible(true);

    }
}
