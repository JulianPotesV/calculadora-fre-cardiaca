public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaDeNacimiento;
    private int mesDeNacimiento;
    private int anioDeNacimiento;

    FrecuenciasCardiacas(String nombre, String apellido, int diaDeNacimiento, int mesDenacimiento,int anioDeNacimiento){

        this.nombre = nombre;
        this.apellido = apellido;
        this.diaDeNacimiento = diaDeNacimiento;
        this.mesDeNacimiento = mesDenacimiento;
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public void establecerNombre(String nombre){
        this.nombre = nombre;
    }

    public String obtenerNombre(){
        return nombre;
    }

    public void establecerApellido(String apellido){
        this.apellido = apellido;
    }

    public String obtenerApellido(){
        return apellido;
    }

    public void establecerDiaDeNacimiento(int diaDeNacimiento){
        this.mesDeNacimiento = diaDeNacimiento;
    }

    public int obtenerDiaDeNacimiento(){
        return diaDeNacimiento;
    }

    public void establecerMesDenacimiento(int mesDenacimiento){
        this.mesDeNacimiento = mesDenacimiento;
    }

    public int obtenerMesDenacimiento(){
        return mesDeNacimiento;
    }

    public void establecerAnioDeNacimiento(int anioDeNacimiento){
        this.anioDeNacimiento = anioDeNacimiento;
    }

    public int obteneranioDeNacimiento(){
        return anioDeNacimiento;
    }

    public int calcularEdad(){
        int edad = 2023 - this.anioDeNacimiento;
        return edad;
    }

    public int calcularFrecuenciaCardiacaMaxima(){
        int edad = calcularEdad();
        int frecuanciaCardiaca = 220 - edad;
        return frecuanciaCardiaca;
    }

    public double calcularFrecuenciaCardiacaEsperada(){
        int frecuenciaCardiacaMaxima = calcularFrecuenciaCardiacaMaxima();
        return (double) (70 * frecuenciaCardiacaMaxima) /100;
    }

    public void imprimirDatos(){
        System.out.println("Los datos del usuario son los siguinetes:");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);

        String mesDeNacimiento = switch (this.mesDeNacimiento) {

            case 1 -> "enero";
            case 2 -> "febrero";
            case 3 -> "marzo";
            case 4 -> "abril";
            case 5 -> "mayo";
            case 6 -> "junio";
            case 7 -> "julio";
            case 8 -> "agosto";
            case 9 -> "septiembre";
            case 10 -> "octubre";
            case 11 -> "noviembre";
            case 12 -> "diciembre";
            default -> null;
        };

        System.out.println("Fecha de nacimiento: " + this.diaDeNacimiento + " de " + mesDeNacimiento + " de " + this.anioDeNacimiento);

    }

}
