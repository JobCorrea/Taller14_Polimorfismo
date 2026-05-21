public class Circulo extends Figura {
    protected double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double op(){
        return Math.PI*radio*radio;
    }

    @Override
    public void calcularArea(){
       System.out.println("El area de circulo es: "+op());
    }

}
