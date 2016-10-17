
public interface Player{

	
	/**
	 * Initialize board.
	 * @param board
	 */
	public void initBoard(char[][] board);
	
	/**
	 * Set board's element at coordinate c to the result.
	 * @param c
	 * @param result
	 */
	public void setBoardB(Coordinate c, char result);
	
	
	
	/**
	* This player is being fired upon. Given a coordinate, updates board(s) accordingly.
	* 
	* @param x - the coordinate that is being fired upon
	* @return M for miss, otherwise the ship's char representation
	*/
	public char fireUpon(Coordinate x);

	/**
	* Returns a coordinate that this player wishes to guess.
	* 
	* 
	* @return A coordinate object 
	*/
	public Coordinate fire();
	
	/**
	* Callback method to notify player whether last fire() attempt was successful or not.
	*  
	* @param result 'M' if the last fire() resulted in a miss, otherwise the character code of the ship
	*/
	public void fireResult(char result);
	
	/**
	* Places all the ships for this player
	*/
	public void placeShips();
	
	
	
	/**
	 * Checks if there is an overlap or not, while placing ships.
	 * @param placement
	 * @param row
	 * @param col
	 * @param board
	 * @param shipSize
	 * @return
	 */
	
	public void printingBoard(char[][] board);
	
	/**
	* Returns if opponent has lost 
	*
	* @return true if opponent has lost, false otherwise
	*/
	public boolean lost();
	
	/**
	* Prints this player's Board B. 
	*
	*/
	public void printBoard();
}