package views;

import java.util.Scanner;
import Models.Persona;

public class viewConsole {
    Scanner sc = new Scanner(System.in);

    public void printPersonaArray(Persona[] personas) {
        for (Persona p : personas) {
            System.out.println(p);
        }
    }

    public void printMessage(String message, boolean titulo) {
        if (titulo) {
            System.out.println("\n=== " + message + " ===");
        } else {
            System.out.println(message);
        }
    }

    public int getEdad() {
        System.out.print("Ingrese la edad a buscar: ");
        return sc.nextInt();
    }
}

