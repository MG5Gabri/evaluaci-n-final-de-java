package services;

import model.Tarea;

import java.util.ArrayList;

public class DataTareas {
    private ArrayList<Tarea> listaDeTareas;

    public DataTareas() {
        listaDeTareas = new ArrayList<>();
        incializarTareas();
    }

    private void incializarTareas() {
        listaDeTareas.add(new Tarea(
                "Limpieza",
                "La clase 406 se encuentra sucia",
                "08/10/2024",
                "Pendiente"
        ));
        listaDeTareas.add(new Tarea(
                "Lavar la ropa",
                "Los uniformes de la clase 406 estan sucios",
                "10/10/2024",
                "En progreso"
        ));
        listaDeTareas.add(new Tarea(
                "Mantenimiento al jardín",
                "El jardín 3 tiene las ramas de un árbol muy grandes ",
                "09/10/2024",
                "Pendiente"
        ));
        listaDeTareas.add(new Tarea(
                "Pintar",
                "La pintura por fuera de la clase 203 se encuentra en desgastada",
                "07/10/2024",
                "Completada"
        ));
        listaDeTareas.add(new Tarea(
                "Limpieza",
                "Limpiar todas las ventanas del colegio",
                "12/10/2024",
                "En progreso"
        ));
    }

    public ArrayList<Tarea> getTareas() {
        return listaDeTareas;
    }

}
