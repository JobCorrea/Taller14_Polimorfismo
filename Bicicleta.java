public class Bicicleta extends Vehiculo {
    protected String color;

    public Bicicleta(String color) {
        this.color = color;
    }

    @Override
    public void mover() {
        System.out.println("La bicicleta de color " + color + " se esta moviendo");
    }
}