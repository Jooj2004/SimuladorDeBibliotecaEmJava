/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registro_livros;

/**
 *
 * @author Pichau
 */
public class Registro_Livros {

    public static void main(String[] args) {
        Livros A = new Livros();
        Livros B = new Livros();
        Livros C = new Livros();
        Livros D = new Livros();
        
        Autor autorA = new Autor();
        autorA.setNome("Khaled Hosseini");
        autorA.setIdade(55);
        autorA.setCidade_Nascimento("Kabul");
        autorA.setGenero("Masculino");
        autorA.setFormacao("Doutor");
        
        Autor autorB = new Autor();
        autorB.setNome("Victor Hugo");
        autorB.setIdade(85);
        autorB.setCidade_Nascimento("Besançon");
        autorB.setGenero("Masculino");
        autorB.setFormacao("Doutor");
        
        Autor autorC = new Autor();
        autorC.setNome("Fernando Rossi");
        autorC.setIdade(35);
        autorC.setCidade_Nascimento("Curitiba");
        autorC.setGenero("Masculino");
        autorC.setFormacao("Especialista");
        
        Autor autorD = new Autor();
        autorD.setNome("Getulho Vargas Shetter");
        autorD.setIdade(92);
        autorD.setCidade_Nascimento("Porto Alegre");
        autorD.setGenero("Masculino");
        autorD.setFormacao("Mestre");
        
        A.setNome("O Caçador de Pipas");
        A.setAutor(autorA);
        A.setEditora("Nova Fronteira");
        A.setCidade("Rio de Janeiro");
        A.setAno(2005);
        A.setNumeroEdicao(987564);
        
        B.setNome("Os Miseráveis");
        B.setAutor(autorB);
        B.setEditora("Gallimard");
        B.setCidade("São Paulo");
        B.setAno(1862);
        B.setNumeroEdicao(346788);
        
        C.setNome("As Viajens de Bruno Colgate");
        C.setAutor(autorC);
        C.setEditora("Sorrisos Prudoct");
        C.setCidade("Rosário do Sul");
        C.setAno(2021);
        C.setNumeroEdicao(129866);
        
        D.setNome("Alfredo o Gigante Anão");
        D.setAutor(autorD);
        D.setEditora("Marvel");
        D.setCidade("Lisboa");
        D.setAno(2009);
        D.setNumeroEdicao(456677);
        
        System.out.println(A.generateCSV());
        System.out.println(B.generateCSV());
        System.out.println(C.generateCSV());
        System.out.println(D.generateCSV());

    }
}
