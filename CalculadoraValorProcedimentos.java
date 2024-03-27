/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
import java.util.Set;

public class CalculadoraValorProcedimentos {
    public static float calcularValorTotal(Set<Procedimento> procedimentos) {
        float total = 0.0f;
        for (Procedimento procedimento : procedimentos) {
            if (procedimento instanceof ProcedimentoCalculavel) {
                total += ((ProcedimentoCalculavel) procedimento).calcularValor();
            }
        }
        return total;
    }
}
