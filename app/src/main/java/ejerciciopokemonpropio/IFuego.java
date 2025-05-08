package ejerciciopokemonpropio;

public interface IFuego {

    /**
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "PUÑO FUEGO"
     */
    public void atacarPunioFuego();
    /**
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "ASCUAS"
     */
    public void atacarAscuas();
    /**
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "LANZALLAMAS"
     */
    public void atacarLanzallamas();
    
}
