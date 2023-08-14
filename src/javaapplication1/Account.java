/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author anderson.amekaru
 */
public class Account {
    private String name;
    private float saldo;
    
    public void depositar(float valor){
        saldo += valor;
    }
    public float sacar(float valor){
       if(saldo>=valor){
           saldo -= valor;
           return valor;
           
       }else{
           System.out.println("Saldo insulficiente");
       }
        saldo -= valor;
        return valor;
    }
    
    public Account(String name) {
        this.name = name;
    }
    
    public void setName(String name) {
        this.name = name;
        this.saldo = 0.f;
    }
    
    public String getName(){
        return name;
    }
    public float getSaldo(){
        return saldo;
    }

    
   public float getBalance(){
       return saldo;
   }
    
}

