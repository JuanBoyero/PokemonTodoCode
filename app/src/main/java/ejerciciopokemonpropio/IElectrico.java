package ejerciciopokemonpropio;

public interface IElectrico {

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "IMPACTRUENO"
     */
    public void atacarImpactrueno();

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "RAYO"
     */
    public void atacarRayo();

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "PUÑO TRUENO"
     */
    public void atacarPunioTrueno();

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "RAYO CARGA"
     */
    public void atacarRayoCarga();
}
