import Models.Persona;
import views.viewConsole;
import Controllers.PersonaController;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)
        };

        PersonaController pC = new PersonaController();
        viewConsole vC = new viewConsole();

        vC.printMessage("Personas", true);
        vC.printPersonaArray(personas);

        vC.printMessage("Personas ordenadas por edad", true);
        pC.ordenarPorEdad(personas);
        vC.printPersonaArray(personas);

        vC.printMessage("Buscar persona con edad 40", true);
        Persona pB = pC.buscarPorEdad(personas, 40);
        if (pB == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 40 es:", false);
            vC.printMessage("\t" + pB, false);
        }

        vC.printMessage("Buscar persona con edad 90", true);
        Persona pB2 = pC.buscarPorEdad(personas, 90);
        if (pB2 == null) {
            vC.printMessage("\tNo hay persona con esa edad", false);
        } else {
            vC.printMessage("\tLa persona con la edad 90 es:", false);
            vC.printMessage("\t" + pB2, false);
        }
    }
}
// instanciar clases necesarias
//imprimir arreglo
//ordenar
//imprimir arreglo ordenado
//buscar edad 40
//imprimir resultado
//buscar edad 90 
// imprimir resultado
