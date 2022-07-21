package br.com.integracao;
import java.io.IOException;

public class InterfaceMenu {
    public static void MenuPrincipal() throws InterruptedException, IOException
    {   
        System.out.print("|------------------------------------------------------|\n");
        System.out.print("| [1] Ver todos os Filmes                              |\n");
        System.out.print("| [2] Avaliar um filme                                 |\n");
        System.out.print("| \u001b[31m[3]\u001b[0m - Sair\u001b[0m                                           |\n");
        System.out.print("|------------------------------------------------------|\n");
        System.out.print("Digite uma opção: ");
    }
    public static void MenuFilmes() throws InterruptedException, IOException
    {   
        System.out.println("## -- LISTA DE FILMES DOS 250 FILMES -- ##\n");
    }
    
}
