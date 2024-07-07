import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        int opcaoEscolhida = 0;

        String nome = "Joana da Silva";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        double recebe = 0;
        double transferir = 0;

        String dados = """ 
                ***********************
                Dados iniciais do cliente:
                
                Nome: %s
                Tipo conta: %s
                Saldo inicial: %.2f
                ***********************
                """.formatted(nome,tipoConta, saldo);

        String opcoes = """ 
                
                Operações

                1- Consultar saldos
                2- Receber valor
                3- Transferir valor
                4- Sair
                
                Digite a opção desejada:""";

        System.out.println(dados);


        while (opcaoEscolhida != 4){

            System.out.println(opcoes);
            opcaoEscolhida = leitura.nextInt();

            switch (opcaoEscolhida) {
                case 1:
                    System.out.println("O saldo atual é de %.2f".formatted(saldo));
                    break;

                case 2:
                    System.out.println("Informe o valor a receber: ");
                    recebe = leitura.nextDouble();
                    saldo += recebe;
                    System.out.println("Saldo atualizado: %.2f".formatted(saldo));
                    break;

                case 3:
                    System.out.println("Informe o valor que deseja transferir: ");
                    transferir = leitura.nextDouble();
                    saldo -= transferir;
                    System.out.println("Saldo atualizado: %.2f".formatted(saldo));
                    break;

                default:
                    break;
            }
        }
    }
}