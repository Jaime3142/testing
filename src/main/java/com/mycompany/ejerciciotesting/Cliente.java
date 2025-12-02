

package com.mycompany.ejerciciotesting;


public class Cliente {
String nombre;
int year;

public Cliente(String nombre, int year){
    this.nombre = nombre;
    this.year = year;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


}
