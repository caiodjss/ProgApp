/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author 013.397490
 */
public class ModeloCliente {
    private String jnome;
    private String jemail;
    
    public String getJnome (){
        return jnome;
    }    
    public String getJemail (){
        return jemail;
    } 
    public void setJnome (String jnome){
        this.jnome = jnome;
    }
    public void setJemail (String jemail){
        this.jemail = jemail;
    }
}