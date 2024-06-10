import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double saldo = 0.00;
    double limite = 500.00;
    String extrato = "";
    int limiteSaques = 0;
    String menu = """
        [1] Depositar
        [2] Sacar
        [3] Extrato
        [0] Sair
        => 
        """;
    
        while (true){
            System.out.println(menu);
            int opcao = scanner.nextInt();
    
            if (opcao == 1) {
                System.out.println("Digite um valor a ser depositado: \n");
                double deposito = scanner.nextDouble();
                if (deposito<0) {
                    System.out.println(" valor invalido, digite um valor acima de zero. \n");
                    deposito = scanner.nextDouble();
                }
                if (deposito>0) {
                    System.out.println("deposito realizado com sucesso. \n");
                    saldo+= deposito;
                    System.out.println("saldo atual: R$ " + saldo + "\n");
                    extrato+= "Deposito: R$ " + deposito + "\n";
                    System.out.println("Deposito realizado com sucesso. \n");    
                }
            }
            else if (opcao == 2) {
                if (limiteSaques<3) {
                    System.out.println("Digite o valor a ser sacado. \n");
                    double saque = scanner.nextDouble();
                    if (saque>0 && saque <= limite && saque<=saldo) {
                        System.out.println("Saque realizado com sucesso. \n");
                        saldo-= saque;
                        System.out.println("Saque: R$ " + saque);
                        extrato+= "saque: R$ " +saque + "\n";
                        limiteSaques+= 1;
                    }
                    else if (saque< 0) {
                        System.out.println("Valor invalido, digite um valor acima de zero \n");
                    }
                    else if (saque> limite) {
                        System.out.println("valor acima do limite, por favor insira um valor menor ou igual a R$ "+ limite + "\n");
                    }
                    else if (saque> saldo) {
                        System.out.println("valor acima do saldo, por favor insira um valor menor ou igual a R$ " + saldo + "\n");    
                    }
                    else if (limiteSaques > 3) {
                        System.out.println("Limite de saque atingido \n");
                    }
                }

            }
            else if (opcao == 3) {
                System.out.println(extrato);
            }
            else if (opcao == 0) {
                break;
            }
                        
        }
                        
    }      
                    
}
         
     



