Aluno: Marcos Gabriel de Sousa Ferreira    TSI-P5

Padrões GRASP:
Criador: O princípio do Criador é observado quando uma classe (RefatoraClinica) é responsável por criar instâncias de outras classes relacionadas (Prontuario, Internacao, etc.).

Especialista em Informação: A classe Internacao possui métodos para calcular o valor das diárias e imprimir os detalhes da internação, tornando-se especialista em suas próprias informações.

Controlador: A classe RefatoraClinica age como um controlador, coordenando a interação com o usuário e fazendo chamadas para métodos em outras classes para realizar operações específicas.

Princípios SOLID:
Princípio da Responsabilidade Única (SRP): Cada classe tem uma única responsabilidade. Por exemplo, 
a classe Internacao é responsável por representar uma internação e calcular o valor das diárias, enquanto a classe RefatoraClinica é responsável pela interação com o usuário e pela impressão da conta.

Princípio da Segregação de Interfaces (ISP): Embora não haja interfaces explícitas nos exemplos fornecidos, podemos considerar que cada classe expõe apenas os métodos necessários para seu uso. 
Isso evita a dependência de métodos não utilizados.

Princípio da Inversão de Dependência (DIP): As classes dependem de abstrações (TipoLeito, Procedimento, etc.) 
em vez de implementações concretas, o que permite maior flexibilidade e extensibilidade do código.
