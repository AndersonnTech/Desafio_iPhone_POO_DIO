import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
			Scanner scanner = new Scanner (System.in);
			
			
			IPhone iPhone = new IPhone();
			
			int option = -1;
			do {
				System.out.println("===============Inicio===================\n");
				
				System.out.println("Escolha a opção que deseja utilizar no seu iPhone:");
			
				System.out.println("1- Tocar uma musica");
				System.out.println("2- Pausar uma musica");
				System.out.println("3- Selecionar uma musica");
				System.out.println("4- Fazer uma ligação");
				System.out.println("5- Atender uma chamada");
				System.out.println("6- Ouvir o correio de voz");
				System.out.println("7- Exibir uma pagina web");
				System.out.println("8- Adicionar nova aba no navegador web");
				System.out.println("9- Atualizar a pagina web");
				System.out.println("0 - Para encerrar");
				
				System.out.print("\nDigite a opção desejada: ");
				option = scanner.nextInt();
				
				switch (option) {
				
				case 1 : 
					System.out.println("\n" + iPhone.tocarMusica() + "\n");
					break;
					
				case 2 : 
					System.out.println("\n" + iPhone.pausarMusica() + "\n");
					break;
					
				case 3 : 
					System.out.println("\n" + iPhone.selecionarMusica() + "\n");
					break;
					
				case 4 : 				
					String numeroTelefonico = "99-9999-9999";
					System.out.println("\n" + iPhone.ligar(numeroTelefonico) + "\n");
					break;
					
				case 5 :
					System.out.println("\n" + iPhone.pausarMusica());
					System.out.println("\n" + iPhone.atender() + "\n");
					break;
					
				case 6 :					
					System.out.println("\n" + iPhone.iniciarCorreioVoz() + "\n");
					break;
				
				case 7 :
					String paginaURL = "google.com.br";
					System.out.println("\n" + iPhone.exibirPagina(paginaURL) + "\n");
					break;
				
				case 8 :					
					System.out.println("\n" + iPhone.adicionarNovaAba() + "\n");
					break;
				
				case 9 :					
					System.out.println("\n" + iPhone.atualizarPagina() + "\n");
					break;
				
				default : System.out.println("\n ==========PROGRAMA ENCERRADO========== \n");
				}
				
			}while (option != 0) ;
				
			
			
			
			
			scanner.close();

	}

}
