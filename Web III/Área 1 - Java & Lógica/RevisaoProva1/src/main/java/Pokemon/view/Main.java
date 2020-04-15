package Pokemon.view;

import Pokemon.DAO.PokemonManager;
import Pokemon.model.Pokemon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        PokemonManager myPokemons = new PokemonManager();

        Pokemon bulbasaur = new Pokemon("Bulbasaur", 1, 100.0);
        Pokemon charmander = new Pokemon("Charmander", 4, 100.0);
        Pokemon squirtle = new Pokemon("Squirtle", 7, 100.0);
        Pokemon pikachu = new Pokemon("Pikachu", 25, 100.0);

        myPokemons.registerPokemon(bulbasaur);
        myPokemons.registerPokemon(charmander);
        myPokemons.registerPokemon(squirtle);
        myPokemons.registerPokemon(bulbasaur);
        myPokemons.registerPokemon(pikachu);
        myPokemons.deletePokemon(3);
        System.out.println("Bem-vindo ao centro Pokemon! Temos alguns pokemons iniciais esperando você!" +
                           "\nDigite o nome ou o número do pokemon na pokedex que você está procurando:");
        String search = read.next();
        System.out.println("Certo, agora digita pra mim\n1 se está procurando o número pela pokedex ou \n2 se você está procurando o pokemon pelo nome");
        byte searchType = read.nextByte();
        if (searchType != 1 && searchType != 2) {
            System.out.println("Você me parece confuso, vou te mostrar todos os pokemons que eu tenho aqui.");
        }
        System.out.println(myPokemons.searchPokemon(search, searchType));
    }
}