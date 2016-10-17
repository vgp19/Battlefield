
public class Battleship {
	public static void main(String[] args){
		
		
		
		
		Player p1=new AIPlayer_vgp19();
		
		Player p2=new Player_vgp19();
		
		System.out.println("Player 1, deploy your ships.");
		p1.placeShips();
		System.out.println("All ships have been deployed by Player 1.");
		
		System.out.println("Player 2, deploy your ships.");
		p2.placeShips();
		System.out.println("All ships have been deployed by Player 2.");
		
		char result;
		Coordinate c;
		
		while(!p1.lost()&&!p2.lost()){
			
			System.out.println("Player 1, enter your fire coordinates on this board.");
			p1.printBoard();
		do{
		c = p1.fire();
		result=p2.fireUpon(c);
		p1.setBoardB(c, result);
		p1.printBoard();
		
			
		
		}while(result!='M'&&!p2.lost());
		if(p2.lost()){
			System.out.println("Player 1 won the game.");
			System.out.println("Player 2, better luck next time.");
			break;
		}
		
		System.out.println("Player 2, enter your fire coordinates on this board.");
		p2.printBoard();
		do{
			c=p2.fire();
			result=p1.fireUpon(c);
			p2.setBoardB(c, result);
			p2.printBoard();
			
			
		}while(result!='M'&&!p1.lost());
		if(p1.lost()){
			System.out.println("Player 2 won the game.");
			System.out.println("Player 1, better luck next time.");
			break;
		}
		
		}
	}
}


