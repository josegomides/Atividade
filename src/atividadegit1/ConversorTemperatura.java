package atividadegit1;

public class ConversorTemperatura {
    double celsius, fahrenheit;

    
            
    public ConversorTemperatura(double celsius) {
        this.celsius = celsius;
    }

    
    public void celsiusFah(){
        fahrenheit = celsius * 1.8 + 32;
        System.out.println("O RESULTADO E:  :   "+ fahrenheit);
    }
}
