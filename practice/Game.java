import java.util.Scanner;

public class Game {
	
	static char[][] velha = {
			{' ', ' ', ' '},
			{' ', ' ', ' '},
			{' ', ' ', ' '}
	};
	static short gameOver = 0;
	
	static String[] jogador = new String[2];

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		short col, lin, contador = 0;
		
		nomeJogador();
		
		while(gameOver != 1) {
			if(contador == 3) {
				gameOver = 1;
			}
			
			mostrar();
			System.out.println(contador);
			System.out.println(gameOver);
			
			System.out.println("Faça sua jogada (" + jogador[0] + "): ");
			System.out.print("Digite a coluna: ");
			col = scanner.nextShort();
			
			System.out.print("Digite a linha: ");
			lin = scanner.nextShort();
			
			velha[col][lin] = 'X';
			
			mostrar();
			
			System.out.println("Faça sua jogada (" + jogador[1] + "): ");
			System.out.print("Digite a coluna: ");
			col = scanner.nextShort();
			
			System.out.print("Digite a linha: ");
			lin = scanner.nextShort();
			
			velha[col][lin] = 'O';
			
			mostrar();
			contador++;
			
			
		}
		
		scanner.close();
	}
	
	public static void mostrar() {
		System.out.println();
		for(int i = 0; i <= 2; i++ ) {
			System.out.println(velha[i][0] + " | " + velha[i][1] + " | " + velha[i][2]);
		}
		System.out.println();
		
		if((velha[0][0] == 'X' && velha[0][1] == 'X' && velha[0][2] == 'X') ||
				(velha[1][0] == 'X' && velha[1][1] == 'X' && velha[1][2] == 'X') ||
				(velha[2][0] == 'X' && velha[2][1] == 'X' && velha[2][2] == 'X') ||
				(velha[0][0] == 'X' && velha[1][0] == 'X' && velha[2][0] == 'X') ||
				(velha[0][1] == 'X' && velha[1][1] == 'X' && velha[2][1] == 'X') ||
				(velha[0][2] == 'X' && velha[1][2] == 'X' && velha[2][2] == 'X') ||
				(velha[0][0] == 'X' && velha[1][1] == 'X' && velha[2][2] == 'X') ||
				(velha[0][2] == 'X' && velha[1][1] == 'X' && velha[2][0] == 'X')) {
			System.out.printf("O %s venceu!", jogador[0]);
			gameOver = 1;
		}
		
		if((velha[0][0] == 'O' && velha[0][1] == 'O' && velha[0][2] == 'O') ||
				(velha[1][0] == 'O' && velha[1][1] == 'O' && velha[1][2] == 'O') ||
				(velha[2][0] == 'O' && velha[2][1] == 'O' && velha[2][2] == 'O') ||
				(velha[0][0] == 'O' && velha[1][0] == 'O' && velha[2][0] == 'O') ||
				(velha[0][1] == 'O' && velha[1][1] == 'O' && velha[2][1] == 'O') ||
				(velha[0][2] == 'O' && velha[1][2] == 'O' && velha[2][2] == 'O') ||
				(velha[0][0] == 'O' && velha[1][1] == 'O' && velha[2][2] == 'O') ||
				(velha[0][2] == 'O' && velha[1][1] == 'O' && velha[2][0] == 'O')) {
			System.out.printf("O %s venceu!", jogador[0]);
			gameOver = 1;
		}
	}
	
	public static void nomeJogador() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Digite o nome do jogador 1: ");
		jogador[0] = scan.nextLine();
		
		System.out.print("Digite o nome do jogador 2: ");
		jogador[1] = scan.nextLine();
		
		System.out.println();
		//scan.close();
	}
	

}
