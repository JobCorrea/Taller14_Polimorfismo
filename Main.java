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

        //Pruebas error
        // ERROR: referencia de Persona no conoce estudiar()
        Persona p = new Persona();
        //p.estudiar(); // Error de compilación -The method estudiar() is undefined for the type Persona-

        // Polimorfismo: referencia de Vehiculo 
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo coche = new Coche("BMW");
        Vehiculo bicicleta = new Bicicleta("Roja");

        vehiculo.mover();
        coche.mover();
        bicicleta.mover();
    }
}