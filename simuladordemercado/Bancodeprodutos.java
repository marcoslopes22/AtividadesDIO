package simuladordemercado;

public class Bancodeprodutos {

    public void listaDeProdutos(){
        System.out.println("\nBem-vindo ao simulador de mercado.\n\nConfira a lista dos produtos disponíveis:");

        String [] lista = {
            "14560 - Refrigerante Coca-cola 2L",
            "47839 - Café em pó Nescafé 1kg",
            "99324 - Cerveja Heineken 430 ml",
            "77688 - Água Sanitária Dragão 1L"
        };

        for (int x = 0; x < lista.length; x++){
            System.out.println(lista[x]);
        }
        
    }

    public void refrigeranteCocaCola(){
        Atributos adquirir = new Atributos();
        adquirir.nomeDoProduto = "Refrigerante de cola 2L";
        adquirir.fabricante = "Coca-cola";
        adquirir.origem = "Estados Unidos";
        adquirir.distribuidor = "GlobalService LTDA";
        adquirir.valorProduto = 8;
        adquirir.codigoProduto = 14560;

        System.out.println("\nProduto: " + adquirir.nomeDoProduto);
        System.out.println("Fabricante: " + adquirir.fabricante);
        System.out.println("Origem: " + adquirir.origem);
        System.out.println("Distribuidor: " + adquirir.distribuidor);
        System.out.println("Valor: " + adquirir.valorProduto + " Reais");
        System.out.println("Código: " + adquirir.codigoProduto);
    }

    public void cafeEmPo(){
        Atributos adquirir = new Atributos();
        adquirir.nomeDoProduto = "Café em pó";
        adquirir.fabricante = "Nescafé";
        adquirir.origem = "Estados Unidos";
        adquirir.distribuidor = "Agência de distribuição MA";
        adquirir.valorProduto = 7;
        adquirir.codigoProduto = 47839;

        System.out.println("\nProduto: " + adquirir.nomeDoProduto);
        System.out.println("Fabricante: " + adquirir.fabricante);
        System.out.println("Origem: " + adquirir.origem);
        System.out.println("Distribuidor: " + adquirir.distribuidor);
        System.out.println("Valor: " + adquirir.valorProduto + " Reais");
        System.out.println("Código: " + adquirir.codigoProduto);
    }

    public void cervejaHeineken(){
        Atributos adquirir = new Atributos();
        adquirir.nomeDoProduto = "Cerveja Heineken 430 ml";
        adquirir.fabricante = "Heineken";
        adquirir.origem = "Alemanha";
        adquirir.distribuidor = "AAD";
        adquirir.valorProduto = 5;
        adquirir.codigoProduto = 99324;

        System.out.println("\nProduto: " + adquirir.nomeDoProduto);
        System.out.println("Fabricante: " + adquirir.fabricante);
        System.out.println("Origem: " + adquirir.origem);
        System.out.println("Distribuidor: " + adquirir.distribuidor);
        System.out.println("Valor: " + adquirir.valorProduto + " Reais");
        System.out.println("Código: " + adquirir.codigoProduto);
    }

    public void aguaSanitariaDragao(){
        Atributos adquirir = new Atributos();
        adquirir.nomeDoProduto = "Água Sanitária 1L";
        adquirir.fabricante = "Dragão";
        adquirir.origem = "Brasil";
        adquirir.distribuidor = "Brazilian Distribuição";
        adquirir.valorProduto = 2;
        adquirir.codigoProduto = 77688;

        System.out.println("\nProduto: " + adquirir.nomeDoProduto);
        System.out.println("Fabricante: " + adquirir.fabricante);
        System.out.println("Origem: " + adquirir.origem);
        System.out.println("Distribuidor: " + adquirir.distribuidor);
        System.out.println("Valor: " + adquirir.valorProduto + " Reais");
        System.out.println("Código: " + adquirir.codigoProduto);
    }

    public void produtoNaoCadastrado(){
        System.out.println("ERRO: Produto não cadastrado.");
    }
}
