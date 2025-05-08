package ejerciciopokemonpropio;

public interface IAgua {
    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "HIDROBOMBA"
    */
    public void atacarHidrobomba();
    
    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "PISTOLA AGUA"
    */
    public void atacarPistolaAgua();
    
    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "BURBUJA"
    */
    public void atacarBurbuja();
    
    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "HIDROPULSO"
    */
    public void atacarHidropulso();
}
