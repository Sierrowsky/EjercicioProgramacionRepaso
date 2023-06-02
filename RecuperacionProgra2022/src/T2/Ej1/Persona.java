package T2.Ej1;

public abstract class Persona {
    private String DNI;
    private String Nombre;
    private int Edad;
    private String Direccion;

    public Persona(String DNI, String nombre, int edad, String direccion) {
        this.DNI = DNI;
        Nombre = nombre;
        Edad = edad;
        Direccion = direccion;
    }
    public Persona(){
        this.DNI="12345678a";
        this.Nombre="Juan";
        this.Edad=35;
        this.Direccion="Valladares";
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Edad=" + Edad +
                ", Direccion='" + Direccion + '\'' +
                '}';
    }
}
