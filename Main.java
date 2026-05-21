public class Main{
    public static void main(String[] args) {
        Figura f = new Figura();
        Figura circulo = new Circulo(8);
        Figura rectangulo = new Rectangulo(8, 4);
        f.calcularArea();
        circulo.calcularArea();
        rectangulo.calcularArea();
        System.out.println();
    }
}