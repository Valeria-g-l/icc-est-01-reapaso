package Controllers;

import Models.Persona;

public class MetodoInsercion {
    public void ordenarPorEdad(Persona[] personas) {
        for (int i = 1; i < personas.length; i++) {
            Persona temp = personas[i];
            int j = i - 1;
            while (j >= 0 && personas[j].getEdad() > temp.getEdad()) {
                personas[j + 1] = personas[j];
                j--;
            }
            personas[j + 1] = temp;
        }
    }
}
