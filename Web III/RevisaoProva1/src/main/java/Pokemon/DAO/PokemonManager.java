package Pokemon.DAO;

//verificarQuantidade

import Pokemon.model.Pokemon;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

/**
 * Essa classe gerencia as listas de pokemons.
 *
 * @author CamisNew
 * @since 08/04/2020
 * @version 1.0
 */
public class PokemonManager {

    public List<Pokemon> pokemonList;

    public PokemonManager() {
        pokemonList = new ArrayList<Pokemon>();
    }

    /**
     * @param pokemon registra um objeto Pokemon na lista referente.
     */
    public void registerPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

    /**
     * @param search String com o conteúdo a ser buscado.
     * @param searchType valor da opção do tipo de busca desejado.
     * @return retorna o resultado da busca conforme as opções, na falta de opção correspondente retorna toda a lista.
     */
    public List<Pokemon> searchPokemon(String search, byte searchType) {
        List<Pokemon> result = new ArrayList<>();
        switch (searchType) {
            case 1:
                //pokedexNumber
                for (Pokemon pokemon : pokemonList) {
                    if (pokemon.getPokedexNumber() == parseInt(search)){
                        result.add(pokemon);
                    }
                }
                return result;
            case 2:
                //name
                for (Pokemon pokemon : pokemonList) {
                    if (pokemon.getName().equalsIgnoreCase(search)){
                        result.add(pokemon);
                    }
                }
                return result;
            default:
                result = pokemonList;
                return result;
        }
    }

    /**
     * @param index recebe o index para remover da lista.
     */
    public void deletePokemon(int index) {
        if (pokemonList.size() > index) {
            pokemonList.remove(index);
        } else {
            throw new Error("Não achamos o Pokemon!");
        }
    }

    /**
     * @param index recebe o index do objeto a ser modificado.
     * @param modifiedPokemon recebe o objeto com a alteração feita.
     */
    public void modifyPokemon(int index, Pokemon modifiedPokemon) {
        if (pokemonList.size() > index) {
            pokemonList.set(index, modifiedPokemon);
        } else {
            throw new Error("Não achamos o Pokemon!");
        }
    }

    /**
     * @return retorna a quantidade de pokemons registrados.
     */
    public int countPokemons() {
        return pokemonList.size();
    }


}
