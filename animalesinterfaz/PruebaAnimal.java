package animalesinterfaz;

public class PruebaAnimal {
    public static void main(String[] args) {
        Animal perro = new Perro();
        Animal lobo = new Lobo();
        Animal leon = new Leon();
        Animal gato = new Gato();

        System.out.println("Perro:");
        System.out.println("Nombre científico: " + perro.getNombreCientifico());
        System.out.println("Sonido: " + perro.getSonido());
        System.out.println("Entorno: " + perro.getEntorno());
        System.out.println("Comida: " + perro.getComida());
        System.out.println("--------------------------");

        System.out.println("Lobo:");
        System.out.println("Nombre científico: " + lobo.getNombreCientifico());
        System.out.println("Sonido: " + lobo.getSonido());
        System.out.println("Entorno: " + lobo.getEntorno());
        System.out.println("Comida: " + lobo.getComida());
        System.out.println("--------------------------");

        System.out.println("León:");
        System.out.println("Nombre científico: " + leon.getNombreCientifico());
        System.out.println("Sonido: " + leon.getSonido());
        System.out.println("Entorno: " + leon.getEntorno());
        System.out.println("Comida: " + leon.getComida());
        System.out.println("--------------------------");

        System.out.println("Gato:");
        System.out.println("Nombre científico: " + gato.getNombreCientifico());
        System.out.println("Sonido: " + gato.getSonido());
        System.out.println("Entorno: " + gato.getEntorno());
        System.out.println("Comida: " + gato.getComida());
        System.out.println("--------------------------");
    }
}

