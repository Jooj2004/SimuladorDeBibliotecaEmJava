/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registro_livros;

import Interfaces.CSVGenerator;

/**
 *
 * @author Pichau
 */
public class Livros implements CSVGenerator{
    
    //Atributos
    private String nome;
    private Autor autor;
    private String editora;
    private String cidade;
    private int ano;
    private int numeroEdicao;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Autor getAutor() {
        return autor;
    }
    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }
    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getCidade() {
        return cidade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getNumeroEdicao() {
        return numeroEdicao;
    }
    public void setNumeroEdicao(int numeroEdicao) {
        this.numeroEdicao = numeroEdicao;
    }
    
    
    
    //Métodos
    public Livros(){
        numeroEdicao = 99999;
    }
    
    /*
    public void Imprimir(){
        System.out.println(" -------------------------------- ");
        System.out.println("Nome do livro: "+nome);
        System.out.println("Nome do autor: "+autor.nome);
        System.out.println("Nome da editora: "+editora);
        System.out.println("Nome da cidade do livro: "+cidade);
        System.out.println("Ano da publicação: "+ano);
        System.out.println("Número da edição: "+numeroEdicao);
        System.out.println(" -------------------------------- ");
    }
    <nome_do_livro>;<autor.nome>;<cidade>;<editora>;<ano>
    */
    

    public Livros(String nome, Autor autor, String editora, String cidade, int ano, int numeroEdicao) {
        this.nome = nome;
        this.autor = autor;
        this.editora = editora;
        this.cidade = cidade;
        this.ano = ano;
        this.numeroEdicao = numeroEdicao;
    }

    @Override
    public String generateCSV() {
        return this.nome+";"+this.autor.getNome()+";"+this.cidade+";"+this.editora+";"+this.ano;
    }
    
    
}
