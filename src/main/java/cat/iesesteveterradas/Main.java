package cat.iesesteveterradas;


public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("Hola");
        } catch (Exception e) {
            System.out.println("Adios: " + e.getMessage());
        }
    }
}
