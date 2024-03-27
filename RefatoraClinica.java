/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author gabriel
 */
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class RefatoraClinica {
    private Prontuario prontuario;

    public RefatoraClinica(Prontuario prontuario) {
        this.prontuario = prontuario;
    }

    public String imprimaConta() {
        StringBuilder conta = new StringBuilder();

        float valorDiarias = 0.0f;
        float valorTotalProcedimentos = 0.0f;

        // Calcular valores das diárias
        if (prontuario.getInternacao() != null) {
            Internacao internacao = prontuario.getInternacao();
            valorDiarias = internacao.calcularValorDiarias();
        }

        // Calcular valores dos procedimentos
        valorTotalProcedimentos = prontuario.calcularValorTotalProcedimentos();

        // Construir a string da conta
        conta.append("----------------------------------------------------------------------------------------------\n");
        conta.append("A conta do(a) paciente ").append(prontuario.getNomePaciente()).append(" tem valor total de ").append(formatarValor(valorDiarias + valorTotalProcedimentos)).append("\n\n");
        conta.append("Conforme os detalhes abaixo:\n\n");

        if (prontuario.getInternacao() != null) {
            Internacao procedimentos = prontuario.getInternacao();
            conta.append("Valor Total Diárias:\n");
            conta.append(procedimentos.imprimirDetalhes()).append("\n");
        }


        if (!prontuario.getProcedimentos().isEmpty()) {
            conta.append("\nValor Total Procedimentos:\n");
            conta.append(prontuario.imprimirDetalhesProcedimentos()).append("\n");
        }

        conta.append("\nVolte sempre, a casa é sua!\n");
        conta.append("----------------------------------------------------------------------------------------------\n");

        return conta.toString();
    }

    private String formatarValor(float valor) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
        return formatter.format(valor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao sistema de prontuário!");

        // Aqui você poderia solicitar entrada do usuário para criar objetos de Prontuario,
        // Internacao, Procedimento, etc., e interagir com esses objetos conforme necessário.

        // Exemplo de criação de um prontuário:
        System.out.println("Digite o nome do paciente:");
        String nomePaciente = scanner.nextLine();
        Prontuario prontuario = new Prontuario(nomePaciente);

        // Exemplo de adição de internação ao prontuário (se necessário):
        System.out.println("Digite o tipo de leito da internação (ENFERMARIA ou APARTAMENTO):");
        String tipoLeito = scanner.nextLine();
        System.out.println("Digite a quantidade de dias de internação:");
        int qtdeDias = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha pendente após o próximo inteiro
        Internacao internacao = new Internacao(TipoLeito.valueOf(tipoLeito), qtdeDias);
        prontuario.setInternacao(internacao);

        // Exemplo de adição de procedimentos ao prontuário (se necessário):
        // Isso pode ser feito de maneira semelhante, solicitando informações do usuário e
        // criando objetos de procedimento correspondentes.

        // Criar um objeto RefatoraClinica com o prontuário criado
        RefatoraClinica refatoraClinica = new RefatoraClinica(prontuario);

        // Imprimir a conta do prontuário
        System.out.println(refatoraClinica.imprimaConta());
    }
}

    