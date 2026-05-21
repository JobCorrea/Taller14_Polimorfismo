public class Rectangulo extends Figura{
    protected double base;
    protected double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double op(){
        return base*altura;
    }
    @Override
    public void  calcularArea(){
        System.out.println("El area de rectangulo es: "+ op());
    } 
}
