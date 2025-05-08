package ejerciciopokemonpropio;

public class Bulbasaur extends Pokemon implements IPlanta {

    public Bulbasaur(int peso,String sexo){
        if(peso<=0){
            throw new IllegalArgumentException("El peso del pokemon no puede ser negativo o cero");
        }
        if(!(sexo.equals("Masculino")||sexo.equals("Femenino"))){
            throw new IllegalArgumentException("El sexo del pokemon solo puede ser \"Masculino\" o \"Femenino\"");
        }
        this.numPokedex=1;
        this.nombre="Bulbasaur";
        this.peso=peso;
        this.sexo=sexo;
        this.temporada=1;
        this.tipoPrincipal="Planta";
        this.tipoSecundario="Veneno";
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
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "PARALIZADOR"
     */
    @Override
    public void atacarParalizador(){

    }

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "DRENADORAS"
     */
    @Override
    public void atacarDrenadoras(){
        System.out.println(this.nombre+" a utilizado: \"DRENADORAS\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "HOJA AFILADA"
     */
    @Override
    public void atacarHojaAfilada(){
        System.out.println(this.nombre+" a utilizado: \"HOJA AFILADA\"");
    }

    /**
     * @Pre El pokemon debe ser de tipo "Planta"
     * @Post El pokemon utiliza el movimiento "LATIGO CEPA"
     */
    @Override
    public void atacarLatigoCepa(){
        System.out.println(this.nombre+" a utilizado: \"LATIGO CEPA\"");
    }
}
