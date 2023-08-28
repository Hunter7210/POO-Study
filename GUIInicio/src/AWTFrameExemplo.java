import java.awt.Frame;

public class AWTFrameExemplo extends Frame { //FRAME É UMA JANELA DO TIPO CONTAINER
    // construtor, que constroí um obj
    public AWTFrameExemplo() {
        super("Minha 1° janela AWT");

        this.setSize(400, 400);  //determinando a largura e altura me px
        this.setVisible(true); //PARA FICAR VISIVEL
        this.setResizable(false); //PARA NÃO DEIXAR O USUARIO MEXER NO TAMANHO DA TELA , NÃO DEIXA RESPONSÍVEL

    }
}
