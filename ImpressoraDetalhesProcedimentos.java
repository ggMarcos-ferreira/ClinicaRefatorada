/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gabriel
 */
import java.util.Set;

public class ImpressoraDetalhesProcedimentos {
    public static String imprimirDetalhes(Set<Procedimento> procedimentos) {
        StringBuilder detalhes = new StringBuilder();
        for (Procedimento procedimento : procedimentos) {
            detalhes.append(procedimento.imprimirDetalhes()).append("\n");
        }
        return detalhes.toString();
    }
}




