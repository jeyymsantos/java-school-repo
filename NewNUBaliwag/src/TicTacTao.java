import java.util.*;

public class TicTacTao {

	static Scanner input = new Scanner(System.in);
	static char CPU;
	
	public static void main(String[] args) {
	
		System.out.println("TICTACTOE GAME");
	
		char Player = SelectPlayer();
		PrintBoard();
		
		int Turn = SelectTurn(Player);
		
	}
	
	public static char SelectPlayer() {
		
		Random randomPlayer = new Random();
		int x = randomPlayer.nextInt(2)+1;
		
		if(x == 1) {
			System.out.println("[X] You | [O] CPU");
			CPU = 'O';
			return 'X';
		}else {
			System.out.println("[X] CPU | [O] You");
			CPU = 'X';
			return 'O';
		}

	}
	
	public static int SelectTurn(char Player) {
		
		Random randomTurn = new Random();
		int x = randomTurn.nextInt(9)+1;
		
		if(CPU == 'X') {
			
		}
		
		System.out.print("["+Player+"] Select Turn => ");
		int y = input.nextInt();
		
		return x;
	}
	
	public static void PrintBoard() {
		char[][] board = {
				
				{'1', '2', '3'},
				{'4', '5', '6'},
				{'7', '8', '9'}
				
		};
		
		for(int y = 0; y < 3; y++) {
			
			System.out.print("\t");
			
			for(int x = 0; x < 3; x++) {
				System.out.print(board[y][x]);
				System.out.print("  ");
			}
			System.out.println();
		}
	}
	
}
