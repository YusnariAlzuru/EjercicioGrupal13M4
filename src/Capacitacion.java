public class Capacitacion {
    private int identificador;
    private int rut_cliente;
    private int dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidad_asistentes;

    public Capacitacion() {
        this.identificador = 8225;
        this.rut_cliente = 7458216;
        this.dia = 30;
        this.hora = "";
        this.lugar = "";
        this.duracion = "";
        this.cantidad_asistentes = 10;
    }
    public Capacitacion(int identificador, int rut_cliente, int dia, String hora, String lugar, String duracion, int cantidad_asistentes) {
        this.identificador = identificador;
        this.rut_cliente = rut_cliente;
        this.dia = dia;
        this.hora = hora;
        this.lugar = lugar;
        this.duracion = duracion;
        this.cantidad_asistentes = cantidad_asistentes;
    }
    @Override
    public String toString() {
        return "Capacitacion{" +
                "identificador=" + identificador +
                ", rut_cliente=" + rut_cliente +
                ", dia=" + dia +
                ", hora='" + hora + '\'' +
                ", lugar='" + lugar + '\'' +
                ", duracion='" + duracion + '\'' +
                ", cantidad_asistentes=" + cantidad_asistentes +
                '}';
    }
}
