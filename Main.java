public class Main{
    public static void main(String[] args) {

        Figura f = new Figura();
        Figura circulo = new Circulo(8);
        Figura rectangulo = new Rectangulo(8, 4);
        f.calcularArea();
        circulo.calcularArea();
        rectangulo.calcularArea();
        System.out.println();

        Persona persona = new Persona();
        Persona estudiante = new Estudiante("Juan", "2024-001");
        Persona profesor = new Profesor("Carlos", "POO");

        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
        System.out.println();
    }
}