package Dependencias;

/**
 *
 * @author  Miguel Fuentes
 */
public class CuentaAhorros extends CuentaBancaria{
    
    private double tasaInteres;

    public CuentaAhorros(String titular, double saldo, double tasaInteres) {
        super(titular, saldo);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }
    
    @Override
    public void mostrarDetalles(){
    
        System.out.println("Cuenta de ahorros -Titular: "+getTitular()+", Saldo: "+getSaldo()+", Tasa de interes: "+getTasaInteres()+"%");
        
    }
        
}