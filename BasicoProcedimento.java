/**
 *
 * @author gabriel
 */
public class BasicoProcedimento extends Procedimento implements ProcedimentoCalculavel {
    public BasicoProcedimento() {
        super(TipoProcedimento.BASICO);
    }

    @Override
    public float calcularValor() {
        return 50.00f;
    }

    @Override
    public String imprimirDetalhes() {
        return "\tprocedimento básico";
    }
}
