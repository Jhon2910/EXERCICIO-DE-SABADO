import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String usuario = sc.nextLine();
        int senha = sc.nextInt();

        System.out.print("Digite o nome do usuário: ");
        System.out.print("Digite a senha:");

        if (sc.hasNextInt()){
            System.out.print("Digite apenas números inteiros!");
        }
        else if(sc.hasNextLine()){
            System.out.print("Digite apenas Letras");
        }
        else {
            if (usuario.equals("admin")) {//validação apenas para String
                if (senha == 12345) {
                    System.out.print("Acesso concedido.Bem-vindo,admin!");
                } else {
                    System.out.print("Senha incorreta!");
                }
            } else {
                System.out.print("Usuário não encontrado");
            }
        }
    }
}
