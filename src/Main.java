import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre: ");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido: ");
        int dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dia de nacimiento: "));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su mes de nacimiento: "));
        int anio = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su año de nacimiento: "));

        FrecuenciasCardiacas persona1 = new FrecuenciasCardiacas(nombre,apellido,dia,mes,anio);

        persona1.imprimirDatos();
        System.out.println("La edad de " + persona1.obtenerNombre() + " es " + persona1.calcularEdad());
        System.out.println("Su frecuencia cardiaca maxima es: " + persona1.calcularFrecuenciaCardiacaMaxima());
        System.out.println("Y su rango de frecuencia esperada es : " + persona1. calcularFrecuenciaCardiacaEsperada());

    }
}
