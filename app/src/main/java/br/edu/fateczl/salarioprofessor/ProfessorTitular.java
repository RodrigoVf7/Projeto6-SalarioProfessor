package br.edu.fateczl.salarioprofessor;

public class ProfessorTitular extends Professor {
    private int anosInstituicao;
    private double salario;

    public ProfessorTitular(String nome, String matricula, int idade, int anosInstituicao, double salario) {
        super(nome, matricula, idade);
        this.anosInstituicao = anosInstituicao;
        this.salario = salario;
    }

    public int getAnosInstituicao() {
        return anosInstituicao;
    }

    public void setAnosInstituicao(int anosInstituicao) {
        this.anosInstituicao = anosInstituicao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public double calcSalario() {
        int incrementYears = anosInstituicao / 5;
        return salario * (1 + (incrementYears * 0.05));
    }
}

