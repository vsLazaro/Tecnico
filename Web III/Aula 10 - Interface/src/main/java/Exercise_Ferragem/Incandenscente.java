package Exercise_Ferragem;

public class Incandenscente implements Lampada {

    private String brand;
    private boolean state;

    @Override
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean getState() {
        return state;
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
        return "A lâmpada incandenscente da marca " + this.brand + " está " + (this.state ? "ligada" : "desligada") ;
    }
}
