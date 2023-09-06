import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class JFrameUtilizando extends JFrame {
    public JFrameUtilizando() {
        super("JANELA PRINCIPAL");
        // setando a janela(ponto zero sempre o alto a esqueda)
        this.setBounds(500, 500, 400, 400); // cordendadas(y),cordendadas(x), largura, altura //ELE DETERMINA ALEM do tamanho da janela tbm o posicionamento
        //AJUSTANDO O LAYOUT DA JANELA
        
        //criou um objeto
        FlowLayout flow = new FlowLayout();
        this.setLayout(flow); //flow ja vem com padrão o layout do tipo grid, que preenche toda a tela
        
        // ADD componentes
        for (int i = 0; i < 6; i++) {
            this.add(new JButton("" + i)); // O BOTÃO É UMA CLASSE // COM O FOR ELE VAI CRIAR 6 BOTÕES
        }
        this.add(new JTextField("meus textos",15)); //15 é o tamanho dos caracteres q cabem dentro
        //
        this.setVisible(true);
    }
}
