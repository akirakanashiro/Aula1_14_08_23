/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author anderson.amekaru
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World");
        
        Account conta;
        
        conta = new Account("Akira");
        
        System.out.println("Conta do: "+conta.getName());
        System.out.println("Saldo do:"+conta.getSaldo());
        
        conta.depositar(100000.f);
        
        System.out.println("Saldo do:"+conta.getSaldo());
        conta.sacar(100.f);
        System.out.println("Saldo do:"+conta.getSaldo());
        
    }
    
    
}
