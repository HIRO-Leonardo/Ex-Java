/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JogoDaVelha;

/**
 *
 * @author leona
 */
public class Campo {
    private char simbolo;
    
    
    public Campo(){
        this.simbolo = ' ';
        
    }
    
    public char getSimbolo(){
        return this.simbolo;
        
    }
    
    public void setSimbolo(char simbolo){
        if (this.simbolo == ' ') {
            this.simbolo = simbolo;
        }else{
            System.out.println("Campo ja usado");
            
            
        }
        
        
    }
}
