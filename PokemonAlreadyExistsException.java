public class PokemonAlreadyExistsException extends Exception {
    Pokemon duplicate;

    public PokemonAlreadyExistsException() {
        super("Error: Pokemon already exists in bow!");
    }

    public PokemonAlreadyExistsException(String message, Pokemon duplicate) {
        super(message + " Duplicate POkemone = " + duplicate);
        this.duplicate = duplicate;
    }

    public Pokemon getPokemone() {
        return this.duplicate;
    }
}