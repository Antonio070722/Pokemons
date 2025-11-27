package pokemon;

public class PokemonTierra extends PokemonBaseImpl {

    public int darLatigazo=30;

    public PokemonTierra(String nombre) {
        super(nombre);
    }

    public PokemonTierra(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonTierra(int numeroPokemon) {
        super(numeroPokemon);
    }

    public void saludar(){
        System.out.println("Soy pokemon tierra");
    }

}
