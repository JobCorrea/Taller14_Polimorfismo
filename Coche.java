public class Coche extends Vehiculo {
    protected String marca;

    public Coche(String marca) {
        this.marca = marca;
    }

    @Override
    public void mover() {
        System.out.println("El coche " + marca + " se esta moviendo");
    }
}