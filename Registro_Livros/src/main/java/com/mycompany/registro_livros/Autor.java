/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_livros;

/**
 *
 * @author Pichau
 */
public class Autor extends Pessoa{
    private String Genero;
    private String Formacao; /*(“Especialista”, “Mestre”, “Doutor” ou nada)*/

    
    public String getGenero() {
        return Genero;
    }
    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    public String getFormacao() {
        return Formacao;
    }
    public void setFormacao(String Formacao) {
        this.Formacao = Formacao;
    }
    
}
