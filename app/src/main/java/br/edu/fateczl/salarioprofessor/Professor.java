package br.edu.fateczl.salarioprofessor;

public abstract class Professor {

    /*
     *@author: RODRIGO VINICIUS FERRAZ DA SILVA
     *@RA: 1110482313043
     */

    private String nome;
    private String matricula;
    private int idade;

    public Professor(String nome, String matricula, int idade) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Abstract method for calculating salary
    public abstract double calcSalario();
}

