package T2.Ej1;

import java.util.Date;

public class Miembros extends Persona {
    private Date Incorporacion;

    public Miembros(String DNI, String nombre, int edad, String direccion, Date incorporacion) {
        super(DNI, nombre, edad, direccion);
        Incorporacion = incorporacion;
    }

    public Miembros() {
        super();
        this.Incorporacion=new Date(11,12,2023);
    }
}
