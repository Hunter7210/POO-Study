import javax.swing.*;
import java.awt.*;


public class ExemploGridLayout extends JFrame {
    public ExemploGridLayout() {
        super("JANELA PRINCIPAL");
        // add JPanel
        JPanel painel = new JPanel();  //Criou um obj de Jpanel
        this.add(painel); //add ele

        //modifcar o Layout do Painel(Jpanel) flow-> Grid 
        GridLayout grid = new GridLayout(2, 2); //determinando o tamanho ja na entrada
        painel.setLayout(grid);
        //add componentes ao JPanel
        for (int i = 0; i < 4 /* 4 POR QUE A AREA DO MEU GridLayout é 2*2*/; i++) {
            painel.add(new JButton(""+i, null)); //Adicionando o elemento ao painel 
        }


        this.setDefaultCloseOperation(2);
        this.pack(); // Compacta os elementos, ele redimensiona
        this.setVisible(true);






    }
}
