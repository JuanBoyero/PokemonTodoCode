package ejerciciopokemonpropio;

public interface IPlanta {

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "PARALIZADOR"
     */
    public void atacarParalizador();

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "DRENADORAS"
     */
    public void atacarDrenadoras();

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "HOJA AFILADA"
     */
    public void atacarHojaAfilada();

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "LATIGO CEPA"
     */
    public void atacarLatigoCepa();
}
