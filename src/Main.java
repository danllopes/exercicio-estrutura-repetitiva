import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        short option;

        System.out.println("Para acessar os enunciados dos exercícios, " +
                "\nvá até a pasta 'documentação' e abra o arquivo PDF\n");

        System.out.println("OPÇÃO        EXERCÍCIO\n" +
                "----------------------\n" +
                "  1              01\n" +
                "  2              02\n" +
                "  3              03\n" +
                "  4              04\n" +
                "----------------------\n");

        System.out.print("Exercício Nº: ");
        option = sc.nextShort();

        for(int i = 0; i < 10; i++) {
            System.out.println();
        }

        switch (option) {
            case 1:

                System.out.println("Exercicio 01\n" +
                        "------------");

                System.out.print("Insira a senha: ");
                int password = sc.nextInt();

                while(password != 2002) {
                    System.out.println("\nSenha Inválida! Tente novamente.\n");
                    System.out.print("Insira a senha: ");
                    password = sc.nextInt();
                }

                System.out.println("""

                        ----------------
                        Acesso Permitido
                        ----------------""");
                break;

            case 2:

                System.out.println("Exercicio 01\n" +
                        "------------");
                int gasoline = 0;
                int ethanol = 0;
                int diesel = 0;

                System.out.println("OPÇÃO          COMBUSTÍVEL\n" +
                                   "--------------------------\n" +
                                   "  1             Gasolina\n" +
                                   "  2             Álcool\n" +
                                   "  3             Diesel\n" +
                                   "--------------------------\n" +
                                   "  Para obter o relatório\n " +
                                   "   insira o número: 4\n" +
                                   "--------------------------\n");

                System.out.print("Opção: ");
                int selection = sc.nextInt();

                while(selection != 4) {

                    if(selection == 1) {
                        gasoline++;
                    } else if(selection == 2) {
                        ethanol++;
                    } else if(selection == 3){
                        diesel++;
                    } else {
                        System.out.println("\nOpção inválida!\n");
                    }

                    System.out.print("Opção: ");
                    selection = sc.nextInt();
                }

                System.out.printf("\nMUITO OBRIGADO!\n" +
                                   "Gasolina: %d\n" +
                                   "Álcool: %d\n" +
                                   "Diesel: %d", gasoline, ethanol, diesel);

                break;

            case 3:

                System.out.println("Exercicio 01\n" +
                                   "------------");

                int result = 1;

                System.out.print("\nNúmero INTEIRO que será fatorado: ");
                int number = sc.nextInt();

                for(int i = 1; i <= number; i++) {
                    result *= i;
                }

                System.out.printf("\nResultado da Expressão %d!: %d", number, result);

                break;

            case 4:
                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}