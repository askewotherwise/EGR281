package edu.mtc.egr281.sumswamp;

public class GameBoard {

	// CONSTANTS
	
	// FIELDS
	BoardSpace boardSpace[] = new BoardSpace[41];
	
	// CONSTRUCTORS
	public GameBoard() {
		this.createGameBoard();
	} // end default constructor
	
	// METHODS
	
	//public BoardSpace(int newSpaceNumber, int newShortCut, String newEvensOrOdds, int newNumberSpace) {
		
	private void createGameBoard() {
		
		boardSpace[1] = new BoardSpace(1, 0, "neither", 0);
		boardSpace[2] = new BoardSpace(2, 0, "evens", 0);
		boardSpace[3] = new BoardSpace(3, 0, "neither", 2);	
		boardSpace[4] = new BoardSpace(4, 0, "neither", 0);
		boardSpace[5] = new BoardSpace(5, 0, "neither", 0);
		boardSpace[6] = new BoardSpace(6, 14, "neither", 0);
		boardSpace[7] = new BoardSpace(7, 0, "neither", 0);
		boardSpace[8] = new BoardSpace(8, 0, "odds", 0);
		boardSpace[9] = new BoardSpace(9, 0, "neither", 0);	
		boardSpace[10] = new BoardSpace(10, 0, "neither", 0);
		boardSpace[11] = new BoardSpace(11, 0, "neither", 3);
		boardSpace[12] = new BoardSpace(12, 0, "neither", 6);
		boardSpace[13] = new BoardSpace(13, 0, "neither", 0);
		boardSpace[14] = new BoardSpace(14, 0, "evens", 0);
		boardSpace[15] = new BoardSpace(15, 21, "neither", 0);	
		boardSpace[16] = new BoardSpace(16, 0, "evens", 0);
		boardSpace[17] = new BoardSpace(17, 0, "neither", 0);
		boardSpace[18] = new BoardSpace(18, 0, "neither", 1);
		boardSpace[19] = new BoardSpace(19, 0, "neither", 0);
		boardSpace[20] = new BoardSpace(20, 0, "evens", 0);
		boardSpace[21] = new BoardSpace(21, 0, "neither", 0);	
		boardSpace[22] = new BoardSpace(22, 0, "neither", 0);
		boardSpace[23] = new BoardSpace(23, 0, "neither", 0);
		boardSpace[24] = new BoardSpace(24, 14, "neither", 0);
		boardSpace[25] = new BoardSpace(25, 0, "neither", 5);	
		boardSpace[26] = new BoardSpace(26, 0, "neither", 0);
		boardSpace[27] = new BoardSpace(27, 0, "neither", 3);
		boardSpace[28] = new BoardSpace(28, 0, "neither", 0);	
		boardSpace[29] = new BoardSpace(29, 0, "neither", 0);
		boardSpace[30] = new BoardSpace(30, 0, "neither", 0);
		boardSpace[31] = new BoardSpace(31, 0, "neither", 0);	
		boardSpace[32] = new BoardSpace(32, 0, "odds", 0);
		boardSpace[33] = new BoardSpace(33, 0, "neither", 3);
		boardSpace[34] = new BoardSpace(34, 0, "neither", 0);
		boardSpace[35] = new BoardSpace(35, 0, "neither", 0);
		boardSpace[36] = new BoardSpace(36, 0, "evens", 0);
		boardSpace[37] = new BoardSpace(37, 0, "neither", 2);
		boardSpace[38] = new BoardSpace(38, 0, "neither", 0);
		boardSpace[39] = new BoardSpace(39, 0, "neither", 0);
		boardSpace[40] = new BoardSpace(40, 0, "neither", 0);
		
		
	} // end method createGameBoard
	
	public void printGameBoard() {
		for(int i = 1; i < 40; ++i) {
			boardSpace[i].printSpaceInfo();
		}
	} // end method printGameBoard
	
	
	 
	
	
} // end class GameBoard
