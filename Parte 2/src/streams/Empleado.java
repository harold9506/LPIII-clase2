package streams;

public class Empleado {

    private long id;
    private int edad;
    private String nombre;


    public Empleado(long id, int edad, String nombre) {
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
