package atividadegit1;

public class CalculadoraGeometria {
    private double area, lado;
    
    //construtor
    public CalculadoraGeometria(double area, double lado) {
        this.area = area;
        this.lado = lado;        
    }
    
    public void calcularGeo() {
        area = lado * lado;
        System.out.println("A AREA DO QUADRADO E:   "+ area);
    }
}
