package animalesinterfaz;

public class Leon implements Animal {
    private String nombreCientifico = "Panthera leo";
    private String entorno = "pradera";
    private String comida = "carnívora";
    private String sonido = "rugido";

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
