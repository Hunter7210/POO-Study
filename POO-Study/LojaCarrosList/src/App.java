import java.util.*;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // Class carros - atributos e o métodos da clasee
        // mainpular a classe no app
        // criar uma list do tipo carros List<carros> = new Arraylist<>();
        // 1. Cadastrar novo carro
        // 2. Listar(exibir) todos os carros cadastrados
        // 3. Consultar um carro cadastrado // 4. Apagar um carro cadastrado

        List<Carros> listaCarros = new ArrayList<>();

        boolean aberto = true;
        while (aberto) {
            int escolha;
            escolha = JOptionPane.showInputDialog(null,
                    "ESCOLHA UMA DAS OPÇÕES\n 1- CADASTRAR NOVO CARRO \n 2- LISTAR TODOS OS CARROS CADASTRADOS \n 3- CONSULTAR UM CARRO CADASTRADO \n 4- APAGAR UM CARRO CADASTRADO");

            if (escolha == 1) {

            }
        }
    }
}
