import javax.swing.JFrame; 

public class GUISwingJFrameExemplo extends JFrame { //FRAME É UMA JANELA DO TIPO CONTAINER
   
    public GUISwingJFrameExemplo() { 
        super("MINHA PRIMEIRA JANELA GUI SWING");  //super é um title
        this.setSize(400, 400); //tamanho
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); //fecha o programa ao apertar o X //interrompe o programa inteiro, ou seja, ao rodar os dois e apertar o X, as duas irão fechar, pois o codigo será interrompido
        this.setVisible(true); //deixa a janela visivel
        
        
    }


}
