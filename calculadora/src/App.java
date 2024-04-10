import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        String resposta = "s";
        while (resposta.equals("s")) {
            System.out.println("Qual tipo de operação você deseja fazer?");
            System.out.println("[+] Soma");
            System.out.println("[-] Subtração");
            System.out.println("[/] Divisão");
            System.out.println("[*] Multiplicação");

            

            String operador = scanner.next();

            System.out.println("Digite o primeiro número:");
            float n1 = validarNumero(scanner);

            System.out.println("Digite o segundo número:");
            float n2 = validarNumero(scanner);

            switch (operador) {
                case "+":
                    System.out.println("Soma: "+ (n1 + n2) );
                    break;
            
                case "-":
                    System.out.println("Subtração: "+ (n1 - n2) );
                    break;

                case "/":
                    if (n2 == 0) {
                        System.out.println("Erro divisão por zero."); 
                    } else {
                        System.out.println("Divisão: "+ (n1 / n2) );
                    }
                    break;
                
                case "*":
                    System.out.println("Multiplicação: "+ (n1 * n2) );
                    break;
                default:
                    System.out.println("Digite um operador valido.");
            }

            System.out.println("Fazer outra conta? [s] [n]");
            resposta = scanner.next();
        }

        scanner.close();
        System.out.println("Calculadora fechada.");
    }

    public static float validarNumero(Scanner scanner) {
        while (!scanner.hasNextFloat()) {
            System.out.println("Digite um número válido:");
            scanner.next();
        }
        return scanner.nextFloat();
    }
}
