/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class ApartamentoInternacao extends Internacao {
    private int qtdeDias;

    public ApartamentoInternacao(int qtdeDias) {
        super(TipoLeito.APARTAMENTO, qtdeDias);
        this.qtdeDias = qtdeDias;
    }

    public float calcularValorDiarias() {
        if (qtdeDias <= 3) {
            return 100.00f * qtdeDias;
        } else if (qtdeDias <= 8) {
            return 90.00f * qtdeDias;
        } else {
            return 80.00f * qtdeDias;
        }
    }

    public String imprimirDetalhes() {
        return "\t" + qtdeDias + " diária" + (qtdeDias > 1 ? "s" : "") + " em apartamento";
    }
}