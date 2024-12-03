package animales;

public class PruebaAnimal {
    public static void main(String[] args) {
        // Crear instancias de cada tipo de animal
        Perro perro = new Perro();
        Lobo lobo = new Lobo();
        Leon leon = new Leon();
        Gato gato = new Gato();

        // Mostrar la informaci�n de cada animal
        System.out.println("Perro:");
        System.out.println("Nombre cient�fico: " + perro.getNombreCientifico());
        System.out.println("Sonido: " + perro.getSonido());
        System.out.println("Entorno: " + perro.getEntorno());
        System.out.println("Comida: " + perro.getComida());
        System.out.println("--------------------------");

        System.out.println("Lobo:");
        System.out.println("Nombre cient�fico: " + lobo.getNombreCientifico());
        System.out.println("Sonido: " + lobo.getSonido());
        System.out.println("Entorno: " + lobo.getEntorno());
        System.out.println("Comida: " + lobo.getComida());
        System.out.println("--------------------------");

        System.out.println("Le�n:");
        System.out.println("Nombre cient�fico: " + leon.getNombreCientifico());
        System.out.println("Sonido: " + leon.getSonido());
        System.out.println("Entorno: " + leon.getEntorno());
        System.out.println("Comida: " + leon.getComida());
        System.out.println("--------------------------");

        System.out.println("Gato:");
        System.out.println("Nombre cient�fico: " + gato.getNombreCientifico());
        System.out.println("Sonido: " + gato.getSonido());
        System.out.println("Entorno: " + gato.getEntorno());
        System.out.println("Comida: " + gato.getComida());
        System.out.println("--------------------------");
    }
}

