package Exercise_Ferragem;

public class Led implements Lampada {

    private String brand;
    private boolean state;

    public Led(String brand) {
        this.brand = brand;
    }

    @Override
    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean getState() {
        return this.state;
    }

    @Override
    public void on() {
        this.state = true;
    }

    @Override
    public void off() {
        this.state = false;
    }

    @Override
    public String toString() {
        return "A lâmpada led da marca " + this.brand + " está " + (this.state ? "ligada" : "desligada") ;

    }
}
