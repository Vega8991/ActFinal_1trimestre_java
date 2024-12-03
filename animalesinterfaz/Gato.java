package animalesinterfaz;

public class Gato implements Animal {
    private String nombreCientifico = "Felis silvestris catus";
    private String entorno = "doméstico";
    private String comida = "ratones";
    private String sonido = "maullido";

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
