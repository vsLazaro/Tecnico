public class Produto {
    public String description;
    public float value;
    public int quantity;

    public Produto(String description, float value, int quantity) {
        this.description = description;
        this.value = value;
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float calcularValorEstoque() {
        return quantity*value;
    }
}
