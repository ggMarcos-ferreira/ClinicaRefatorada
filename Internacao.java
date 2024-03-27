/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
public class Internacao {
    protected TipoLeito tipoLeito;
    protected int qtdeDias;

    public Internacao(TipoLeito tipoLeito, int qtdeDias) {
        this.tipoLeito = tipoLeito;
        this.qtdeDias = qtdeDias;
    }

    public TipoLeito getTipoLeito() {
        return tipoLeito;
    }

    public int getQtdeDias() {
        return qtdeDias;
    }

    public String imprimirDetalhes() {
        return "Tipo de Leito: " + tipoLeito + "\nQuantidade de Dias: " + qtdeDias;
    }

    public float calcularValorDiarias() {
        // Valor fixo por dia de internação
        float valorDiaria = 100.0f; // Exemplo, substitua pelo valor real
        return valorDiaria * qtdeDias;
    }
}

