package Pokemon.model;

/**
 * Classe que define um Pokemons e seus atributos: nome, número da Pokedex e HP(heath points - pontos de saúde).
 *
 * @author CamisNew
 * @version 1.0
 * @since 08/04/2020
 */
public class Pokemon {

    private String name;
    private int pokedexNumber;
    private double hp;

    public Pokemon(String name, int podedexNumber, double hp) {
        this.name = name;
        this.pokedexNumber = podedexNumber;
        this.hp = hp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPokedexNumber() {
        return pokedexNumber;
    }

    public void setPokedexNumber(int pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    @Override
    public String toString() {
        return  "\nPokemon name: " + name + 
                "\nPokedexNumber: " + pokedexNumber +
                "\nHP: " + hp;
    }
}
