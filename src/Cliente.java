public class Cliente {
    private String rut;
    private String nombres;
    private String apellidos;
    private int telefono;
    private String afp;
    private String direccion;
    private String comuna;
    private int edad;

    public Cliente() {
        this.rut= "";
        this.nombres= "";
        this.apellidos= "";
        this.telefono= 5;
        this.afp= "";
        this.direccion= "";
        this.comuna= "";
        this.edad= 89;
    }


   /* public Cliente(String nombres, int telefono, String comuna){
        this.nombres=nombres;
        this.telefono=telefono;
        this.comuna=comuna;
    }*/
    public Cliente(String rut, String nombres, String apellidos, int telefono, String afp, String direccion, String comuna, int edad) {
        this.rut = rut;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.direccion = direccion;
        this.comuna = comuna;
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "rut='" + rut + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", telefono=" + telefono +
                ", afp='" + afp + '\'' +
                ", direccion='" + direccion + '\'' +
                ", comuna='" + comuna + '\'' +
                ", edad=" + edad +
                '}';
    }

}
