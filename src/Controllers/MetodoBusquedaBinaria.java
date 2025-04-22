package Controllers;

import Models.Persona;
import views.viewConsole;

public class MetodoBusquedaBinaria {
    private Persona[] personas;
    private viewConsole pantalla;
    private MetodoInsercion metodoOrdenamiento;

    public MetodoBusquedaBinaria(Persona[] personas) {
        this.pantalla = new viewConsole();
        this.personas = personas;
        this.metodoOrdenamiento = new MetodoInsercion();
    }

    public void buscarPorEdad() {
        pantalla.printMessage("****Metodo Busqueda Binaria****", true);
        metodoOrdenamiento.ordenarPorEdad(personas);

        int edadABuscar = pantalla.getEdad();

        int bajo = 0;
        int alto = personas.length - 1;

        while (bajo <= alto) {
            System.out.print("Ordenando... ");
            for (int i = bajo; i <= alto; i++) {
                System.out.print(personas[i].getEdad() + " | ");
            }
            System.out.println();

            int centro = bajo + (alto - bajo) / 2;
            int valorCentro = personas[centro].getEdad();

            System.out.println("bajo=" + bajo + "    alto=" + alto + "    centro=" + centro + "    valorCentro=" + valorCentro);

            if (valorCentro == edadABuscar) {
                pantalla.printMessage("--> ENCONTRADO", false);
                pantalla.printMessage("La persona con la edad " + edadABuscar + " es " + personas[centro].getNombre(), false);
                return;
            }

            if (valorCentro < edadABuscar) {
                pantalla.printMessage("--> DERECHA", false);
                bajo = centro + 1;
            } else {
                pantalla.printMessage("--> IZQUIERDA", false);
                alto = centro - 1;
            }
        }

        pantalla.printMessage("--> NO ENCONTRADO", false);
    }
}
