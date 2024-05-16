package org.example.domain;

public class Persona {
    private int id;
    private String nombre, apellido;
    private boolean in_out = false;

    Persona(int id, String nombre, String apellido, boolean in_out){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.in_out = in_out;
    }

    public int getId() {
        return id;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public boolean isIn_out(){
        return in_out;
    }

    public void setId(int id){
        this.id = id;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIn_out(boolean in_out) {
        this.in_out = in_out;
    }
}
