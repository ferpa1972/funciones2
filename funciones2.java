import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class funciones2 {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        String marca;
        Scanner ingreso = new Scanner(System.in);
        String placa;
        List<String> autos = new ArrayList<>();
        System.out.println("Ingrese su nombre");
        nombre = ingreso.nextLine();
        System.out.println("Ingrese marca");
        marca= ingreso.nextLine();
        System.out.println("Ingrese su Placa");
        placa = ingreso.nextLine();
        System.out.println(nombre + " " + marca+ " "+ placa);
    }

    
}
