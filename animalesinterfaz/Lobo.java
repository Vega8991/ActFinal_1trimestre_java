package animalesinterfaz;

public class Lobo implements Animal {
    private String nombreCientifico = "Canis lupus";
    private String entorno = "bosque";
    private String comida = "carnívora";
    private String sonido = "aullido";

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

