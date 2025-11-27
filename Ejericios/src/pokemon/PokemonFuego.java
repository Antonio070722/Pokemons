package pokemon;

public class PokemonFuego extends PokemonBaseImpl{

    public int golpeLlamarada =20;

    public PokemonFuego(String nombre) {
        super(nombre);
    }

    public PokemonFuego(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonFuego(int numeroPokemon) {
        super(numeroPokemon);
    }

    public void saludar(){
        System.out.println("Soy pokemon fuego");
    }



}
