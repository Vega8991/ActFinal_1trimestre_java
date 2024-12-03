package animales;

public abstract class Animal {
    //Declaramos los atributos de cada animal que haremos
	protected String nombreCientifico;
    protected String entorno;
    protected String comida;
    protected String sonido;

    //Hacemos un constructor de la clase animal para crear objetos dentro del main
    public Animal(String nombreCientifico, String entorno, String comida, String sonido) {
        this.nombreCientifico = nombreCientifico;
        this.entorno = entorno;
        this.comida = comida;
        this.sonido = sonido;
    }

    //Creamos los getters para ver la informacion desde el main y lo imprima por pantalla
    public String getSonido() {
        return sonido;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public String getEntorno() {
        return entorno;
    }

    public String getComida() {
        return comida;
    }
}

