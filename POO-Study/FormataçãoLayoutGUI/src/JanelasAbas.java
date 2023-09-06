import javax.swing.JTabbedPane;

public class JanelasAbas extends JTabbedPane{    //JTabbedPane É UMA ESPECIE DE ABAS DO CHROME
    public JanelasAbas() {
        super();
        this.add("Calculadora1",new CalculadoraLayout1());
        this.add("Calculadora2",new CalculadoraLayout2());
        this.add("Calculadora3",new CalculadoraLayout3());
    }
}
