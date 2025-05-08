package ejerciciopokemonpropio;

public class Charmander extends Pokemon implements IFuego{

    public Charmander(int peso,String sexo){
        if(peso<=0){
            throw new IllegalArgumentException("El peso del pokemon no puede ser negativo o cero");
        }
        if(!(sexo.equals("Masculino")||sexo.equals("Femenino"))){
            throw new IllegalArgumentException("El sexo del pokemon solo puede ser \"Masculino\" o \"Femenino\"");
        }
        this.numPokedex=4;
        this.nombre="Charmander";
        this.peso=peso;
        this.sexo=sexo;
        this.temporada=1;
        this.tipoPrincipal="Fuego";
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
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "PUÑO FUEGO"
     */
    @Override
    public void atacarPunioFuego()
    {
        System.out.println(this.nombre+" a utilizado: \"PUÑO FUEGO\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "ASCUAS"
     */
    @Override
    public void atacarAscuas()
    {
        System.out.println(this.nombre+" a utilizado: \"ASCUAS\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Fuego"
     * @Post El pokemon utiliza el movimiento "LANZALLAMAS"
     */
    @Override
    public void atacarLanzallamas()
    {
        System.out.println(this.nombre+" a utilizado: \"LANZALLAMAS\"");
    }

}
