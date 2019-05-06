public class Retangulo implements ICalcGeometria{

    private double altura;
    private double base;

    public Retangulo(double altura) {
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcArea() {
        return this.altura * this.base;
    }

    @Override
    public double calcPerimetro() {
        return ((this.base + this.altura) * 2);
    }
}
