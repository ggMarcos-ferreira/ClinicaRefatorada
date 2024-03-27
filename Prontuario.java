
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author gabriel
 */
import java.util.HashSet;
import java.util.Set;

public class Prontuario {
    private String nomePaciente;
    private Internacao internacao;
    private Set<Procedimento> procedimentos = new HashSet<>();

    public Prontuario(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public String getNomePaciente() {
        return nomePaciente;
    }

    public void setNomePaciente(String nomePaciente) {
        this.nomePaciente = nomePaciente;
    }

    public Internacao getInternacao() {
        return internacao;
    }

    public void setInternacao(Internacao internacao) {
        this.internacao = internacao;
    }

    public Set<Procedimento> getProcedimentos() {
        return procedimentos;
    }

    public void addProcedimento(Procedimento procedimento) {
        procedimentos.add(procedimento);
    }

    // Método para calcular o valor total dos procedimentos
    public float calcularValorTotalProcedimentos() {
        return CalculadoraValorProcedimentos.calcularValorTotal(procedimentos);
    }

    // Método para imprimir detalhes dos procedimentos
    public String imprimirDetalhesProcedimentos() {
        return ImpressoraDetalhesProcedimentos.imprimirDetalhes(procedimentos);
    }
}
