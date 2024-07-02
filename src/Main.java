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
                break;

            case 3:
                break;

            case 4:
                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}