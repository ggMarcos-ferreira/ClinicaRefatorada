/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class ComumProcedimento extends Procedimento implements ProcedimentoCalculavel {
    public ComumProcedimento() {
        super(TipoProcedimento.COMUM);
    }

    @Override
    public float calcularValor() {
        return 150.00f;
    }

    @Override
    public String imprimirDetalhes() {
        return "\tprocedimento comum";
    }
}