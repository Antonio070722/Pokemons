package pokemon;

public class PokemonAgua extends PokemonBaseImpl{

    public int golpeAcuatico=10;

    public PokemonAgua(int numeroPokemon) {
        super(numeroPokemon);
    }

    public PokemonAgua(String nombre, int vidaMaxima) {
        super(nombre, vidaMaxima);
    }

    public PokemonAgua(String nombre) {
        super(nombre);
    }

    public void saludar(){
        System.out.println("Soy Pokemon agua");
    }

}
