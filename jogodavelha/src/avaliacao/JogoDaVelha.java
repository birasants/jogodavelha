package avaliacao;

import java.util.Scanner;

public class JogoDaVelha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		jv game = new jv();
		String position;
		int valida = 0; 
		int Jogadas = 0;						
		
		while(true) {
			System.out.println(":::::::::::::::::::::::::::::::::::");
			System.out.println(":::::::::: Jogo Da Velha ::::::::::");
			System.out.println(":::::::::::::::::::::::::::::::::::");
			System.out.println("\n");
			game.imprimir();
			
			do {//inicia jogador 1
				System.out.println("    Jogador 1 informe a posição: ");
				position = sc.next();
				while (!game.Validar(position)) {
					System.out.println("    Jogada invalida, tente novamente!");
					System.out.println("    Jogador 1 informe a posição: ");
					position = sc.next();
					valida = 0;
				}
				game.jogada(position, "X" );
				valida  = 1;
			} while (valida == 0);
			
			Jogadas++;
			valida = 0;
			game.imprimir();
			if (!game.Wways(Jogadas).equals("null")) {
				break;
			}
			do {//inicia jogador 2
				System.out.println("    Jogador 2 informe a posição: ");
				position = sc.next();
				while (!game.Validar(position)) {
					System.out.println("    Jogada invalida, tente novamente!");
					System.out.println("    Jogador 2 informe a posição: ");
					position = sc.next();
					valida = 0;
				}
				game.jogada(position, "O" );
				valida  = 1;
			} while (valida == 0);
			
			Jogadas++;
			valida = 0;
			game.imprimir();
			if (!game.Wways(Jogadas).equals("null")) {
				break;
			}
			
		}
		System.out.println("O "+ game.Wways(Jogadas)+ " venceu!");
	}

}
