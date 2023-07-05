public class Usuario {
    private String nombre;
    private int fecha_de_nacimiento;
    private int run;

    public Usuario() {
        this.nombre = "";
        this.fecha_de_nacimiento = 10091977;
        this.run = 13042808;
    }
    public Usuario(String nombre, int fecha_de_nacimiento, int run) {
        this.nombre = nombre;
        this.fecha_de_nacimiento = fecha_de_nacimiento;
        this.run = run;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", fecha_de_nacimiento=" + fecha_de_nacimiento +
                ", run=" + run +
                '}';
    }

}
