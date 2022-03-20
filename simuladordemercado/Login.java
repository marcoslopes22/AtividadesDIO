package simuladordemercado;
import java.util.Scanner;
import java.util.Date;

public class Login {
    public void identificar(){
        String caixa = "Caixa 02";
        Date acesso = new Date();
        Scanner identificarUsuario = new Scanner(System.in);
        String usuarioStatus = "Offline";
        
        System.out.println("\nDesenvolvido por Marcos Aurélio\n");
        
        while(usuarioStatus == "Offline"){
            System.out.print(caixa + " - Digite o nome do responsável: ");
            String nome = identificarUsuario.nextLine();

            switch (nome) {
                case "Marcos":
                    System.out.println("\nResponsável: " + nome + " ; Status: " + usuarioStatus + " ; Acesso: " + acesso);
                    usuarioStatus = "Online";
                    break;
            
                default:
                    usuarioStatus = "Offline";
                    System.out.println("\nAcesso negado, esse operador não é responsável pelo " + caixa);
                    break;
            }
        }

    }
}
