/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Miguel
 */
public class Prestador extends Persona {
    private Plan plan;

    public Prestador(Plan plan, int id, String nombre, String apellido, String direccion, int dni, int telefono, boolean estado) {
        super(id, nombre, apellido, direccion, dni, telefono, estado);
        this.plan = plan;
    }
 
    public Prestador(Plan plan, String nombre, String apellido, String direccion, int dni, int telefono, boolean estado) {
        super(nombre, apellido, direccion, dni, telefono, estado);
        this.plan = plan;
    }

    public Prestador() {
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
    

    
    
}
