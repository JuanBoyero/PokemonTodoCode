package ejerciciopokemonpropio;

public abstract class Pokemon {

    protected int numPokedex;
    protected String nombre;
    protected int peso;
    protected String sexo;
    protected int temporada;
    protected String tipoPrincipal;
    protected String tipoSecundario;


    /**
     * @Post El Pokemon utiliza el ataque "PLACAJE"
     */
    public void atacarPlacaje(){
    }

    /**
     * @Post El Pokemon utiliza el ataque "Arañazo"
     */
    public void atacarAraniazo(){
        
    }

    /**
     * @Post El Pokemon utiliza el ataque "Mordisco"
     */
    public void atacarMordisco(){
    }
}
