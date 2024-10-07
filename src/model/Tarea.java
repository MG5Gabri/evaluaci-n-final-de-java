package model;

public class Tarea {
    private String titulos;
    private String descripcion;
    private String fechaLimite;
    private String estado;

    public Tarea(String titulos, String descripcion, String fechaLimite, String estado){
        this.titulos = titulos;
        this.descripcion = descripcion;
        this.fechaLimite = fechaLimite;
        this.estado = estado;
    }


    //Getter
    public String getTitulos() {
        return titulos;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getFechaLimite() {
        return fechaLimite;
    }

    public String getEstado() {
        return estado;
    }
}
