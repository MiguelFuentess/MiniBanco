package Dependencias;

/**
 *
 * @author  Miguel Fuentes
 */
public class CuentaCorriente extends CuentaBancaria{

    private double limiteSobregiro;

    public CuentaCorriente(String titular, double saldo, double limiteSobregiro) {
        super(titular, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }
    @Override
    public void mostrarDetalles(){
    
        System.out.println("Cuenta de ahorros -Titular: "+getTitular()+", Saldo: "+getSaldo()+", Limite de sobregiro: "+getLimiteSobregiro()+"%");
        
    }
    @Override
    public void retirar(double cantidad){
        
        if(cantidad > 0 && (getSaldo() + limiteSobregiro) >= cantidad){
                super.retirar(cantidad);
              }
        
        }
}
