import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        List<Felino> felinos = new ArrayList<>();

        ingresarFelino(felinos, new Leon("Simba"));
        ingresarFelino(felinos, new Tigre("Shere Khan"));
        ingresarFelino(felinos, new Puma("Milo"));
        ingresarFelino(felinos, new Guepardo("Flash"));
        ingresarFelino(felinos, new Jaguar("Luna"));

        System.out.println("Felinos ingresados:");
        for (Felino felino : felinos) {
            felino.mostrarInformacion();
            System.out.println("------------------------");
        }

        // Realizar acciones específicas para cada felino
        for (Felino felino : felinos) {
            if (felino instanceof Leon) {
                ((Leon) felino).rugir();
            } else if (felino instanceof Tigre) {
                ((Tigre) felino).cazar();
            } else if (felino instanceof Puma) {
                ((Puma) felino).saltar();
            } else if (felino instanceof Guepardo) {
                ((Guepardo) felino).correr();
            } else if (felino instanceof Jaguar) {
                ((Jaguar) felino).nadar();
            }
            System.out.println("------------------------");
        }
    }

    public static void ingresarFelino(List<Felino> felinos, Felino felino) {
        felinos.add(felino);
        System.out.println("Felino ingresado con éxito.\n");
    }
}
