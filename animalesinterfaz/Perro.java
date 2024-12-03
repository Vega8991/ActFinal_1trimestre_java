package animalesinterfaz;

public class Perro implements Animal {
    private String nombreCientifico = "Canis lupus familiaris";
    private String entorno = "dom�stico";
    private String comida = "carn�vora";
    private String sonido = "ladrido";

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
