package Exercicio2;

/**
 * Classe dedicada ao caixa da lanchonete Mr. Lanche
 *
 * @author CamisNew
 * @version 1.0
 */

public class Caixa {

    public static String mostrarMenu() {
        return "\nBem-vindo ao fast-food Mr. Lanche! \nA seguir o cardápio:"
                + "\nCód. |   Descrição do produto    |    Preço"
                + "\n1    |   Sanduíche de Presunto   |   R$ 3,65"
                + "\n2    |     Suco de Tamarindo     |   R$ 2,50"
                + "\n3    |      Pastel com Ovo       |   R$ 3,30"
                + "\n4    |        Farroupilha        |   R$ 4,70"
                + "\nCód  |   Descrição do Produto    |    Preço";
    }

    /**
     * @param codigoProduto código referente ao produto cadastrado.
     * @param quantidade quantas unidades do produto devem ser registradas
     * @return linha a ser impressa na nota fiscal relatando item e total da compra.
     */
    public String gerarItemNotaFiscal(byte codigoProduto, int quantidade) {
        switch (codigoProduto) {
            case 1:
                return "Sanduíche de Presunto: R$ " + (quantidade*3.65);
            case 2:
                return "Suco de Tamarindo: R$ " + (quantidade*2.50);
            case 3:
                return "Pastel com ovo: R$ " + (quantidade * 3.30);
            case 4:
                return "Farroupilha: R$ " + (quantidade*4.7);
            default:
                return "Item não encontrado!";
        }
    }
}
