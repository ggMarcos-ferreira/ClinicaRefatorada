/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class EnfermariaInternacao extends Internacao {
    public EnfermariaInternacao(int qtdeDias) {
        super(TipoLeito.ENFERMARIA, qtdeDias);
    }

    public float calcularValorDiarias() {
        if (qtdeDias <= 3) {
            return 40.00f * qtdeDias;
        } else if (qtdeDias <= 8) {
            return 35.00f * qtdeDias;
        } else {
            return 30.00f * qtdeDias;
        }
    }

    public String imprimirDetalhes() {
        return "\t" + qtdeDias + " diária" + (qtdeDias > 1 ? "s" : "") + " em enfermaria";
    }
}

