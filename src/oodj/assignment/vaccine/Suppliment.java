/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oodj.assignment.vaccine;

/**
 *
 * @author teyji
 */
public class Suppliment {
    
    private final String name;
    private int stocks;
    
    public Suppliment(String name, int stock){
        this.name= name;
        this.stocks = stock;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setStock(int i ){
        this.stocks = i;
    }
    
    public void addStock(int i ){
        this.stocks+=i;
    }
    
    public void removeStock(int i){
        this.stocks-=i;
    }
    
    public int getStock(){
        return this.stocks;
    }
    public void use(){
        this.stocks-=1;
    }
    
    public boolean checkStock(){
        return this.stocks>0;
    }
    
}
