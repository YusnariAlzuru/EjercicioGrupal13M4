// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

        public static void main(String[] args) {

            Cliente cliente = new Cliente();
            Cliente clientevalores = new Cliente("785.8559.5","Sebas","Parra",789789,"fonasa","alameda","Santiago",45);

            System.out.println(cliente.toString());
            System.out.println(clientevalores.toString());

            Usuario usuario = new Usuario();
            Usuario usuarioValores = new Usuario("Angelica", 1005,78569854);

            System.out.println(usuario.toString());
            System.out.println(usuarioValores.toString());

            Capacitacion capacitacion = new Capacitacion();
            Capacitacion capacitacionconValores = new Capacitacion(785874,26680015-0,1005,"958","Alameda","457",12);

            System.out.println(capacitacion.toString());
            System.out.println(capacitacionconValores.toString());

        }
    }
