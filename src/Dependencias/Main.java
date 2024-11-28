package Dependencias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Miguel Fuentes
 */
public class Main {
    
    private static ArrayList <CuentaBancaria> cuentas = new ArrayList <>();
    private static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        int opcion;
        
        do{
            mostrarMenu();
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1:
                            AgregarcuentaDeAhorros();
                            break;
                case 2:
                            AgregarcuentaCorriente();
                            break;
                 case 3:
                            MsotrarCuentas();
                            break;
                 case 4:
                            System.out.println("Saliendo del programa........");
                            break;
                 default:
                     System.out.println("Opcion invalida");
                    break;

            }
        }while(opcion != 4 );
        
    }
    
    private static void mostrarMenu(){
            System.out.println("Menu del banco");
            System.out.println("1. Agregar cuenta de ahorros");
            System.out.println("2. Agregar cuenta corriente");
            System.out.println("3. Mostrar cuentas");
            System.out.println("4. Salir");
            System.out.println("Seleccione una opcion: ");

    }
    
    private static void AgregarcuentaDeAhorros(){
        System.out.println("Titular: ");
        String titular = entrada.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.println("Tasa de interes: ");
        double tasaInteres = entrada.nextDouble();
        entrada.nextLine();
        
        CuentaAhorros cuentaAhorros = new CuentaAhorros(titular, saldo, tasaInteres);
        cuentas.add(cuentaAhorros);
        System.out.println("Cuenta de ahorros agregada exitosamente. ");    
    }
    
     private static void AgregarcuentaCorriente(){
        System.out.println("Titular: ");
        String titular = entrada.nextLine();
        System.out.println("Saldo inicial: ");
        double saldo = entrada.nextDouble();
        System.out.println("Tasa de interes: ");
        double tasaInteres = entrada.nextDouble();
        entrada.nextLine();
        
        CuentaAhorros cuentaAhorros = new CuentaAhorros(titular, saldo, tasaInteres);
        cuentas.add(cuentaAhorros);
        System.out.println("Cuenta corriente agregada exitosamente. ");    
    }
    
    private static void MsotrarCuentas(){
            if(cuentas.isEmpty()){
                    System.out.println("No hay cuentas registradas");
            
            }else{
                    for(CuentaBancaria cuenta: cuentas){
                        cuenta.mostrarDetalles();
                    }
            }
    
    }
}
