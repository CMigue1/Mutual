package Entidades;

public class Prestador extends Persona {
    private Especialidad especialidad;

    public Prestador(Especialidad especialidad, int id, String nombre, String apellido, String direccion, int dni, int telefono, boolean estado) {
        super(id, nombre, apellido, direccion, dni, telefono, estado);
        this.especialidad = especialidad;
    }

    public Prestador(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public Prestador(Especialidad especialidad, String nombre, String apellido, String direccion, int dni, int telefono, boolean estado) {
        super(nombre, apellido, direccion, dni, telefono, estado);
        this.especialidad = especialidad;
    }
    

    
    
}
