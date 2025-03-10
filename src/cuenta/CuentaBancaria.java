/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuenta;

/**
 *
 * @author SAM
 */
public class CuentaBancaria {
    private double saldo;
    
    public CuentaBancaria(double saldoInicial){
        this.saldo=saldoInicial;
    }
    
    public void depositar(double cantidad){
        if (cantidad >0){
            saldo+=cantidad;
            System.out.print(" Deposito exitoso.  Nuevo saldo: $ " +saldo);
        }else{
            System.out.print(" La cantidad a depositar debe ser mayor a 0");
        }
    }
    
    public boolean retirar(double cantidad){
        if (cantidad<0 && cantidad<=saldo){
            saldo-=cantidad;
            System.out.print(" retiro exitoso.  Nuevo saldo: $ "+saldo);
            return true;
    } else{
    System.out.print(" Fondos insuficientes o cantidad no valida");
    return false;
    }
  }   
    public double getSaldo(){
        return saldo;
    }
}
