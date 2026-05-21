public class Profesor extends Persona {
    private String nombre;
    private String materia;

    public Profesor(String nombre, String materia) {
        this.nombre = nombre;
        this.materia = materia;
    }

    @Override
    public void presentarse() {
        System.out.println("Hola soy el profesor " + nombre + " y dicto la materia: " + materia);
    }
}