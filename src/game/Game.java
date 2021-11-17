package game;



import java.util.ArrayList;

import model.Pion;
import utilitaires.Utilitaires;

public class Game {

	String [][] board=new String[10][10];
	ArrayList<Pion> alP=new ArrayList<Pion>();
	public void game() {
		Utilitaires.draw_Board(board);

		Utilitaires.add_Pieces_To_List(alP);
		Utilitaires.add_Pieces_To_Board(alP, board);
		Utilitaires.read_Board(board);
	}
}
