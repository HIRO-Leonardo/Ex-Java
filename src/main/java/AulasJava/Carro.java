/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AulasJava;

/**
 *
 * @author leona
 */
public class Carro {
    private String nome;
    private Boolean ligado;
    private Boolean destruido;
    private int blindagem;
    private Boolean armamento;
    
    
    public Carro(String nome){
        this.nome= nome;
        this.ligado = false;
        this.destruido = false;
        this.blindagem = 0;
        this.armamento = false;
        
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Boolean getLigado(){
        return this.ligado;
    }
    
    public void setLigado(Boolean ligado){
        this.ligado = ligado;
    }
    
    public Boolean getDestruido(){
        return this.destruido;
    }
    
    public void setDestruido(Boolean destruido){
        this.destruido = destruido;
    }
    
    public int getBlindagem(){
        return this.blindagem;
    }
    
    public void setBlindagem(int blindagem){
        this.blindagem = blindagem;
    }
    
    public Boolean getArmamento(){
        return this.armamento;
    }
    
    public void setArmamento(Boolean armamento){
        this.armamento = armamento;
    }
    
    public void info(){
        System.out.println("--------------------------------------------");
        System.out.printf("%s%n", this.nome);
        System.out.printf("%s%n", this.ligado ? "LIGADO" : "DESLIGADO");
        System.out.printf("%d%n", this.blindagem);
        System.out.printf("%s%n", this.destruido ? "Sim" : "Nao");
        System.out.printf("%s%n", this.armamento ? "Armado" : "Desarmado");
        
    }
    
    
    
    
}
