package Pokemon;

import Pokemon.DAO.PokemonManager;
import Pokemon.model.Pokemon;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Classe de testes para os métodos que manipulam a lista de pokemons.
 * Obs.: Testes simples apenas para métodos com retornos ou de fácil verificação.
 *
 * @author CamisNew
 * @since 08/04/2020
 * @version  1.0
 */
public class PokemonManagerTest {
    PokemonManager myPokemons;

    Pokemon bulbasaur = new Pokemon("Bulbasaur", 1, 100.0);
    Pokemon charmander = new Pokemon("Charmander", 4, 100.0);
    Pokemon squirtle = new Pokemon("Squirtle", 7, 100.0);

    @Before
    public void setUp() {
        myPokemons = new PokemonManager();
        myPokemons.registerPokemon(bulbasaur);
        myPokemons.registerPokemon(charmander);
        myPokemons.registerPokemon(squirtle);
        myPokemons.registerPokemon(bulbasaur);
    }

    @Test
    public void searchPokemon() {
        assertEquals(1, myPokemons.searchPokemon("squirtle", (byte) 2).size());
        assertEquals(2, myPokemons.searchPokemon("1", (byte) 1).size());
    }

    @Test
    public void modifyPokemon() {
        Pokemon charizard =  new Pokemon("Charizard", 6, 400.7);
        myPokemons.modifyPokemon(3, charizard);
        assertEquals(charizard, myPokemons.pokemonList.get(3));
    }

    @Test
    public void testCountPokemons() {
        assertEquals(4, myPokemons.countPokemons());
    }
}