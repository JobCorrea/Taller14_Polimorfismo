public class Estudiante extends Persona {
    private String nombre;
    private String matricula;

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy " + nombre + " y soy estudiante con matricula: " + matricula);
    }
}