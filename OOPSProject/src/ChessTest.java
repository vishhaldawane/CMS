
public class ChessTest {
	public static void main(String[] args) {
		Chess chess = new WebBasedGraphicalChess();
	chess.moveKnight();
		
	
		
		
		
		chess = new Chess();
		
	chess.moveKnight();
		
		
		chess = new GraphicalChess();
		
	chess.moveKnight();
	}
}

class Chess //Piyush
{
	void moveKnight() {//BOSS
		System.out.println("Moving Knight L-Shape....any direction...");
	}
}

class GraphicalChess extends Chess //Pranav
{
		//CHILD
	

	
}

class WebBasedGraphicalChess extends GraphicalChess //Kedar
{
	//GRAND CHILD
	

}
