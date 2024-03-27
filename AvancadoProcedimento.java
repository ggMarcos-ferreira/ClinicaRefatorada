/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class AvancadoProcedimento extends Procedimento implements ProcedimentoCalculavel {
    public AvancadoProcedimento() {
        super(TipoProcedimento.AVANCADO);
    }

    @Override
    public float calcularValor() {
        return 500.00f;
    }

    @Override
    public String imprimirDetalhes() {
        return "\tprocedimento avançado";
    }
}

