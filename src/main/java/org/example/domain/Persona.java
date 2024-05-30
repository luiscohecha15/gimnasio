package org.example.domain;

import java.io.Serializable;

public class Persona implements Serializable {
    private static final long serialVersionUID = 2906642554793891381L;
    private long id;
    private String nombre, apellido;
    private boolean in_out;

     public Persona(long id, String nombre, String apellido, boolean in_out){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.in_out = in_out;
    }

    public long getId() {
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


    public void setId(long id) {this.id = id;}
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setIn_out(boolean in_out) {this.in_out = in_out;}

    @Override
    public String toString() {
        return "Persona{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", ingreso=" + in_out +
                '}';
    }
}
