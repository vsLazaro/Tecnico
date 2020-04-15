package PostoDeGasolina;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

/**
 * Classe que gerencia os preços de um posto de combustível.
 * @version 1.0
 */
public class PostoCombustivel {
    DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public final double GASOLINA = 4.49;
    public final double ALCOOL = 3.68;
    public final double DIESEL = 3.71;

    public List<String> combustiveis = new ArrayList<>();

    /**
     * Adiciona os combustíveis possíveis para comparação.
     */
    public PostoCombustivel() {
        combustiveis.add("gasolina");
        combustiveis.add("alcool");
        combustiveis.add("diesel");
        combustiveis.add("flex");
    }

    /**
     * @param tipoCombustivel String com o combustível que deseja confirmar se é válido.
     * @return retorna String com o tipo de combustível num formato validado ou o valor original.
     */
    public String validaTipoCombustivel(String tipoCombustivel) {
        if(this.combustiveis.stream().anyMatch((combustivel) -> combustivel.equalsIgnoreCase(tipoCombustivel))){
            return tipoCombustivel.toLowerCase();
        }
        return tipoCombustivel;
    }

    /**
     * @param tipoCombustivel tipo de combustível sendo comprado.
     * @param litros quantidade que está sendo comprada.
     * @return retorna uma String com o tipo selecionado e o valor da compra conforme litros informados.
     */
    public String calcularTotalCompra(String tipoCombustivel, double litros) {
        switch (tipoCombustivel) {
            case "gasolina":
                return "Gasolina - R$ " + decimalFormat.format(GASOLINA*litros);
            case "alcool":
                return "Alcool - R$ " + decimalFormat.format(ALCOOL*litros);
            case "diesel":
                return "Diesel - R$ " +  decimalFormat.format(DIESEL*litros);
            case "flex":
                return "Alcool - R$ " +  decimalFormat.format(ALCOOL*litros) + "\nGasolina - R$ " +  decimalFormat.format(GASOLINA*litros);
            default:
                return "Opa! Opção inválida";
       }
    }
}
