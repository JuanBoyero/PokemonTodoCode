package ejerciciopokemonpropio;

public class Pikachu extends Pokemon implements IElectrico {

    public Pikachu(int peso,String sexo){
        if(peso<=0){
            throw new IllegalArgumentException("El peso del pokemon no puede ser negativo o cero");
        }
        if(!(sexo.equals("Masculino")||sexo.equals("Femenino"))){
            throw new IllegalArgumentException("El sexo del pokemon solo puede ser \"Masculino\" o \"Femenino\"");
        }
        this.numPokedex=1;
        this.nombre="Pikachu";
        this.peso=peso;
        this.sexo=sexo;
        this.temporada=1;
        this.tipoPrincipal="Electrico";
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
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "IMPACTRUENO"
     */
    @Override
    public void atacarImpactrueno(){
        System.out.println(this.nombre+" a utilizado: \"IMPACTRUENO\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "RAYO"
     */
    @Override
    public void atacarRayo(){
        System.out.println(this.nombre+" a utilizado: \"RAYO\"");
    }

    /**
    * @Pre El pokemon debe ser de tipo "Electrico"
    * @Post El pokemon utiliza el movimiento "PUÑO TRUENO"
    */
    @Override
    public void atacarPunioTrueno(){
        System.out.println(this.nombre+" a utilizado: \"PUÑO TRUENO\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Electrico"
     * @Post El pokemon utiliza el movimiento "RAYO CARGA"
     */
    @Override
    public void atacarRayoCarga(){
        System.out.println(this.nombre+" a utilizado: \"RAYO CARGA\"");
    }
}

