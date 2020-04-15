package Exercise_Ferragem;

public class Main {
    public static void main(String[] args) {

        Led led = new Led("eletrolux");
        Incandenscente incandescente = new Incandenscente();
        incandescente.setBrand("philips");
        incandescente.on();
        System.out.println(incandescente);
        led.on();
        System.out.println(led);
        led.off();
        System.out.println(led);

    }
}
