
public class FinalMethodTest {
	public static void main(String[] args) {
		//Chess chess = new Chess();
		//chess.moveKnight();
		//GraphicalChess chess = new GraphicalChess();
		//chess.moveKnight();
		
		PlaygroundChess chess = new PlaygroundChess();
		chess.moveKnight();
	}
}

final class Chess
{
	final void moveKnight() { //Sandeep
		System.out.println("Chess:moveKnight: moving the knight in L shape...doing math logic...");
	}
}

class GraphicalChess extends Chess
{
	void moveKnight() { //Manan
		super.moveKnight();
		System.out.println("+ GraphicalChess:moveKnight: moving the knight in L shape...on graphics screen");
	
	}
}

class PlaygroundChess extends Chess
{
	void moveKnight() { //Piyush
		super.moveKnight();
		System.out.println("moving the knight (real horse) in L Shape on the ground....");
	}
}



