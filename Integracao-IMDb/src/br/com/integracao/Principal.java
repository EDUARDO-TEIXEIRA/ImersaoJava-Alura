package br.com.integracao;

import br.com.util.*;
import java.util.Scanner;

public class Principal {

	public static void main(final String[] args) throws Exception {
		int opcaoMenu = 0;
		Scanner scanner = new Scanner(System.in);

	 		ConsultaAPI.getFilmes();

	//   do {
	// 		InterfaceMenu.MenuPrincipal();
	// 		opcaoMenu = Integer.parseInt(scanner.nextLine());
	// 		opcaoMenu = scanner.nextInt();

	// 		Utilitarios.ClearConsole();	
			
	// 		InterfaceMenu.MenuFilmes();
	// 		ConsultaAPI.getFilmes();

	// 	} while (opcaoMenu != 3);
	}

}
