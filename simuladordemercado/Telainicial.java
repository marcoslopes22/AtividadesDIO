package simuladordemercado;
import java.util.Scanner;

public class Telainicial {
    public static void main(String [] args){

        Login usuarioCaixa = new Login();
        usuarioCaixa.identificar();

        Bancodeprodutos tabela = new Bancodeprodutos();
        tabela.listaDeProdutos();

        Scanner leitor = new Scanner (System.in);
        int produtoEscolhido;

        Bancodeprodutos banco = new Bancodeprodutos();

        while(true){
            System.out.print("\nDigite o código do produto: ");
            produtoEscolhido = leitor.nextInt();

        switch (produtoEscolhido) {
            case 14560:
                banco.refrigeranteCocaCola();
                System.out.println(banco);
                break;

            case 47839:
                banco.cafeEmPo();
                System.out.println(banco);
                break;

            default:
                banco.produtoNaoCadastrado();
                System.out.println(banco + "\n\nCódigo procurado: " + produtoEscolhido +
                "\nEste código não está cadastrado no sistema. Por favor, consulte a lista de produtos disponíveis.");
                break;
            }
        }
    }
}
