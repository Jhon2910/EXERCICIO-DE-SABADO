import java.util.Scanner;

public class jonathan1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do usuário: ");
        String usuario = sc.nextLine();
        System.out.print("Digite a senha: ");
        int senha = sc.nextInt();

        if (sc.hasNextInt()){
            System.out.print("Digite apenas números inteiros!");
        }
        else if(sc.hasNextLine()){
            System.out.print("Digite apenas Letras");
        }
        else {
            senha = sc.nextInt();
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
        sc.close();
    }
}
