package ejerciciopokemonpropio;

public class Squirtle extends Pokemon implements IAgua{

    public Squirtle(int peso,String sexo){
        if(peso<=0){
            throw new IllegalArgumentException("El peso del pokemon no puede ser negativo o cero");
        }
        if(!(sexo.equals("Masculino")||sexo.equals("Femenino"))){
            throw new IllegalArgumentException("El sexo del pokemon solo puede ser \"Masculino\" o \"Femenino\"");
        }
        this.numPokedex=7;
        this.nombre="Squirtle";
        this.peso=peso;
        this.sexo=sexo;
        this.temporada=1;
        this.tipoPrincipal="Agua";
        this.tipoSecundario=null;
    }

    /**
     * @Post Utiliza el movimiento "ARAÑAZO"
     */
    @Override
    public void atacarAraniazo()
    {
        System.out.println(this.nombre+" a utilizado: \"ARAÑAZO\"");
    }

    /**
     * @Post Utiliza el movimiento "PLACAJE"
     */
    @Override
    public void atacarPlacaje()
    {
        System.out.println(this.nombre+" a utilizado: \"PLACAJE\"");
    }

    /**
     * @Post Utiliza el movimiento "MORDISCO"
     */
    @Override
    public void atacarMordisco()
    {
        System.out.println(this.nombre+" a utilizado: \"MORDISCO\"");
    }

    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "HIDROBOMBA"
    */
    @Override
    public void atacarHidrobomba()
    {
        System.out.println(this.nombre+" a utilizado: \"HIDROBOMBA\"");
    }

    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "PISTOLA AGUA"
    */
    @Override
    public void atacarPistolaAgua()
    {
        System.out.println(this.nombre+" a utilizado: \"PISTOLA AGUA\"");
    }

    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "BURBUJA"
    */
    @Override
    public void atacarBurbuja()
    {
        System.out.println(this.nombre+" a utilizado: \"BURBUJA\"");
    }

    /**
    * @Pre El pokemon debe ser de tipo "Agua"
    * @Post El pokemon utiliza el movimiento "HIDROPULSO"
    */
    @Override
    public void atacarHidropulso()
    {
        System.out.println(this.nombre+" a utilizado: \"HIDROPULSO\"");
    }

}
