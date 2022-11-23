package avaliacao;

public class jv {
	private String [] [] matriz = {{"1 ","2 ","3"},
								   {"4","5","6"},
								   {"7","8","9"}}; //utiliza-se o private  porque nossa intenção não é utiliza-lo no main; por isso utilizamos o private.

public String imprimir() {
	
	for (int li = 0; li < 3; li++) {
		for (int co = 0; co < 3; co++) {
			System.out.print("   " + matriz[li][co]);
		}
		System.out.println("\n");
	}
		return null;
	}


public boolean Validar(String position) {
	for (int li = 0; li < 3; li++) {
		for (int col = 0; col < 3; col++) {
			if ( matriz[li][col].equals(position)) {
				return true;
			}
		}
	}
	return false;
}


public void jogada(String position, String player) {
	if (position.equals("1")) {
		matriz[0][0] = player;
	}else if (position.equals("2")) {
		matriz[0][1] = player;
	}else if (position.equals("3")) {
		matriz[0][2] = player;
	}else if (position.equals("4")) {
		matriz[1][0] = player;
	}else if (position.equals("5")) {
		matriz [1][1] = player;
	}else if (position.equals("6")) {
		matriz [1][2] = player;
	}else if (position.equals("7")) {
		matriz [2][0] = player;
	}else if (position.equals("8")) {
		matriz [2][1] = player;
	}else if (position.equals("9")) {
		matriz [2][2] = player;
	}
	
	
	
}


public String Wways(int jogadas) { //Possibilidades para que exista um vencedor{
	String[] possibilities = new String [8];
	String winner = "null";
	if (jogadas==9) {
	winner = "Empate";
	}
	//horizontais
	possibilities[0] = matriz[0][0] + matriz[0][1] + matriz[0][2];
	possibilities[1] = matriz[1][0] + matriz[1][1] + matriz[1][2];
	possibilities[2] = matriz[2][0] + matriz[2][1] + matriz[2][2];
	
	//verticais
	possibilities[3] = matriz[0][0] + matriz[1][0] + matriz[2][0];
	possibilities[4] = matriz[0][1] + matriz[1][1] + matriz[2][1];
	possibilities[5] = matriz[0][2] + matriz[1][2] + matriz[2][2];
	
	//diagonais
	possibilities[6] = matriz[0][0] + matriz[1][1] + matriz[2][2];
	possibilities[7] = matriz[0][2] + matriz[1][1] + matriz[2][0];
	
	for (int i = 0; i < possibilities.length; i++) {
		if (possibilities[i].equals("XXX")) {	
			winner = "Jogador 1";
		}else if (possibilities[i].equals("OOO")) {
			winner = "Jogador 2";
		}
	}	
	return winner;
}

}
 
